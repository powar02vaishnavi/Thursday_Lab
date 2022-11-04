/*WAP using Synchronized Threads, which demonstrates Producer Consumer concept.
Producer Consumer problem: The producer-consumer problem is the classical concurrency of a multi process synchronization problem.
It is also known as bound-buffer problem. The problem describes two processes, the producer and the consumer, who share a common,
fixed-size buffer used as a queue. The producer generates a piece of data, put it into the buffer and starts again.*/

package prodConsSync;
class Shop
{
      private int materials;
      private boolean available = false;
      //method to put the materials into the Shop
      public synchronized int get()
      {
            //if no materials are available, wait
            while (available == false)
            {
                  try
                  {
                        wait();
                  }
                  catch (InterruptedException ie)
                  {
                  }
            }
            //if materials are available, get them
            available = false;
            //notify the producer that the materials have been taken
            notifyAll();
            return materials;
      }
      public synchronized void put(int value)
      {
            //if materials are available, wait
            while (available == true)
            {
                  try
                  {
                        wait();
                  }
                  catch (InterruptedException ie)
                  {
                        ie.printStackTrace();
                  }
            }
            //if no materials are available, put the materials
            materials = value;
            //set the flag to true to indicate that materials are available
            available = true;
            //notify the consumer that the materials are available
            notifyAll();
      }
}
