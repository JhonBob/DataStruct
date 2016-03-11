package element;
//��������
public class SortedList {
	private LLink first;
	public SortedList(){
		first=null;
	}
	
	public SortedList(LLink[] linkArr){
		first=null;
		for (int j = 0; j < linkArr.length; j++) {
			insert(linkArr[j]);
		}
	}
	
	public void insert(LLink k){
		LLink previous = null;
		LLink current = first;
		//��������ݷ�����β
		while (current != null && k.dData>current.dData) {
			//��ǰ��Ϊǰһ��
			previous=current;
			//��һ����Ϊ��ǰ
			current=current.next;
		}
		//�߽�current=null,previous=null,û������
		if(previous==null){
			first=k;
		}else{
			previous.next=k;
		}
		k.next=current;
	}
	
	//O(N)
	public void insert(long key) {
		LLink newLink = new LLink(key);
		LLink previous = null;
		LLink current = first;
		//��������ݷ�����β
		while (current != null && key>current.dData) {
			//��ǰ��Ϊǰһ��
			previous=current;
			//��һ����Ϊ��ǰ
			current=current.next;
		}
		//�߽�current=null,previous=null,û������
		if(previous==null){
			first=newLink;
		}else{
			previous.next=newLink;
		}
		newLink.next=current;
	}
	
	
	public LLink remove(){
		LLink temp=first;
		first=first.next;
		return temp;
	}

	// ��ӡ
	public void displayList() {
		System.out.print("all");
		LLink current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println();
		System.out.println("---------------------------------");
	}
}
