package element;
//双向链节点
public class DoubleLink {
	//数据
	public long dData;
	//指针
	public DoubleLink next;
	public DoubleLink previous;
	public DoubleLink(long d){
		dData=d;
	}
	
	public void displayLink(){
		System.out.print(dData+" ");
	}
}
