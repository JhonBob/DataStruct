package element;
//�����
public class Link<T> {
	//����
	public T iData;
	//ָ��
	public Link next;
	
	public Link(T id){
		iData=id;
	}
	
	public void displayLink(){
		System.out.print("["+iData+"]");
		
	}

}
