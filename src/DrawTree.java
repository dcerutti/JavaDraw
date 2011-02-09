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
		if (test.name == "Function") {

			GraphicFunction e = new GraphicFunction();
			gnList.add(e);
		}

	}

	// paints all of our data
	public void paint(Graphics g) {

		for (GraphicNode gN : gnList) {
			gN.draw(g);
		}

	}

}
