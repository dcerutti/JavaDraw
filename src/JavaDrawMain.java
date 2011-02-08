

import java.awt.BorderLayout;
import java.awt.Frame;

public class JavaDrawMain {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

                //Builds a Frame with a Close 'X' Option
                Frame myframe = new Frame("Draw File");
                myframe.setSize(800,600);
                myframe.addWindowListener(new Closer());

                //Makes a Canvas
                DrawTree drawArea = new DrawTree();
                myframe.add(drawArea, BorderLayout.CENTER);

                //Make that shit visible
                myframe.pack();
                myframe.setVisible(true);
                
                Node head = drawArea.BuildSampleTree(); // Builds Sample Tree
        		PrintBadTree(head, 0); //Prints Sample Tree
                
                while(true){
                    drawArea.repaint(); //Draw it
                }

	}

	/*
	 * 
	 * This Function prints the tree in a BAD way
	 * 
	 * Objects are in Parenthesis and Functions in indented on the next line.
	 */
	static void PrintBadTree(Node start, int level) {
		Node head = start;
		System.out.println();

		for (int i = 0; i < level; i++) {
			System.out.print("\t");
		}

		System.out.print(head.name + "(");

		for (Node objects : head.children) {
			if (objects.nodeType == NODETYPE.OBJECT) {
				System.out.print(objects.name + ",");
			}
		}

		System.out.print(")");

		for (Node functions : head.children) {
			if (functions.nodeType == NODETYPE.FUNCTION) {
				PrintBadTree(functions, level + 1);
			}
		}

	}

}
