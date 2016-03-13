package element;
//希尔排序
public class ArraySh {
	
	private long[] theArray;
	private int nElems;
	
	public ArraySh(int max){
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
	
	//希尔排序 
	public void  shellSort(){
		int inner,outer;
		long temp;
		int h=1;//间隔   最大间隔h=h*3+1，不要大于总数的1/3      每次以（h-1）/3
		while(h<=nElems/3)
			h=h*3+1;
		
		//循环间隔进行有序排列
		
		while(h>0){
			//间隔排序
			for (outer = h; outer<nElems; outer++) {
				temp=theArray[outer];
				inner=outer;
				while(inner>h-1 && theArray[inner-h]>=temp){
					theArray[inner]=theArray[inner-h];
					inner-=h;
				}
				theArray[inner]=temp; 
			}
			h=(h-1)/3;
		}
	}
}
