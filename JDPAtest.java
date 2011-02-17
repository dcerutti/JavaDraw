import com.sun.tools.attach.AgentInitializationException;
import com.sun.tools.attach.AgentLoadException;
import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachine;
import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.util.*;

/**
 * The problem with the loading the agent part was that the port was originally set to 5000.
 * However, we don't know if that is the correct port so taking it out makes it find one that is
 * open and sets it itself. Now, when we build it, it will be successful.
 */
	 	
public class JDPAtest {

    /**
     * http://download.oracle.com/javase/6/docs/jdk/api/attach/spec/com/sun/tools/attach/VirtualMachine.html
     */

    public static void main(String[] args) throws AttachNotSupportedException, IOException, AgentLoadException, AgentInitializationException {

        /* Testing a way to get a process ID on the fly with memory management
         *  libraries. Seemed to work pretty well. pid() function does this
         *  and is described within that function
         */
        String pid = pid(); //returns int (see function below)
        System.out.println("The process ID would be: " + pid);
        VirtualMachine vm = VirtualMachine.attach("1004");

        // get system properties in target VM
        Properties props = vm.getSystemProperties();

        // construct path to management agent
        String home = props.getProperty("java.home");

        String agent = home + File.separator + "lib" + File.separator

            + "management-agent.jar";

	// load agent into target VM
        vm.loadAgent(agent, "com.sun.management.jmxremote");

        //detach
        vm.detach();

   }

    public static String pid() {
        String pid[] = new String[2];

        //Memory management library that gets process id in the form of
        //  JVMProcessNumber@machine, e.g., 8101@localhost
        String hostName = ManagementFactory.getRuntimeMXBean().getName();

        //split string into array so we can get only the process number needed
        pid = hostName.split("@");

        return pid[0];
    }
}