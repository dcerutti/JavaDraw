package testconnect;

import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachine;
import com.sun.xml.internal.fastinfoset.sax.Properties;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author cmoyer.student
 */
public class JDPAtest {

    /**
     * http://download.oracle.com/javase/6/docs/jdk/api/attach/spec/com/sun/tools/attach/VirtualMachine.html
     */
    public static void main(String[] args)
    {
        try
        {
            //at this point you have to manually find the process ID
            VirtualMachine vm = VirtualMachine.attach("2177");
        }

        catch (AttachNotSupportedException ex)
        {
            System.out.println("Attach Not Supported. Check That...");
            Logger.getLogger(JDPAtest.class.getName()).log(Level.SEVERE, null, ex);
        }        catch (IOException ex)
        {
            System.out.println("Input Output Error. Check That...");
            Logger.getLogger(JDPAtest.class.getName()).log(Level.SEVERE, null, ex);
        }

        //From this point on it's unclear why it doesn't quite work properly

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
