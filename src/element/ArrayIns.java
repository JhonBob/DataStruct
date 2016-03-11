package element;

//插入排序
public class ArrayIns {
	private long[] a;
	private int nElems;
	
	public ArrayIns(int max){
		a=new long[max];
		nElems=0;
	}
	
	public void insert(long value){
		a[nElems]=value;
		nElems++;
	}
	
	
	public void display(){
		for (int j = 0; j <nElems; j++) {
			System.out.print(a[j]+" ");
	}
		System.out.println();
	}
	
	//插入排序
	public void insertionSort(){
		int in,out;
		for (out = 1; out < nElems; out++) {
			//拿出来
			long temp=a[out];
			//in指到out处
			in=out;
			//往后移动，留出空位
			while(in>0 && a[in-1]>=temp){
				a[in]=a[in-1];
				in--;
			}
			//插入
			a[in]=temp;
		}
	}
	
}
