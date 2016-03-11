package element;
//有序链表
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
		//将大的数据放链表尾
		while (current != null && k.dData>current.dData) {
			//当前作为前一个
			previous=current;
			//下一个作为当前
			current=current.next;
		}
		//边界current=null,previous=null,没有数据
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
		//将大的数据放链表尾
		while (current != null && key>current.dData) {
			//当前作为前一个
			previous=current;
			//下一个作为当前
			current=current.next;
		}
		//边界current=null,previous=null,没有数据
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

	// 打印
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
