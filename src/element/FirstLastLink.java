package element;
//˫������
public class FirstLastLink {
	public LLink first;//ָ������ĵ�һ��
	public LLink last;//ָ����������һ��
	public FirstLastLink(){
		first=null;
		last=null;
	}
	public boolean isEmpty(){
		return first==null;
	}
	//ͷ����
	public void insertFirst(long dd){
		LLink newLink=new LLink(dd);
		if(isEmpty())
			last=newLink;
		//��Ϊ�գ���ͷ����ǰ��
		newLink.next=first;
		//�޸�ָ��
		first=newLink;
		
	}

	//β����
	public void insertLast(long dd){
		LLink newLink=new LLink(dd);
		if(isEmpty())
			//��Ϊ��һ��
			first=newLink;
		else
			//��β�����
			last.next=newLink;
		//�޸�ָ��
		last=newLink;
	}
	
	//ͷɾ��
	public long deleteFirst(){
		long temp=first.dData;
		if(first.next==null)
			last=null;
		//ɾ
		first=first.next;
		return temp;
	}
	

	//��ӡ
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
