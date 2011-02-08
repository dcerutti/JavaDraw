import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*..
 * Class implements the (x) to close the window
 * 
 */

class Closer extends WindowAdapter{
		
 	
    @Override   
    public void windowClosing(WindowEvent e)    //Closes window when called
 	{
 	
 		System.out.println("Goodbye");      //Prints Goodbye to System
 		System.exit(0);
 	} 
   
}
