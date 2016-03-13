package element;
//ϣ������
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
	
	//ϣ������ 
	public void  shellSort(){
		int inner,outer;
		long temp;
		int h=1;//���   �����h=h*3+1����Ҫ����������1/3      ÿ���ԣ�h-1��/3
		while(h<=nElems/3)
			h=h*3+1;
		
		//ѭ�����������������
		
		while(h>0){
			//�������
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
