
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
	
	public int x,y;
	String name;
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
	
	public int x,y;
	String name;
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
	
	public int x1,y1,x2,y2;
	public Color c = Color.red;

	public GraphicLine() {
	}

	@Override
	public void draw(Graphics g) {

		g.setColor(c);
		g.drawLine(x1, y1 , x2, y2 );

	}

}
