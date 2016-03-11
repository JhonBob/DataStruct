package element;

import implement.List;

//链表:效率比数组高，内存占用高
public class LinkList implements List {
	
	private Link first;
	public LinkList(){
		first=null;
	}
	
	//加结点
	@SuppressWarnings("unchecked")
	@Override
	public <T> void insertFirst(T id) {
		//新的链表结点
		Link newLink=new Link(id);
		//原结点作为新结点的下一节点
		newLink.next=first;
		//新节点作为首节点
		first=newLink;
	}
	
	public boolean isEmpty(){
		return first==null;
	}
	
	//从头删除
	@Override
	public <T> Link deleteFirst(){
		Link temp=first;
		first=first.next;
		return temp;
	}
	
	//查找
	@Override
	public <T> Link find(T key) {
		Link current=first;
		//没找到继续找，找到了跳出循环
		while(current.iData!=key){
			if(current.next==null){
				return null;
			}else{
			     current=current.next;
			}
		}
		return current;
	}
	
	//删除指定数据
	@Override
	public <T> Link delete(T key) {
		Link current=first;
		Link previous=first;
		while(current.iData!=key){
			if(current.next==null){
				return null;
			}else{
			      //继续找
				  previous=current;
			      current=current.next;
			}
		}
		//如果删除的数据是第一个
		if(current==first)
			first=first.next;
		else
			//删除
			previous.next=current.next;
		
		return  current;
	}
	
	//打印
	@Override
	public void displayList(){
		System.out.print("all");
		Link current=first;
		while(current!=null){
			current.displayLink();
			current=current.next;
		}
		System.out.println();
		System.out.println("---------------------------------");
	}

}
