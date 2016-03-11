package test;

import olement.LinkQueue;

public class LinkQueueTest {
	private static LinkQueue theStack;
	public static void  run(){
		theStack=new LinkQueue();
		theStack.insert(22);
		theStack.insert(33);
		theStack.insert(44);
		theStack.displayList();
		theStack.insert(55);
		theStack.insert(66);
		theStack.displayList();
		theStack.remove();
		theStack.remove();
		theStack.remove();
		theStack.displayList();
	}
}
