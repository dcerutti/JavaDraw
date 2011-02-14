import java.util.Properties;
import java.io.File;
import java.io.IOException;
import com.sun.tools.attach.AgentInitializationException;
import com.sun.tools.attach.AgentLoadException;
import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachine;
public class Trace {
	public static void main(String[] args) throws AttachNotSupportedException, IOException, AgentLoadException, AgentInitializationException{
	    // attach to target VM
	    VirtualMachine vm = VirtualMachine.attach("2177");
	
	    // get system properties in target VM
	    Properties props = vm.getSystemProperties();
	
	    // construct path to management agent
	    String home = props.getProperty("java.home");
	    String agent = home + File.separator + "lib" + File.separator 
	        + "management-agent.jar";
	
	    // load agent into target VM
	    vm.loadAgent(agent, "com.sun.management.jmxremote.port=5000");
	
	    // detach
	    vm.detach();
    }
}