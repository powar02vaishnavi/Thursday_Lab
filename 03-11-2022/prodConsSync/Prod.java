/*WAP using Synchronized Threads, which demonstrates Producer Consumer concept.
Producer Consumer problem: The producer-consumer problem is the classical concurrency of a multi process synchronization problem.
It is also known as bound-buffer problem. The problem describes two processes, the producer and the consumer, who share a common,
fixed-size buffer used as a queue. The producer generates a piece of data, put it into the buffer and starts again.*/

package prodConsSync;
class Prod extends Thread
{
      private Shop Shop;
      private int number;
      //constructor to initialize the Shop and the number
      public Prod(Shop c, int number)
      {
            Shop = c;
            this.number = number;
      }
      public void run()
      {
            //loop to put the materials into the Shop
            for (int i = 0; i < 10; i++)
            {
                  Shop.put(i);
                  System.out.println("Produced value " + this.number+ " put: " + i);
                  //sleep for 1 second before putting the next material
                  try
                  {
                        sleep((int)(Math.random() * 100));
                  }
                  //catch the exception if the thread is interrupted
                  catch (InterruptedException ie)
                  {
                        ie.printStackTrace();
                  }
            }
      }
}
