package test;

import element.DoubleLinkList;

public class DoubleLinkListTest {
	private static DoubleLinkList theList;
	
	public static void run(){
		theList=new DoubleLinkList();
		theList.insertFirst(22);
		theList.insertFirst(44);
		theList.insertFirst(66);
		theList.displayForward();
		
		theList.insertLast(11);
		theList.insertLast(33);
		theList.insertLast(55);
		theList.displayForward();
		
		theList.insertAfter(44, 50);
		theList.displayForward();
		
		theList.deleteFirst();
		theList.displayForward();
		
		theList.deleteLast();
		theList.displayForward();
		
		theList.deleteKey(33);
		theList.displayForward();
		
		theList.insertLast(11);
		theList.insertFirst(66);
		theList.insertLast(55);
		theList.displayForward();
		theList.diaplayBackword();
	}
}
