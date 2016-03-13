package element;
//快速排序
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
		//递归划分
		if(right-left<=0)
			return;
		else
		{
			long pivot=theArray[right];//取分隔点
			int partition=partitionIt(left, right, pivot);//分隔值
			recQuickSort(left,partition-1);//前部分再划分
			recQuickSort(partition+1, right);//后部分再划分
		}
	}
	
	public int partitionIt(int left,int right,long pivot){
		int leftPtr=left-1;
		int rightPtr=right;
		while(true){
			while(theArray[++leftPtr]<pivot);
			while(rightPtr>0 && theArray[--rightPtr]>pivot);
			if(leftPtr>=rightPtr)break;
			else swap(leftPtr, rightPtr);//交换
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
