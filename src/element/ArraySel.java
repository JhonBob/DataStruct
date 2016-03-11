package element;

//选择排序
public class ArraySel {
	private long[] a;
	private int nElems;
	
	public ArraySel(int max){
		a=new long[max];
		nElems=0;
	}
	
	public void insert(long value){
		a[nElems]=value;
		nElems++;
	}
	
	//展示
	public void display(){
		for (int j = 0; j <nElems; j++) {
			System.out.print(a[j]+" ");
	}
		System.out.println();
	}
	
	//选择排序
	public void selectionSort(){
		//min记录最小值
		int min,out,in;
		//外层循环
		for (out = 0; out < nElems; out++) {
			//小的排到前面 ,out之前的已经排好
			min=out;
			//从out向后遍历
			for (in = out+1; in<nElems ; in++) {
				if(a[in]<a[min]) min=in;//标记最小位置
			}
			//扫描完后交换
			swap(out,min);
		}
	}
	
	
	
	//交换
	private void swap(int one, int two) {
		// TODO Auto-generated method stub
		long temp=a[one];
		a[one]=a[two];
		a[two]=temp;
	}

}
