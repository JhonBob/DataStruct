package sortArray;
//快速排序
public class ArrayQuick2 {
	private long[] theArray;
	private int nElems;
	
	public ArrayQuick2(int max){
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
		int size=right-left+1;
//		if(size<3){
//			manualSort(left,right);//不递归
//		}
		//最快
		if(size<10){
			insertionSort(left,right);
		}
		//递归划分
		else
		{
			long pivot=medianOf3(left, right);
			//long pivot=theArray[right];//取分隔点
			int partition=partitionIt(left, right, pivot);//分隔值
			recQuickSort(left,partition-1);//前部分再划分
			recQuickSort(partition+1, right);//后部分再划分
		}
	}
	
	public void insertionSort(int left, int right) {
		// TODO Auto-generated method stub
		int in,out;
		for (out = left+1; out <=right; out++) {
			long temp=theArray[out];
			in=out;
			while(in>left && theArray[in-1]>=temp){
				theArray[in]=theArray[in-1];
				--in;
			}
			theArray[in]=temp;
		}
		
	}

	public long medianOf3(int left,int right){
		//三项数据取中
		int center=(left+right)/2;
		if(theArray[left]>theArray[center])swap(left, center);
		if(theArray[left]>theArray[right])swap(left, right);
		if(theArray[center]>theArray[right])swap(center,right);
		swap(center,right-1);
		return theArray[right-1];
	}
	
	public void manualSort(int left, int right) {
		// TODO Auto-generated method stub
		int size=right-left+1;
		if(size<=1)return;
		if(size==2){
			if(theArray[left]>theArray[right])swap(left, right);
			return;
		}else{
			if(theArray[left]>theArray[left+1])swap(left, left+1);
			if(theArray[left]>theArray[right])swap(left, right);
			if(theArray[left+1]>theArray[right])swap(left+1,right);
		}
	}

	public int partitionIt(int left,int right,long pivot){
		int leftPtr=left;
		int rightPtr=right-1;
		while(true){
			while(theArray[++leftPtr]<pivot);
			while(theArray[--rightPtr]>pivot);
			if(leftPtr>=rightPtr)break;
			else swap(leftPtr, rightPtr);//交换
		}
		swap(leftPtr, right-1);
		return leftPtr;
	}
	
	public void swap(int d1,int d2){
		long temp;
		temp=theArray[d1];
		theArray[d1]=theArray[d2];
		theArray[d2]=temp;
	}
}
