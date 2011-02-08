<<<<<<< HEAD


=======
>>>>>>> ddd7d202a57135ed184037e2170c9cb86774d50e
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Vector;

/*..
 * This class is meant to set the size of the canvas,
 * then print all of the data.
 */

public class DrawTree extends Canvas {
	
	public DrawTree(){
		setSize(800,600);
	}
	
	//Prevents flicker
    @Override
    public void update(Graphics g)
    {
        Image on = createImage(getWidth(),getHeight());
        print(on.getGraphics());
        g.drawImage(on,0,0,this);

    }
    
    //Vector holds all the trees - this might need to be a graph
    Vector<TreeType> tt = new Vector<TreeType>();
    
    //paints all of our data
    public void paint(Graphics g){
    	for(TreeType trees : tt){
            trees.draw(g);
        }
    }

}
