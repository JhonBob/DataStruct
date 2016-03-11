package element;
//双端链表
public class FirstLastLink {
	public LLink first;//指向链表的第一个
	public LLink last;//指向链表的最后一个
	public FirstLastLink(){
		first=null;
		last=null;
	}
	public boolean isEmpty(){
		return first==null;
	}
	//头插入
	public void insertFirst(long dd){
		LLink newLink=new LLink(dd);
		if(isEmpty())
			last=newLink;
		//不为空，往头部以前加
		newLink.next=first;
		//修改指针
		first=newLink;
		
	}

	//尾插入
	public void insertLast(long dd){
		LLink newLink=new LLink(dd);
		if(isEmpty())
			//作为第一个
			first=newLink;
		else
			//往尾部后加
			last.next=newLink;
		//修改指针
		last=newLink;
	}
	
	//头删除
	public long deleteFirst(){
		long temp=first.dData;
		if(first.next==null)
			last=null;
		//删
		first=first.next;
		return temp;
	}
	

	//打印
	public void displayList(){
		System.out.print("all");
		LLink current=first;
		while(current!=null){
			current.displayLink();
			current=current.next;
		}
		System.out.println();
		System.out.println("---------------------------------");
	}

}
