package olement;

import element.FirstLastLink;
//����˫�˶���
public class LinkQueue {
	private FirstLastLink theLink;
	
	public LinkQueue(){
		theLink=new FirstLastLink();
	}
	
	public boolean isEmpty(){
		return theLink.isEmpty();
	}
	
	public void insert(long j){
		theLink.insertLast(j);
	}
	public long remove(){
		return theLink.deleteFirst();
	}
	
	//��ӡ
	public void displayList(){
		System.out.print("all");
		theLink.displayList();
		System.out.println("---------------------------------");
	}
}
