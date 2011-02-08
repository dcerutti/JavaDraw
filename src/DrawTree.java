

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
    
    
	/*
	 * 
	 * This Functions Builds a BAD Sample Tree
	 * 
	 */
	public Node BuildSampleTree() {

		Node main = new Node(NODETYPE.FUNCTION, "Main");
		Node head = main; // points to head node
		Node funtion1 = new Node(NODETYPE.FUNCTION, "FUNCTION1");
		Node funtion2 = new Node(NODETYPE.FUNCTION, "FUNCTION2");
		Node object1 = new Node(NODETYPE.OBJECT, "Square");

		main.children.add(funtion1);
		main.children.add(funtion2);
		main.children.add(object1);

		Node object2 = new Node(NODETYPE.OBJECT, "Circle");
		Node function3 = new Node(NODETYPE.FUNCTION, "Function3");
		funtion1.children.add(object2);
		funtion1.children.add(function3);
		Node object3 = new Node(NODETYPE.OBJECT, "Triagle");
		function3.children.add(object3);
		
		return head;
	}
	
	Node test = BuildSampleTree();
	
	//WE NEED TO BUILD THE VECTOR OF TREE TYPES SOMEWHAT
	//LIKE THIS
	//Vector holds all the trees - this might need to be a graph
    
	Vector<TreeType> tt = new Vector<TreeType>();
	public void BuildTreeTypes(){
		if(test.name == "Main"){
    		DrawMain e = new DrawMain();
    		tt.add(e);
    	}	
	}
    
    //paints all of our data
    public void paint(Graphics g){
    	for(TreeType trees : tt){
    		trees.draw(g);
    		}
    }

}
