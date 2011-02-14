import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Vector;

/*..
 * This class is meant to set the size of the canvas,
 * then print all of the data.
 */

public class DrawTree extends Canvas {

	public DrawTree() {
		setSize(800, 600);
	}

	// Prevents flicker
	@Override
	public void update(Graphics g) {
		Image on = createImage(getWidth(), getHeight());
		print(on.getGraphics());
		g.drawImage(on, 0, 0, this);

	}

	// Sample Tree
	Node test = JavaDrawMain.BuildSampleTree();

	// WE NEED TO BUILD THE VECTOR OF TREE TYPES SOMEWHAT
	// LIKE THIS
	// Vector holds all the trees - this might need to be a graph

	Vector<GraphicNode> gnList = new Vector<GraphicNode>();

	/*
	 * Builds sample list
	 */
	public void BuildGnList() {

		traverse(JavaDrawMain.BuildSampleTree(), 50, 50, 1);
	}

	public void traverse(Node node, int x, int y, int level) {

		if (node.nodeType == NODETYPE.FUNCTION) {

			GraphicFunction gF = new GraphicFunction();
			gF.x = x;
			gF.y = y;
			gF.name = node.name;

			gnList.add(gF);

		} else {

			GraphicObject gO = new GraphicObject();
			gO.x = x;
			gO.y = y;
			gO.name = node.name;

			gnList.add(gO);

		}
		int count = 1;
		int newy = 0;
		int newx = 0;
		
		GraphicLine gL = new GraphicLine();
		gL.x1 = x;
		gL.y1 = y + 25;
		gL.x2 = x;
		gL.y2 = gL.y1;
		
		for (Node child : node.children) {

			newx = x + 50;
			newy = y + (50 * level) * count;
			gL.y2 = newy;
			
			GraphicLine gAcross = new GraphicLine();
			gAcross.x1 = x;
			gAcross.y1 = newy;
			gAcross.x2 = newx - 25;
			gAcross.y2 = newy;
			gnList.add(gAcross);
			
			traverse(child, newx , newy , level++);		
			
			for (Node subchild : child.children) {
				count  = count * level;
			}
			
		}
		gnList.add(gL);
		
	}

	// paints all of our data
	@Override
	public void paint(Graphics g) {

		for (GraphicNode gN : gnList) {
			gN.draw(g);
		}

	}

}
