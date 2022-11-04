/*WAP which will generate the threads: 
- To display 10 terms of Fibonacci series.
- To display 1 to 10 in reverse order.*/

package threadFibRev;
class Run
{
     public static void main(String[] args)
     {
          try
          {
               //creating and starting the threads for the fibonacci series
               Fib fib = new Fib();
               fib.start();
               //waiting 1 second
               fib.sleep(1000);
               //creating and starting the threads for the reverse series
               Rev rev = new Rev();
               rev.start();
          }
          //catch exception
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}
