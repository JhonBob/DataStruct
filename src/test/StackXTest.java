package test;

import element.StackX;

public class StackXTest { 
	
	public static StackX theStack;
	
	public static void run(){
		theStack=new StackX(10);
		theStack.push(22);
		theStack.push(33);
		theStack.push(44);
		theStack.push(55);
		theStack.push(66);
		while(!theStack.isEmpty()){
			long value=theStack.pop();
			System.out.print(value+" ");
		}
		
		System.out.println();
		System.out.print(theStack.isEmpty());
	}
}
