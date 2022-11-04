/*WAP that creates 2 threads - each displaying a message (Pass the message as a parameter to the constructor).
The threads should display the messages continuously till the user presses any key.*/


package messageDisplayThread;
class Thread1 extends Thread
{
    String msg;
    //constructor to initialize the message
    Thread1(String msg)
    {
        this.msg = msg;
    }
    public void run()
    {
        //infinite loop to display the message continuously
        while(true)
        {
            System.out.println(msg);
            //sleep for 1 second before displaying the message again
            try
            {
                Thread.sleep(1000);
            }
            //catch the exception if the thread is interrupted
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
