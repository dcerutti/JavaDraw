
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JavaDrawMain {

    /**
     * @param args
     */
    public static void main(String[] args) {

        /*
         * Graphics Team Code Here
         */

        // Builds a Frame with a Close 'X' Option
        Frame myframe = new Frame("Draw File");
        myframe.setSize(800, 600);

        
        myframe.addComponentListener(new FrameMovement());

        // Makes a Canvas
        DrawTree drawArea = new DrawTree();
        myframe.addWindowListener(new FrameListener());
        myframe.addWindowStateListener(new FrameMax(drawArea));
        myframe.add(drawArea, BorderLayout.CENTER);

        // Makes that frame visible
        myframe.pack();
        myframe.setVisible(true);




        // Make menubar
        MenuBar mb = new MenuBar();
        myframe.setMenuBar(mb);
        Menu m = new Menu("File");
        mb.add(m);
        MenuItem m2 = new MenuItem("Save Drawing as PNG");
        MenuItem m3 = new MenuItem("DebugProcess");
        m3.addActionListener(new DebugProcess(drawArea));
        m.add(m3);
        m.add(m2);


        m2.addActionListener(new PhotoSaver(myframe, drawArea));

        drawArea.init();
        drawArea.c.repaint();


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

        Node testOBJ = new Node(NODETYPE.FUNCTION, "TESTOBJ");

        main.children.add(testOBJ);
        testOBJ.children.add(main);
        main.children.add(funtion1);
        main.children.add(funtion2);
        main.children.add(object1);

        Node object2 = new Node(NODETYPE.OBJECT, "Circle");
        Node object2a = new Node(NODETYPE.OBJECT, "Circle Link");
        object2.children.add(object2a);
        Node object2b = new Node(NODETYPE.OBJECT, "Circle Link 2");

        object2b.children.add(funtion2);

        object2.children.add(object2b);
        Node function3 = new Node(NODETYPE.FUNCTION, "Function3");
        funtion1.children.add(object2);
        funtion1.children.add(function3);
        Node object3 = new Node(NODETYPE.OBJECT, "Triagle");
        Node object3a = new Node(NODETYPE.OBJECT, "Triagle 2");
        function3.children.add(object3);
        function3.children.add(object3a);

        function3.children.add(object2b);

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
     * Need this class here so the Frame() can be closed
     */
    static class FrameListener extends WindowAdapter {

    	
        public void windowClosing(WindowEvent e) // Closes window when called
        {
            System.out.println("Goodbye"); // Prints Goodbye to System
            System.exit(0);
        }
    }

    static class FrameMax implements WindowStateListener {
    	
    	DrawTree drawArea;
    	
    	FrameMax(DrawTree drawArea){
    		this.drawArea = drawArea;
    	}

		@Override
		public void windowStateChanged(WindowEvent arg0) {
			
    		drawArea.updateCanvasSize();
    		drawArea.repaint();
    		drawArea.c.repaint();
    		drawArea.c.validate();
			
		}
    	
    }


    static class DebugProcess implements ActionListener {

        DrawTree drawArea;

        DebugProcess(DrawTree drawArea) {
            this.drawArea = drawArea;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            int ans = JOptionPane.showConfirmDialog(drawArea, "Auto Run Target Program? (Linux Only)");

            if (ans == 0) {

//                JFrame frame = new JFrame("InputDialog");
//                String name = JOptionPane.showInputDialog(frame,
//                        "What Java file (a file ending in '.java') would you like to use?");

                /**
                 * We use JFile chooser because we don't wwant to mix between "regular"
                 * and javax.swing packages. We're allowing the user to select a file
                 * that isn't necessarily in the current working directory (i.e., the
                 * directry from where we ran the program
                 */
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Please Select a .java file you would like to use");
                fileChooser.showDialog(drawArea, "OK");

//                System.out.println("File chosen: " + fileChooser.getSelectedFile().getName());
//                System.out.println("Directory chosen: " + fileChooser.getCurrentDirectory().getAbsolutePath());

                /**
                 * getName() returns a string of the filename with extension
                 * getCurrentDirectory().getAbsolutePath() gives us the directory of the file
                 *   without the selected file on the end. We need this to compile it properly
                 * Could have created a new File() to pass them in, but this saves some memory
                 *   (admittedly only a little bit, but might as well save where we can)
                 */
                JDPAtest.getFile(fileChooser.getSelectedFile().getName(), fileChooser.getCurrentDirectory().getAbsolutePath());
                JDPAtest.getVM();
                drawArea.reset();
                drawArea.BuildGnList(50, 50, JDPAtest.getHead());
                drawArea.updateCanvasSize();
                drawArea.c.repaint();
                drawArea.validate();	//This is the GOD line fixes everything

            } else if (ans == 1) {

                JOptionPane.showMessageDialog(drawArea, "Hit OK after target program is running.");
                JDPAtest.getVM();
                drawArea.reset();
                drawArea.BuildGnList(50, 50, JDPAtest.getHead());
                drawArea.updateCanvasSize();
                drawArea.c.repaint();
                drawArea.validate();	//This is the GOD line fixes everything

            } else {
            }


        }
    }

    //Class is here so that canvas size can be update when user
    //Changes the window size
    static class FrameMovement implements ComponentListener {

        DrawTree drawArea = new DrawTree();

        @Override
        public void componentMoved(ComponentEvent move) {
            // TODO Auto-generated method stub
        }

        @Override
        public void componentHidden(ComponentEvent move) {
            // TODO Auto-generated method stub
        }

        //When the window is resized repaint and update everything
        @Override
        public void componentResized(ComponentEvent move) {
            drawArea.c.repaint();
            drawArea.repaint();
            drawArea.updateCanvasSize();

        }

        @Override
        public void componentShown(ComponentEvent move) {
            // TODO Auto-generated method stub
        }
    }

    /*
     * This function adds and ActionListener on the MenuBar to allow the image
     * on the canvas to be saved as a PNG file.
     */
    static class PhotoSaver implements ActionListener {

        Frame parent;
        DrawTree drawArea;

        public PhotoSaver(Frame parent, DrawTree drawArea) {
            this.parent = parent;
            this.drawArea = drawArea;
        }

        public void actionPerformed(ActionEvent arg0) {
            FileDialog f1 = new FileDialog(parent, "Save Image as PNG");
            f1.setMode(FileDialog.SAVE);
            f1.setVisible(true);

            String filename = f1.getFile();
            String directory = f1.getDirectory();

            try {
                BufferedImage bi = new BufferedImage(drawArea.c.getWidth(),
                        drawArea.c.getHeight(), BufferedImage.TYPE_INT_RGB); // creates
                // an
                // image
                Graphics g = bi.getGraphics(); // returns an instance of the
                // Graphics class, allowing the
                // program to draw to the image
                drawArea.c.update(g);
                File opfile = new File(directory + filename + ".png");
                ImageIO.write(bi, "png", opfile); // writes the drawing to a PNG
                // file
            } catch (IOException ioe) {
                System.out.println("Could Not Read File");
            }
        }
    }
}
