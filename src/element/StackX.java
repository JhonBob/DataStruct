package element;
//ջ��һ���¼����ʾΪ�Ƚ�������ײ�������������ʵ�֣�
public class StackX {
	//˽�У��������ƣ�������ֱ�Ӳ������飬ֻ��ͨ����������
	private long[] stackArray;
	private int maxSize;
	private int top;//ջ��
	
	public StackX(int s){
		maxSize=s;
		stackArray=new long[maxSize];
		top=-1;
	}
	
	
	//������
	public void push(long j){
		//������++top
		stackArray[++top]=j;
	}
	
	//ɾ��
	public long pop(){
		//�ȳ�վ����top--
		return stackArray[top--];
	}
	
	//�鿴
	public long peek(){
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
