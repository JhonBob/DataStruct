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


//���������:���ã�һ���ṩ�������ܵ�������
    class ListIterator{
	   private LLink current;
	   private LLink previous;
	   private IteratorLinkList ourList;
	   
	   public ListIterator(IteratorLinkList list){
		   ourList=list;
	   }
	   
	   //��������
	   public void reset(){
		   current=ourList.getFirst();
		   previous=null;
	   }
	   
	   //�Ƿ���ĩβ
	   public boolean atEnd(){
		   return current.next==null;
	   }
	   
	   //��һ��
	   public void nextLink(){
		   previous=current;
		   current=current.next;
	   }
	   
	   //���ص�ǰ���
	   public LLink getCurrent(){
		   return current;
	   }
	   
	   
	   //�ڵ��������ڷ��ʵ����ӵ������½ڵ�
	   public void insertAfter(long dd){
		   LLink newLink=new LLink(dd);
		   if(ourList.isEmpty()){
			   ourList.setFirst(newLink);
			   current=newLink;
		   }else{
			   //ע���Ⱥ��ϵ
			   newLink.next=current.next;
			   current.next=newLink;
			   nextLink();
		   }
	   }
	   
	   //��current֮ǰ����
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
