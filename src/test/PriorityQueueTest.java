package test;

import element.PriorityQueue;

public class PriorityQueueTest {
	private static PriorityQueue theQueue;
	public static void run(){
		theQueue=new PriorityQueue(10);
	    theQueue.insert(30);
	    theQueue.insert(20);
	    theQueue.insert(10);
	    theQueue.insert(40);
	    theQueue.insert(70);
	    theQueue.insert(60);
	    
	    
	    System.out.println("Front:"+theQueue.peekMin());
	    
	    System.out.println("remove:"+theQueue.remove());
	    System.out.println("remove:"+theQueue.remove());
	    System.out.println("remove:"+theQueue.remove());
	    
	    System.out.println("Front:"+theQueue.peekMin());
	    
	}
}
