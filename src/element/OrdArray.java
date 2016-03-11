package element;

//有序数组
public class OrdArray {
	private  long[] a;
	private  int nElems;
	
	
	public OrdArray(int max){
		a=new long[max];
		nElems=0;
	}
	
	public int size(){
		return nElems;
	}
	
	//添加数据（线性查找）
	public void insert(long value){
		int j;
		//找到第一个大于value的a[j]
		for (j = 0; j < nElems; j++) 
			if (a[j]>value)break;
		//a[j]以及后面的元素往后移
		for (int k = nElems; k >j; k--)
			a[k]=a[k-1];
		//插入
		a[j]=value;
		//数组大小改变
		nElems++;
	}
	
	
	//二分查找
	public int find(long searchKey){
		int lowerBound=0;
		int upperBound=nElems-1;
		int curIn;
		while(true){
			//对半
			curIn=(lowerBound+upperBound)/2;
			if (a[curIn]==searchKey)
				return curIn;
			//索引出界
			else if(lowerBound>upperBound)
				return nElems;
			//继续查找
			else {
				//大于，向后索引
				if(a[curIn]<searchKey)
					lowerBound=curIn+1;
				else //前半部分索引
					upperBound=curIn-1;
			}
		}
	}
	
	//删除
	public boolean delete(long value){
		int j=find(value);
		//出界
		if (j==nElems) {
			return false;
		}else{
			//向前移替换掉指定元素
			for (int k = j; k < nElems; k++) {
				a[k]=a[k+1];
			}
			nElems--;
			return true;
		}
		
	}
	
	//展示
	public void display(){
		for (int j = 0; j <nElems; j++) {
			System.out.print(a[j]+" ");
		}
		System.out.println();
	}
}
