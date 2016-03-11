package element;

import implement.List;

//����:Ч�ʱ�����ߣ��ڴ�ռ�ø�
public class LinkList implements List {
	
	private Link first;
	public LinkList(){
		first=null;
	}
	
	//�ӽ��
	@SuppressWarnings("unchecked")
	@Override
	public <T> void insertFirst(T id) {
		//�µ�������
		Link newLink=new Link(id);
		//ԭ�����Ϊ�½�����һ�ڵ�
		newLink.next=first;
		//�½ڵ���Ϊ�׽ڵ�
		first=newLink;
	}
	
	public boolean isEmpty(){
		return first==null;
	}
	
	//��ͷɾ��
	@Override
	public <T> Link deleteFirst(){
		Link temp=first;
		first=first.next;
		return temp;
	}
	
	//����
	@Override
	public <T> Link find(T key) {
		Link current=first;
		//û�ҵ������ң��ҵ�������ѭ��
		while(current.iData!=key){
			if(current.next==null){
				return null;
			}else{
			     current=current.next;
			}
		}
		return current;
	}
	
	//ɾ��ָ������
	@Override
	public <T> Link delete(T key) {
		Link current=first;
		Link previous=first;
		while(current.iData!=key){
			if(current.next==null){
				return null;
			}else{
			      //������
				  previous=current;
			      current=current.next;
			}
		}
		//���ɾ���������ǵ�һ��
		if(current==first)
			first=first.next;
		else
			//ɾ��
			previous.next=current.next;
		
		return  current;
	}
	
	//��ӡ
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
