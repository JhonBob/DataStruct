package hashdouble;
//��ϣ�ٹ�ϣ
public class HashDoubleTable {
	
	private DataItem[] hashArray;
	private int arraySize;
	//ɾ����������
	private DataItem nonItem;
	
	public HashDoubleTable(int siz){
		arraySize=siz;
		hashArray=new DataItem[arraySize];
		nonItem=new DataItem(-1);
	}
	
	public void displayTable(){
		System.out.print("Table:");
		for (int j = 0; j < arraySize; j++) {
			if(hashArray[j]!=null){
				System.out.print(hashArray[j].getKey()+" ");
			}else System.out.print("** ");
		}
		System.out.println();
	}
	
	public int hashFunc(int key){
		//�õ������±�
		return key%arraySize;
	}
	
	public int hashFuncTwice(int key){
		return 5-key%5;
	}
	
	public void insert(int key,DataItem item){
		int hashVal=hashFunc(key);
		int stepSize=hashFuncTwice(key);//����̽�ⲽ��
		//����̽��
		//�����������ݲ���-1
		while(hashArray[hashVal]!=null && hashArray[hashVal].getKey()!=-1){
			hashVal+=stepSize;
			hashVal=hashVal%arraySize;//Խ���ض�λ,��ֹ���
		}
		hashArray[hashVal]=item;
	}
	
	public DataItem delete(int key){
		int hashVal=hashFunc(key);
		int stepSize=hashFuncTwice(key);//����̽�ⲽ��
		while(hashArray[hashVal]!=null){
			if(hashArray[hashVal].getKey()==key){
				DataItem temp=hashArray[hashVal];
				hashArray[hashVal]=nonItem;
				return temp;
			}
			hashVal+=stepSize;
			hashVal=hashVal%arraySize;//Խ���ض�λ
		}
		return null;
	}
	
	public DataItem find(int key){
		int hashVal=hashFunc(key);
		int stepSize=hashFuncTwice(key);//����̽�ⲽ��
		while(hashArray[hashVal]!=null){
			if(hashArray[hashVal].getKey()==key){
				
				return hashArray[hashVal];
			}
			hashVal+=stepSize;
			hashVal=hashVal%arraySize;//Խ���ض�λ,��ֹ���
		}
		return null;
	}
}
