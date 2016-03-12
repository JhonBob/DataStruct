package olement;

import element.LLink;

public class IteratorLinkList {
	 private LLink first;
	 
	 public IteratorLinkList(){
		 first=null;
	 }
	 
	 public LLink getFirst(){
		 return first;
	 }
	 
	 public void setFirst(LLink f){
		 first=f;
	 }
	 public boolean isEmpty(){
		 return first==null;
	 }
	 
	 public void displayList(){
		 LLink current=first;
		 while(current!=null){
			 current.displayLink();
			 current=current.next;
		 }
		 System.out.println();
	 }
	 
	 public ListIterator getIterator(){
		 return new ListIterator(this);
	 }
	 
}


//链表迭代器:作用：一个提供遍历功能的类或对象
    class ListIterator{
	   private LLink current;
	   private LLink previous;
	   private IteratorLinkList ourList;
	   
	   public ListIterator(IteratorLinkList list){
		   ourList=list;
	   }
	   
	   //数据重置
	   public void reset(){
		   current=ourList.getFirst();
		   previous=null;
	   }
	   
	   //是否是末尾
	   public boolean atEnd(){
		   return current.next==null;
	   }
	   
	   //下一个
	   public void nextLink(){
		   previous=current;
		   current=current.next;
	   }
	   
	   //返回当前结点
	   public LLink getCurrent(){
		   return current;
	   }
	   
	   
	   //在迭代器正在访问的连接点后插入新节点
	   public void insertAfter(long dd){
		   LLink newLink=new LLink(dd);
		   if(ourList.isEmpty()){
			   ourList.setFirst(newLink);
			   current=newLink;
		   }else{
			   //注意先后关系
			   newLink.next=current.next;
			   current.next=newLink;
			   nextLink();
		   }
	   }
	   
	   //在current之前插入
	   public void insertBefore(long dd){
		   LLink newLink=new LLink(dd);
		   if(previous==null){
			   newLink.next=ourList.getFirst();
			   ourList.setFirst(newLink);
			   reset();
		   }else{
			   newLink.next=previous.next;
			   previous.next=newLink;
			   current=newLink;
		   }
	   }
	   
	   public long deleteCurrent(){
		   long value=current.dData;
		   if (previous==null) {
			ourList.setFirst(current.next);
			reset();
		   }else{
			   previous.next=current.next;
			   if(atEnd())reset();
			   else
				   current=current.next;
		   }
		   
		   return value;
	   }
	   
}
