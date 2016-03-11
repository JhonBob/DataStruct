package test;

import element.FirstLastLink;

public class FirstLastLinkTest {
	
	private static FirstLastLink theLink;
	
	public static void run(){
		theLink=new FirstLastLink();
		theLink.insertFirst((long) 22);
		theLink.insertFirst((long) 44);
		theLink.insertFirst((long) 66);
		theLink.insertLast((long) 11);
		theLink.insertLast((long) 33);
		theLink.insertLast((long) 55);
		theLink.displayList();
		theLink.deleteFirst();
		theLink.deleteFirst();
		theLink.displayList();
	}  

}
