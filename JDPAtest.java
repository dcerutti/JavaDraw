package jdpatest;

import com.sun.tools.attach.AgentInitializationException;
import com.sun.tools.attach.AgentLoadException;
import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachine;
import java.io.File;
import java.io.IOException;

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

        /* Right now the only way to get it to work is to manually enter the process ID (PID)
         * Easiest way: run program in terminal after compiling (in terminal):
         * $ java Interesting &
         * The & makes it run in the background, and it spits out the PID
         */
        VirtualMachine vm = VirtualMachine.attach("7464");

        // get system properties in target VM
        java.util.Properties props = vm.getSystemProperties();

        // construct path to management agent
        String home = props.getProperty("java.home");

        String agent = home + File.separator + "lib" + File.separator

            + "management-agent.jar";

	// load agent into target VM
        vm.loadAgent(agent, "com.sun.management.jmxremote");

        //detach
        vm.detach();

   }

}