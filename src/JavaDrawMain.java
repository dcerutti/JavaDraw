import java.awt.BorderLayout;
import java.awt.Frame;

public class JavaDrawMain {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		Node head = BuildSampleTree(); // Builds Sample Tree
		PrintBadTree(head, 0); //Prints Sample Tree

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

                while(true){
                    drawArea.repaint(); //Draw it
                }

	}

	/*
	 * 
	 * This Functions Builds a BAD Sample Tree
	 * 
	 */
	static Node BuildSampleTree() {

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
