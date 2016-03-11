package test;

import element.FirstLastLink;

public class FirstLastLinkTest {
	
	private static FirstLastLink theLink;
	
	public static void run(){
		theLink=new FirstLastLink();
		theLink.insertFirst(22);
		theLink.insertFirst(44);
		theLink.insertFirst(66);
		theLink.insertLast(11);
		theLink.insertLast(33);
		theLink.insertLast(55);
		theLink.displayList();
		theLink.deleteFirst();
		theLink.deleteFirst();
		theLink.displayList();
	}  

}
