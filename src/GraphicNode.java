
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

	public GraphicFunction() {
	}

	@Override
	public void draw(Graphics g) {

		g.drawOval(400, 50, 50, 50);

	}

}
