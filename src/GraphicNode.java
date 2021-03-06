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
	int nodeWidth = 50;
	int nodeHeight = 30;
	
	
	public GraphicFunction() {
	}
	
	

	@Override
	public void draw(Graphics g) {

		g.setColor(c);
		if(name.length() >= 13){
			name = name.substring(0, 11);
		}
		g.drawString(name, x - 30 , y );
		g.drawOval(x - nodeWidth, y - nodeHeight, nodeWidth * 2, nodeHeight * 2);

	}

}

class GraphicObject extends GraphicNode {

	public int x, y;
	String name = "";
	public Color c = Color.red;
	int nodeWidth = 50;
	int nodeHeight = 30;

	public GraphicObject() {
	}

	@Override
	public void draw(Graphics g) {

		g.setColor(c);
		if(name.length() >= 14){
			name = name.substring(0, 11);
		}
		g.drawString(name, x - 40 , y );
		g.drawOval(x - nodeWidth, y - nodeHeight, nodeWidth * 2, nodeHeight * 2);

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

class GraphicString extends GraphicNode {
	
	String string;
	int x;
	int y;
	
	@Override
	public void draw(Graphics g) {
		
		g.drawString(string, x, y);
	}
}
