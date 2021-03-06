import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.ScrollPane;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.util.Vector;

/*..
 * This class extends ScrollPane. We then create an instance of an internal
 * class called OurCanvas. We then add the Canvas to the Scrollpane.
 * This gives us the scroll functionality.
 */

public class DrawTree extends ScrollPane {
	Canvas c;
	
	/*..
	 * New constructor for drawtree makes a canvas and scrollpane
	 */
	public DrawTree() {
		
		setSize(801,601);
		c = new OurCanvas();
		c.setSize(8, 6);
		add(c);
		AdjustmentListener AL = new MyAdjustmentListener();
		/*..
		 * The Adjustment listeners referenced here are used
		 * so that everytime the scrollbar moves the canvas
		 * is repainted.
		 */
		getVAdjustable().addAdjustmentListener(AL);
		getHAdjustable().addAdjustmentListener(AL);
		
	}


	// Sample Tree
	Node test = JavaDrawMain.BuildSampleTree();
	Vector<GraphicNode> gnList = new Vector<GraphicNode>();
	Vector<GraphicLoop> loopList = new Vector<GraphicLoop>();

	int globalLevel = 1;
	int furthestNodeX;
	int furthestLoopX = -1;
	int furthestNodeY = -1;
	
	/*..
	 * This function resets everything used
	 * on re-initializations 
	 */
	public void reset(){
		globalLevel = 1;
		furthestLoopX = -1;
		furthestNodeX = -1;
		furthestNodeY = -1;
		
		gnList.clear();
		loopList.clear();
		
	}
	
	/*..
	 * This function is important because as the tree grows
	 * larger in its x and y directions we update the size
	 * of the canvas to fit everything
	 */
	public void updateCanvasSize(){
		
		int x = 800;
		int y = 600;
		
		int testX;
		if(furthestLoopX >= furthestNodeX){
			testX = furthestLoopX;
		}else{
			testX = furthestNodeX;
		}
		
		if(testX + 50 > x) {
			x = testX + 50;
		}
		
		if(furthestNodeY + 50 > y){
			y = furthestNodeY + 50;
		}
		
		
		c.setSize( x , y);
		c.repaint();
		repaint();
	}
	

	/*
	 * Builds sample list
	 */
	public void BuildGnList(int nodeWidth, int nodeHeight, Node head) {

		traverse(head, 100, 60, 100, 60);
	}

	public void init(){
		c.setSize(800, 600);
		GraphicString gS = new GraphicString();
		gS.string = "Please Select: File -> DebugProcess";
		gS.x = 325;
		gS.y = 295;
		gnList.add(gS);
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

			
			if(node.setPurple){
				gF.c = Color.magenta;
			}
		
			gF.name = node.type + "  " +  node.value;
			
			
			gnList.add(gF);
			
			GraphicString gS = new GraphicString();
			gS.string = node.name;
			gS.x = gF.x - nodeWidth - 30;
			gS.y = gF.y - 5;
			gnList.add(gS);
		

		} else {
			
			if (x >= furthestNodeX) {
				furthestNodeX = x;

				int newX = furthestNodeX + (nodeWidth / 2) + 150;
				for (GraphicLoop loop : loopList) {
					loop.update(newX);
					furthestLoopX = newX;
					newX += 10;
				}

			}
			

			GraphicObject gO = new GraphicObject();
			gO.x = x;
			gO.y = y;
			gO.name = node.type + "  " + node.value;

			gnList.add(gO);
			
			GraphicString gS = new GraphicString();
			gS.string = node.name;
			gS.x = gO.x - nodeWidth - 30;
			gS.y = gO.y - 5;
			gnList.add(gS);

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
				
				GraphicString gS = new GraphicString();
				gS.x = gLoop.x1 + 50;
				gS.y = gLoop.y1 - 5;
				
				gS.string = node.nameTwo;
				
				gnList.add(gS);

			} else {

				globalLevel++;

				newx = x + nodeWidth + 50;
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

				if( newy >= furthestNodeY) { furthestNodeY = newy; }
				traverse(child, newx, newy, nodeWidth, nodeHeight);

			}

		}

		gnList.add(lineDown);
		updateCanvasSize();
		
	}
	
	public void loopFill(){
		System.out.println("FURTHEEST NODE IS... " + furthestNodeX);
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


		for(int i = 0; i < gnList.size(); i++){
			GraphicNode gN = gnList.get(i);
			gN.draw(g);
		}

	}

}

class MyAdjustmentListener implements AdjustmentListener{

		//Everytime a scrollbar is moved repaint the canvas.
		
		public void adjustmentValueChanged(AdjustmentEvent move) {
			
			if(move.getValueIsAdjusting()){
				c.repaint();
				repaint();
				updateCanvasSize();
			}
			
		}
		
		
}
	
}
