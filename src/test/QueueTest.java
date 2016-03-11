package test;

import element.Queue;

public class QueueTest {

	private static Queue theQueue;
	public static void run(){
		theQueue=new Queue(10);
	    theQueue.insert(10);
	    theQueue.insert(20);
	    theQueue.insert(30);
	    theQueue.insert(40);
	    theQueue.insert(50);
	    theQueue.insert(60);
	    
	    System.out.println("Front:"+theQueue.peekFront());
	    
	    System.out.println("remove:"+theQueue.remove());
	    System.out.println("remove:"+theQueue.remove());
	    System.out.println("remove:"+theQueue.remove());
	    
	    System.out.println("Front:"+theQueue.peekFront());
	    
	}
}
