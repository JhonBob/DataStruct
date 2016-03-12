package olement;

public class StackO {
		private int[] stackArray;
		private int maxSize;
		private int top;//栈顶
		
		public StackO(int s){
			maxSize=s;
			stackArray=new int[maxSize];
			top=-1;
		}
		
		
		//加数据
		public void push(int j){
			//必须先++top
			stackArray[++top]=j;
		}
		
		//删除
		public int pop(){
			//先出站，后top--
			return stackArray[top--];
		}
		
		//查看
		public int peek(){
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
