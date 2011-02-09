import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JavaDrawMain {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		TeamManager tManager = new TeamManager();
		int answer = tManager.execute();

		if (answer == 0) {
			/*
			 * Graphics Team Code Here
			 */

			// Builds a Frame with a Close 'X' Option
			Frame myframe = new Frame("Draw File");
			myframe.setSize(800, 600);
			myframe.addWindowListener(new FrameCloser());

			// Makes a Canvas
			DrawTree drawArea = new DrawTree();
			myframe.add(drawArea, BorderLayout.CENTER);

			// Makes that frame visible
			myframe.pack();
			myframe.setVisible(true);

			while (true) {
				drawArea.repaint(); // Draw it
			}

		} else if (answer == 1) {
			/*
			 * Debug Team Code Here Use this as your main()
			 */

		}else{
			Node head = BuildSampleTree();
			PrintBadTree(head, 0); // Prints Sample Tree
		}
		
		

	}

	/*
	 * Temporary
	 * 
	 * This Functions Builds a BAD Sample Tree *
	 */
	public static Node BuildSampleTree() {

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
	 * Temporary
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

	/*
	 * Button & Window Listeners
	 */
	static class FrameCloser extends WindowAdapter {

		@Override
		public void windowClosing(WindowEvent e) // Closes window when called
		{

			System.out.println("Goodbye"); // Prints Goodbye to System
			System.exit(0);
		}

	}

}
