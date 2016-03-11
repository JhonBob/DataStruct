package element;

import implement.Stack;

//ջ��ʹ�÷��ͽӿ�
public class StackY implements Stack<Character> {

	private char[] stackArray;
	private int maxSize;
	private int top;//ջ��
	
	public StackY(int s){
		maxSize=s;
		stackArray=new char[maxSize];
		top=-1;
	}

	@Override
	public void push(Character j) {
		// TODO Auto-generated method stub
		stackArray[++top]=j;
	}

	@Override
	public Character pop() {
		// TODO Auto-generated method stub
		return stackArray[top--];
	}

	@Override
	public Character peek() {
		// TODO Auto-generated method stub
		return stackArray[top];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top==-1;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return top==(maxSize-1);
	}
	

}
