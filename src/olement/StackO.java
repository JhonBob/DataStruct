package olement;

public class StackO {
		private int[] stackArray;
		private int maxSize;
		private int top;//ջ��
		
		public StackO(int s){
			maxSize=s;
			stackArray=new int[maxSize];
			top=-1;
		}
		
		
		//������
		public void push(int j){
			//������++top
			stackArray[++top]=j;
		}
		
		//ɾ��
		public int pop(){
			//�ȳ�վ����top--
			return stackArray[top--];
		}
		
		//�鿴
		public int peek(){
			return stackArray[top];
		}
		
		public boolean isEmpty(){
			return top==-1;
		}
		
		//ջ��
		public boolean isFull(){
			return top==(maxSize-1);
		}
}
