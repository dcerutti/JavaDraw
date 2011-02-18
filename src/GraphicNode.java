import java.awt.Color;
import java.awt.Graphics;

/*..
 * Everything drawn will be of type GraphicNode; functions, objects etc
 * This will control all of our functions to print the same way
 */
public abstract class GraphicNode {

	public abstract void draw(Graphics G);

}

class GraphicFunction extends GraphicNode {

	public int x, y;
	String name = "";
	public Color c = Color.blue;

	public GraphicFunction() {
	}

	@Override
	public void draw(Graphics g) {

		g.setColor(c);
		g.drawString(name, x, y);
		g.drawOval(x - 25, y - 25, 25 * 2, 25 * 2);

	}

}

class GraphicObject extends GraphicNode {

	public int x, y;
	String name = "";
	public Color c = Color.red;

	public GraphicObject() {
	}

	@Override
	public void draw(Graphics g) {

		g.setColor(c);
		g.drawString(name, x, y);
		g.drawOval(x - 25, y - 25, 25 * 2, 25 * 2);

	}

}

class GraphicLine extends GraphicNode {

	public int x1, y1, x2, y2;
	public Color c = Color.red;

	public GraphicLine() {
	}

	@Override
	public void draw(Graphics g) {

		g.setColor(c);
		g.drawLine(x1, y1, x2, y2);

	}

}

class GraphicLoop extends GraphicNode {

	int x1, x2, x3, x4, y1, y2, y3, y4;

	public GraphicLoop() {
	}

	@Override
	public void draw(Graphics g) {

		// g.setColor(Color.GREEN);
		g.drawLine(x1, y1, x2, y2);
		g.drawLine(x2, y2, x3, y3);
		g.drawLine(x3, y3, x4, y4);

		// left arrow
		g.drawLine(x4, y4, x4 + 8, y4 - 8);
		g.drawLine(x4, y4, x4 + 8, y4 + 8);
	}

	public void update(int furthestLoopX) {
		x2 = furthestLoopX;
		x3 = furthestLoopX;
	}

}
