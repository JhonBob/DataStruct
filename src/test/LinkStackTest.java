package test;

import olement.LinkStack;

public class LinkStackTest {
	private static LinkStack theStack;
	public static void  run(){
		theStack=new LinkStack();
		theStack.push((long) 22);
		theStack.push((long) 33);
		theStack.push((long) 44);
		theStack.push((long) 55);
		theStack.push((long) 66);
		theStack.displayList();
		theStack.pop();
		theStack.pop();
		theStack.pop();
		theStack.displayList();
	}
	
}
