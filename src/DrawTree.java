import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.ScrollPane;
import java.util.Vector;

/*..
 * This class now extends Applet. I created an internal class below called "OurCanvas"
 * OurCanvas extends canvas which is where our drawing takes place. Since draw tree is an 
 * Applet we can now add a scrollbar feature, you can't add a scroll pane to a canvas and
 * for some reason adding it to a frame wasn't working.
 */

public class DrawTree extends Applet {
	Canvas c;
	ScrollPane s;
	
	/*..
	 * New constructor for drawtree makes a canvas and scrollpane
	 */
	public DrawTree() {
		setLayout(new BorderLayout());
		s = new ScrollPane();
		s.setSize(100,100);
		add("Center", s);
		c = new OurCanvas();
		c.setSize(800, 600);
		s.add(c);
		
		
	}


	// Sample Tree
	Node test = JavaDrawMain.BuildSampleTree();
	Vector<GraphicNode> gnList = new Vector<GraphicNode>();
	Vector<GraphicLoop> loopList = new Vector<GraphicLoop>();

	int globalLevel = 1;
	int furthestNodeX;
	int furthestLoopX = -1;

	/*
	 * Builds sample list
	 */
	public void BuildGnList(int nodeWidth, int nodeHeight) {

		traverse(JavaDrawMain.BuildSampleTree(), 50, 50, nodeWidth, nodeHeight);
	}

	/*
	 * Creates Graphics Nodes from node tree and sets proper x,y cords.
	 */
	public void traverse(Node node, int x, int y, int nodeWidth, int nodeHeight) {

		if (node.nodeType == NODETYPE.FUNCTION) {

			GraphicFunction gF = new GraphicFunction();
			gF.x = x;
			gF.y = y;

			if (x >= furthestNodeX) {
				furthestNodeX = x;

				int newX = furthestNodeX + (nodeWidth / 2) + 150;
				for (GraphicLoop loop : loopList) {
					loop.update(newX);
					furthestLoopX = newX;
					newX += 10;
				}

			}

			gF.name = node.name;

			gnList.add(gF);

		} else {

			GraphicObject gO = new GraphicObject();
			gO.x = x;
			gO.y = y;
			gO.name = node.name;

			gnList.add(gO);

		}

		node.graphicX = x;
		node.graphicY = y;
		node.visited = true;

		int newy = 0;
		int newx = 0;

		// Line Down from Object
		GraphicLine lineDown = new GraphicLine();
		lineDown.x1 = x;
		lineDown.y1 = y + (nodeHeight / 2);
		lineDown.x2 = x;
		lineDown.y2 = lineDown.y1;

		for (Node child : node.children) {

			if (child.visited) {

				GraphicLoop gLoop = new GraphicLoop();
				gLoop.x1 = x;
				gLoop.y1 = y + (nodeHeight / 2);

				if (furthestLoopX == -1) {
					gLoop.x2 = furthestNodeX + (nodeWidth / 2) + 150;
					furthestLoopX = gLoop.x2;
				} else {
					gLoop.x2 = furthestLoopX + 10;
					furthestLoopX = gLoop.x2;
				}

				gLoop.y2 = gLoop.y1;

				gLoop.x3 = gLoop.x2;
				gLoop.y3 = child.graphicY;

				gLoop.x4 = child.graphicX + (nodeWidth / 2);
				gLoop.y4 = child.graphicY;

				gnList.add(gLoop);
				loopList.add(gLoop);

			} else {

				globalLevel++;

				newx = x + nodeWidth;
				newy = (globalLevel * nodeHeight) + (globalLevel * 5);
				lineDown.y2 = newy;

				// Line from main branch to new node
				GraphicLine lineAcross = new GraphicLine();
				lineAcross.x1 = x;
				lineAcross.y1 = newy;
				lineAcross.x2 = newx - (nodeWidth / 2);
				lineAcross.y2 = newy;
				gnList.add(lineAcross);

				GraphicLine ar1 = new GraphicLine();
				ar1.x1 = lineAcross.x2;
				ar1.y1 = lineAcross.y2;
				ar1.x2 = ar1.x1 - 8;
				ar1.y2 = ar1.y1 - 8;

				GraphicLine ar2 = new GraphicLine();
				ar2.x1 = lineAcross.x2;
				ar2.y1 = lineAcross.y2;
				ar2.x2 = ar2.x1 - 8;
				ar2.y2 = ar2.y1 + 8;

				gnList.add(ar1);
				gnList.add(ar2);

				traverse(child, newx, newy, nodeWidth, nodeHeight);

			}

		}

		gnList.add(lineDown);

	}

	/*..
	 * This class extends canvas and is where the drawing all takes place.
	 * The code in main changed to drawArea.c.repaint();
	 */
	class OurCanvas extends Canvas {
		
	OurCanvas(){ super(); }
	
	// Prevents flicker
	@Override
	public void update(Graphics g) {
		Image on = createImage(getWidth(), getHeight());
		print(on.getGraphics());
		g.drawImage(on, 0, 0, this);

	}
	
	// paints all of our data
	@Override
	public void paint(Graphics g) {

		for (GraphicNode gN : gnList) {
			gN.draw(g);
		}

	}

}
	
}
