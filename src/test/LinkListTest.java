package test;

import element.LinkList;

public class LinkListTest {

	private static LinkList theList;
	
	public static void run(){
		theList=new LinkList();
		theList.insertFirst(22);
		theList.insertFirst(44);
		theList.insertFirst(66);
		theList.insertFirst(55);
		theList.displayList();
		System.out.println(theList.find(44).iData);
		theList.delete(44);
		theList.displayList();
		
	}
}
