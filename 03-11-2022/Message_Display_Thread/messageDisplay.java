/*WAP that creates 2 threads - each displaying a message (Pass the message as a parameter to the constructor).
The threads should display the messages continuously till the user presses any key.*/

package messageDisplayThread;
import java.io.*;
public class messageDisplay
{
    public static void main(String[] args) throws IOException
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //constructing the threads
        Thread1 t1 = new Thread1("Hello");
        Thread1 t2 = new Thread1("World!");
        //starting the threads
        t1.start();
        t2.start();
        //waiting for the user to press any key
        System.out.println("Press Enter to exit");
		String s = br.readLine();
        //stopping the threads
		System.exit(0);
    }
}
