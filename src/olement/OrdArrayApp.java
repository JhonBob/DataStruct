package olement;
//递归二分查找
public class OrdArrayApp {
	private long[] a;
	private int nElems;
	public OrdArrayApp(int max){
		a=new long[max];
		nElems=0;
	}
	
	public int size(){
		return nElems;
	}
	
	public long getValue(long searchKey){
		int j=find(searchKey);
		if(j==nElems)
			return 0;
		else
			return a[j];
	}
	
	public int find(long searchKey){
		return recFind(searchKey, 0, nElems-1);
	}
	
	//递归二分查找
	public int recFind(long searchKey,int lowerBound,int upperBound){
		int curIn;
		curIn=(lowerBound+upperBound)/2;
		if(a[curIn]==searchKey)
			return curIn;
		else if(lowerBound>upperBound) 
			return nElems;
		else {
			if(a[curIn]<searchKey)
				return recFind(searchKey, curIn+1, upperBound);
			else 
				return recFind(searchKey, lowerBound, curIn-1);
		}
	}
	
	//插入
	public void insert(long value){
		int j;
		//线性查找
		for (j = 0; j < nElems; j++)
			if(a[j]>value)break;
		//向后移动
		for (int i = nElems; i>j; i--) {
			a[i]=a[i-1];
		}
		//插入
		a[j]=value;
		//索引++
		nElems++;
	}
	
	//打印
	public void display(){
		for (int i = 0; i < nElems; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
