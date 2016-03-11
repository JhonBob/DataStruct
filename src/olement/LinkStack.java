package olement;

import implement.Stack;
import element.Link;
import element.LinkList;
//链表实现栈
public  class LinkStack implements Stack<Long> {
	public LinkList theList;
	public LinkStack(){
		theList=new LinkList();
	}
	@Override
	public void push(Long j) {
		// TODO Auto-generated method stub
		theList.insertFirst(j);
	}
	@Override
	public Long pop() {
		// TODO Auto-generated method stub
		return (Long) theList.deleteFirst().iData;
	}
	@Override
	public Long peek() {
		// TODO Auto-generated method stub
		return (Long) theList.deleteFirst().iData;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return theList.isEmpty();
	}
	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}
	
	//打印
	public void displayList(){
		System.out.print("all");
		theList.displayList();
		System.out.println("---------------------------------");
	}
	
}
