package element;
//���ȼ�����
public class PriorityQueue {

	private long[] queArray;
	private int maxSize;
	private int nItems;
	public PriorityQueue(int s){
		maxSize=s;
		queArray=new long[maxSize];
		nItems=0;
	}
	
	
	//���루���Բ��ң�
	public void insert(long item){
		int j;//Ҫ�����λ��
		if(nItems==0){
			queArray[nItems++]=item;
		}else{
			//�Ӷ���β���±����ֵ��С�Ŀ�ʼ����
			for(j=nItems-1;j>=0;j--){
				//����ƶ�
				if(item>queArray[j])
					queArray[j+1]=queArray[j];
				else
					break;
			}
			//����
			queArray[j+1]=item;
			nItems++;
		}
	}
	
	
	//���±���󣨸����ȼ����Ŀ�ʼ�Ƴ�
	public long remove(){
		return queArray[--nItems];
	}
	
	//ȡ����Сֵ���±����
	public long peekMin(){
		return queArray[nItems-1];
	}
	
	public boolean isEmpty(){
		return nItems==0;
	}
	
	public boolean isFull(){
		return nItems==maxSize;
	}
}
