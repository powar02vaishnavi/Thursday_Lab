/*WAP using Synchronized Threads, which demonstrates Producer Consumer concept.
Producer Consumer problem: The producer-consumer problem is the classical concurrency of a multi process synchronization problem.
It is also known as bound-buffer problem. The problem describes two processes, the producer and the consumer, who share a common,
fixed-size buffer used as a queue. The producer generates a piece of data, put it into the buffer and starts again.*/


package prodConsSync;
public class ProdCons
{
      public static void main(String[] args)
      {
            //create a Shop object
            Shop c = new Shop();
            //create a producer and consumer thread
            Prod p1 = new Prod(c, 1);
            Cons c1 = new Cons(c, 1);
            //start the threads
            p1.start();
            c1.start();
      }
}
