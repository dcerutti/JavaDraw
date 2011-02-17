package jdpatest;
	 		 	
import com.sun.jdi.Field;
import com.sun.jdi.ReferenceType;
import com.sun.jdi.VirtualMachine;
import com.sun.jdi.event.ClassPrepareEvent;
import com.sun.jdi.event.EventQueue;
import com.sun.jdi.event.EventSet;
import com.sun.jdi.event.ModificationWatchpointEvent;
import com.sun.jdi.event.VMDeathEvent;
import com.sun.jdi.event.VMDisconnectEvent;
import com.sun.jdi.request.ClassPrepareRequest;
import com.sun.jdi.request.EventRequestManager;
import com.sun.jdi.request.ModificationWatchpointRequest;
import com.sun.tools.attach.AgentInitializationException;
import com.sun.tools.attach.AgentLoadException;	 	
import com.sun.tools.attach.AttachNotSupportedException;
import java.io.IOException;




	 	

	 	
/**
	 	
 *
	 	
 *
	 	
 * The problem with the loading the agent part was that the port was originally set to 5000.
	 	
 * However, we don't know if that is the correct port so taking it out makes it find one that is
	 	
 * open and sets it itself. Now, when we build it, it will be successful. 
	 	
 */
	 	
public class JDPAtest {	 	

	 	
    /**
	 	
     * http://download.oracle.com/javase/6/docs/jdk/api/attach/spec/com/sun/tools/attach/VirtualMachine.html
	 	
     */
  public static final String CLASS_NAME = "Interesting";
  public static final String FIELD_NAME = "head";
	 	
    public static void main(String[] args) throws AttachNotSupportedException, IOException, AgentLoadException, AgentInitializationException, InterruptedException
	 	
    {
	 	
         // attach to target VM
	 	
   //port 2281 was the PID used in my TicTacToe Program and it worked.

   VirtualMachine vm = new VMAcquirer().connect(8000);



    // process events

    EventQueue eventQueue = vm.eventQueue();
    while (true) {
      EventSet eventSet = eventQueue.remove();
      for ( com.sun.jdi.event.Event event : eventSet) {
        if (event instanceof VMDeathEvent
            || event instanceof VMDisconnectEvent) {
          // exit
          return;
        } else if (event instanceof ClassPrepareEvent) {
          // watch field on loaded class
          ClassPrepareEvent classPrepEvent = (ClassPrepareEvent) event;
          ReferenceType refType = classPrepEvent
              .referenceType();
          addFieldWatch((VirtualMachine) vm,refType);
        } else if (event instanceof ModificationWatchpointEvent) {
          // a Test.foo has changed
          ModificationWatchpointEvent modEvent = (ModificationWatchpointEvent) event;
          System.out.println("old="
              + modEvent.valueCurrent());
          System.out.println("new=" + modEvent.valueToBe());
          System.out.println();
        }
      }
      eventSet.resume();
    }
    }
	 	
  private static void addClassWatch(VirtualMachine vm) {
    EventRequestManager erm = vm.eventRequestManager();
    ClassPrepareRequest classPrepareRequest = erm
        .createClassPrepareRequest();
    classPrepareRequest.addClassFilter(CLASS_NAME);
    classPrepareRequest.setEnabled(true);
  }

 private static void addFieldWatch(VirtualMachine vm,
      ReferenceType refType) {
    EventRequestManager erm = vm.eventRequestManager();
    Field field = refType.fieldByName(FIELD_NAME);
    ModificationWatchpointRequest modificationWatchpointRequest = erm
        .createModificationWatchpointRequest(field);
    modificationWatchpointRequest.setEnabled(true);
  }

}
	 	
