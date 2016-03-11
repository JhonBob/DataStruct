package element;
//栈：一组记录，表示为先进后出（底层可有数组或链表实现）
public class StackX {
	//私有，访问限制：不可以直接操作数组，只能通过方法操作
	private long[] stackArray;
	private int maxSize;
	private int top;//栈顶
	
	public StackX(int s){
		maxSize=s;
		stackArray=new long[maxSize];
		top=-1;
	}
	
	
	//加数据
	public void push(long j){
		//必须先++top
		stackArray[++top]=j;
	}
	
	//删除
	public long pop(){
		//先出站，后top--
		return stackArray[top--];
	}
	
	//查看
	public long peek(){
		return stackArray[top];
	}
	
	public boolean isEmpty(){
		return top==-1;
	}
	
	//栈满
	public boolean isFull(){
		return top==(maxSize-1);
	}
	
}
