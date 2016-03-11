package element;
//链结点
public class Link<T> {
	//数据
	public T iData;
	//指针
	public Link next;
	
	public Link(T id){
		iData=id;
	}
	
	public void displayLink(){
		System.out.print("["+iData+"]");
		
	}

}
