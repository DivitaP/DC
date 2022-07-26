import java.rmi.*;

public class server {
    public static void main (String[] argv) {
        try {
        Naming.rebind ("Hello", new Hello ("Hello, world!"));
        System.out.println ("Hello Server is ready.");
        } catch (Exception e) {
        System.out.println ("Hello Server failed: " + e);
        }
        }
}
