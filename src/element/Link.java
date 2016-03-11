package element;
//链结点
public class Link {
	//数据
	public int iData;
	public double dData;
	//指针
	public Link next;
	
	public Link(int id,double dd){
		iData=id;
		dData=dd;
	}
	
	public void displayLink(){
		System.out.print("["+iData+","+dData+"]");
		
	}

}
