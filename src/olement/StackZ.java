package olement;

public class StackZ {
	private int maxSize;
	private Parame[] stackArray;
	public int top;
	public StackZ(int s){
		maxSize=s;
		stackArray=new Parame[maxSize];
		top=-1;
	}
	
	public void push(Parame p){
		stackArray[++top]=p;
	}
	
	public Parame pop(){
		return stackArray[top--];
	}
	public Parame peek(){
		return stackArray[top];
	}
}
