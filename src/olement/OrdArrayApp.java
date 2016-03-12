package olement;
//�ݹ���ֲ���
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
	
	//�ݹ���ֲ���
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
	
	//����
	public void insert(long value){
		int j;
		//���Բ���
		for (j = 0; j < nElems; j++)
			if(a[j]>value)break;
		//����ƶ�
		for (int i = nElems; i>j; i--) {
			a[i]=a[i-1];
		}
		//����
		a[j]=value;
		//����++
		nElems++;
	}
	
	//��ӡ
	public void display(){
		for (int i = 0; i < nElems; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
