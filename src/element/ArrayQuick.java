package element;
//��������
public class ArrayQuick {
	private long[] theArray;
	private int nElems;
	
	public ArrayQuick(int max){
		theArray=new long[max];
		nElems=0;
	}
	
	public void insert(long value){
		theArray[nElems]=value;
		nElems++;
	}
	
	public void display(){
		System.out.print("A=");
		for (int i = 0; i < nElems; i++) {
			System.out.print(theArray[i]+" ");
		}
		System.out.println();
		System.out.println("---------------------------------");
	}
	
	public void quickSort(){
		recQuickSort(0, nElems-1);
	}
	
	public void recQuickSort(int left,int right){
		//�ݹ黮��
		if(right-left<=0)
			return;
		else
		{
			long pivot=theArray[right];//ȡ�ָ���
			int partition=partitionIt(left, right, pivot);//�ָ�ֵ
			recQuickSort(left,partition-1);//ǰ�����ٻ���
			recQuickSort(partition+1, right);//�󲿷��ٻ���
		}
	}
	
	public int partitionIt(int left,int right,long pivot){
		int leftPtr=left-1;
		int rightPtr=right;
		while(true){
			while(theArray[++leftPtr]<pivot);
			while(rightPtr>0 && theArray[--rightPtr]>pivot);
			if(leftPtr>=rightPtr)break;
			else swap(leftPtr, rightPtr);//����
		}
		swap(leftPtr, right);
		return leftPtr;
	}
	
	public void swap(int d1,int d2){
		long temp;
		temp=theArray[d1];
		theArray[d1]=theArray[d2];
		theArray[d2]=temp;
	}
}
