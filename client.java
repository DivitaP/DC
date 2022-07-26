import java.rmi.*;

public class client {
    /**
* Client program for the &quot;Hello, world!&quot; example.
* @param argv The command line arguments which are ignored.
*/
public static void main (String[] argv) {
    try {
    HelloInterface hello =
    (HelloInterface) Naming.lookup ("//ortles.ccs.neu.edu/Hello");
    System.out.println (hello.say());
    } catch (Exception e) {
    System.out.println ("HelloClient exception: " + e);
    }
    }
}
