package element;
//优先级队列
public class PriorityQueue {

	private long[] queArray;
	private int maxSize;
	private int nItems;
	public PriorityQueue(int s){
		maxSize=s;
		queArray=new long[maxSize];
		nItems=0;
	}
	
	
	//插入（线性查找）
	public void insert(long item){
		int j;//要插入的位置
		if(nItems==0){
			queArray[nItems++]=item;
		}else{
			//从队列尾部下标最大值最小的开始遍历
			for(j=nItems-1;j>=0;j--){
				//向后移动
				if(item>queArray[j])
					queArray[j+1]=queArray[j];
				else
					break;
			}
			//插入
			queArray[j+1]=item;
			nItems++;
		}
	}
	
	
	//从下标最大（高优先级）的开始移除
	public long remove(){
		return queArray[--nItems];
	}
	
	//取出最小值（下标最大）
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
