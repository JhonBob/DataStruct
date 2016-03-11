package element;
//���У��Ƚ��ȳ�
public class Queue {
	private long[] queArray;
	private int maxSize;
	//ָ��
	private int front;//��ͷ
	private int rear;//��β
	
	private int nItems;
	
     public Queue(int s){
    	 maxSize=s;
    	 queArray=new long[maxSize];
    	 front=0;
    	 rear=-1;
    	 nItems=0;
     }
     
    public void insert(long value){
    	//�߽�
    	if(rear==maxSize-1)rear=-1;
    	queArray[++rear]=value;
    	nItems++;
    }
    
    public long remove(){
    	long temp=queArray[front++];
    	if(front==maxSize)front=0;
    	nItems--;
    	return temp;
    }
    
    public long peekFront(){
    	return queArray[front];
    }
    
    public boolean isEmpty(){
    	return nItems==0;
    }
    public boolean isFull(){
    	return nItems==maxSize;
    }
    
}
