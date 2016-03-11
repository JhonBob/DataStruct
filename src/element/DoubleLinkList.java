package element;
//˫������
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
	
	
	//��������˭��     ����Ϊ��
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
	
	//ͷɾ
	public DoubleLink deleteFirst(){
	   DoubleLink temp=first;
	   if(first.next==null){
		   last=null;
	   }else 
		   //�޸�ָ��
		   first.next.previous=null;
	   //ɾ��
	   first=first.next;
	   
	   return temp;
	}
	
	//βɾ
    public DoubleLink deleteLast(){
		DoubleLink temp=last;
		//�Ƿ�ֻ��һ��
		if(first.next==null){
			  first=null;
		}else{
			 last.previous.next=null;
		}
		 last=last.previous;
		return temp;
	}
    
    //��key�����dd
    public boolean insertAfter(long key,long dd){
    	DoubleLink current=first;
    	
    	while(current.dData!=key){
    		current=current.next;
    		if(current==null)return false;
    	}
    	
    	DoubleLink newLink=new DoubleLink(dd);
    	//һ���޸�4��ָ�루���ã�
    	if(current==last){
    		newLink.next=null;
    		last=newLink;
    	}else {
    		//�½ڵ���һ�����½ڵ�Ĺ�ϵ��current�޸�
			newLink.next=current.next;
			current.next.previous=newLink;
		}
    	//�����Ƿ������һ�Ҫ�����½ڵ���current�Ĺ�ϵ
    	newLink.previous=current;
    	current.next=newLink;
    	
    	return true;
    }
    
    //ɾ��ָ����
    public DoubleLink deleteKey(long key){
    	DoubleLink current=first;
    	while(current.dData!=key){
    		current=current.next;
    		if(current==null)return null;
    	}
    	//9527 7259 ������ζ���ִ��
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
    
    //ǰ������ʾ
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
