package javadraw;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Vector;

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

    Vector<TreeType> tt = new Vector<TreeType>();
    
    public void paint(Graphics g){
    	for(TreeType trees : tt){
            trees.draw(g);
        }
    }

}
