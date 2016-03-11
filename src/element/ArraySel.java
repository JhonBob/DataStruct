package element;

//ѡ������
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
	
	//չʾ
	public void display(){
		for (int j = 0; j <nElems; j++) {
			System.out.print(a[j]+" ");
	}
		System.out.println();
	}
	
	//ѡ������
	public void selectionSort(){
		//min��¼��Сֵ
		int min,out,in;
		//���ѭ��
		for (out = 0; out < nElems; out++) {
			//С���ŵ�ǰ�� ,out֮ǰ���Ѿ��ź�
			min=out;
			//��out������
			for (in = out+1; in<nElems ; in++) {
				if(a[in]<a[min]) min=in;//�����Сλ��
			}
			//ɨ����󽻻�
			swap(out,min);
		}
	}
	
	
	
	//����
	private void swap(int one, int two) {
		// TODO Auto-generated method stub
		long temp=a[one];
		a[one]=a[two];
		a[two]=temp;
	}

}
