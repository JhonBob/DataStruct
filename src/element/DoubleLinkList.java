package element;
//双向链表
public class DoubleLinkList {
	private DoubleLink first;
	private DoubleLink last;
	public DoubleLinkList(){
		first=null;
		last=null;
	}
	
	public boolean isEmpty(){
		return first==null;
	}
	
	public void insertFirst(long dd){
		DoubleLink newLink=new DoubleLink(dd);
		if(isEmpty())
			last=newLink;
		else
			first.previous=newLink;
		newLink.next=first;
		first=newLink;
	}
	
	
	//从右往左谁看     右作为左
	public void insertLast(long dd){
		DoubleLink newLink=new DoubleLink(dd);
		if(isEmpty())
			first=newLink;
		else {
			last.next=newLink;
			newLink.previous=last;
		}
		last=newLink;
	}
	
	//头删
	public DoubleLink deleteFirst(){
	   DoubleLink temp=first;
	   if(first.next==null){
		   last=null;
	   }else 
		   //修改指针
		   first.next.previous=null;
	   //删除
	   first=first.next;
	   
	   return temp;
	}
	
	//尾删
    public DoubleLink deleteLast(){
		DoubleLink temp=last;
		//是否只有一项
		if(first.next==null){
			  first=null;
		}else{
			 last.previous.next=null;
		}
		 last=last.previous;
		return temp;
	}
    
    //往key后插入dd
    public boolean insertAfter(long key,long dd){
    	DoubleLink current=first;
    	
    	while(current.dData!=key){
    		current=current.next;
    		if(current==null)return false;
    	}
    	
    	DoubleLink newLink=new DoubleLink(dd);
    	//一共修改4个指针（引用）
    	if(current==last){
    		newLink.next=null;
    		last=newLink;
    	}else {
    		//新节点下一项与新节点的关系由current修改
			newLink.next=current.next;
			current.next.previous=newLink;
		}
    	//无论是否是最后一项都要处理新节点与current的关系
    	newLink.previous=current;
    	current.next=newLink;
    	
    	return true;
    }
    
    //删除指定项
    public DoubleLink deleteKey(long key){
    	DoubleLink current=first;
    	while(current.dData!=key){
    		current=current.next;
    		if(current==null)return null;
    	}
    	//9527 7259 无论如何都会执行
    	if(current==first){
    		first=current.next;
    	}else
    		//9527
    		current.previous.next=current.next;
    	
    	if (current==last) {
			last=current.previous;
		}else
			//7259
			current.next.previous=current.previous;
    	return current;
    }
    
    //前往后显示
    public void displayForward(){
    	DoubleLink current=first;
    	while (current!=null) {
    		current.displayLink();
			current=current.next;
		}
    	System.out.println();
    	System.out.println("----------------------------------------------");
    }
    
    public void diaplayBackword(){
    	DoubleLink current=last;
    	while (current!=null) {
    		current.displayLink();
			current=current.previous;
		}
    	System.out.println();
    	System.out.println("----------------------------------------------");
    }
    
}
