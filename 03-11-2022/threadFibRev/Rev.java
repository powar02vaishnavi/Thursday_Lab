/*WAP which will generate the threads: 
- To display 10 terms of Fibonacci series.
- To display 1 to 10 in reverse order.*/

package threadFibRev;
class Rev extends Thread
{
     //method to reverse the numbers
     public void run()
     {
          try
          {
               System.out.println("\nReverse is of 1 to 10 is : ");
               //loop to reverse the numbers
               for (int i=10; i >= 1 ;i-- )
               {
                    System.out.print(i+" ");
               }
          }
          //catch exception
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}
