package sortArray;

//��������
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
	
	//��������
	public void insertionSort(){
		int in,out;
		for (out = 1; out < nElems; out++) {
			//�ó���
			long temp=a[out];
			//inָ��out��
			in=out;
			//�����ƶ���������λ
			while(in>0 && a[in-1]>=temp){
				a[in]=a[in-1];
				in--;
			}
			//����
			a[in]=temp;
		}
	}
	
}