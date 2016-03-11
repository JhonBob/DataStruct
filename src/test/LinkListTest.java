package test;

import element.LinkList;

public class LinkListTest {

	private static LinkList theList;
	
	public static void run(){
		theList=new LinkList();
		theList.insertFirst(22, 2.2);
		theList.insertFirst(44, 4.2);
		theList.insertFirst(66, 6.2);
		theList.insertFirst(55, 8.2);
		theList.displayList();
		System.out.println(theList.find(44).iData);
		theList.delete(44);
		theList.displayList();
		
	}
}
