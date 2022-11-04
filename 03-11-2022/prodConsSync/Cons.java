
/*WAP using Synchronized Threads, which demonstrates Producer Consumer concept.
Producer Consumer problem: The producer-consumer problem is the classical concurrency of a multi process synchronization problem.
It is also known as bound-buffer problem. The problem describes two processes, the producer and the consumer, who share a common,
fixed-size buffer used as a queue. The producer generates a piece of data, put it into the buffer and starts again.*/

package prodConsSync;
class Cons extends Thread
{
      private Shop Shop;
      private int number;
      //constructor to initialize the Shop and the number
      public Cons(Shop c, int number)
      {
            Shop = c;
            this.number = number;
      }
      public void run()
      {
            //loop to get the materials from the Shop
            int value = 0;
            for (int i = 0; i < 10; i++)
            {
                  value = Shop.get();
                  System.out.println("Consumed value " + this.number+ " got: " + value);
            }
      }
}
