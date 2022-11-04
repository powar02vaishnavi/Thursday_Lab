/*WAP which will generate the threads: 
- To display 10 terms of Fibonacci series.
- To display 1 to 10 in reverse order.*/

package threadFibRev;
class Fib extends Thread
{
     //method to display the fibonacci series
     public void run()
     {
          try
          {
               //variable to store the first number
               int a=0, b=1, c=0, n=10;
               System.out.println("Fibonacci series first 10 terms are :");
               //loop to display the fibonacci series
               while (n>0)
               {
                    System.out.print(c+" ");
                    a=b;
                    b=c;
                    c=a+b;
                    n=n-1;
               }
          }
          //catch exception
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}
