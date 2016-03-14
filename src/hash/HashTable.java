package hash;
//哈希表
public class HashTable {
	
	private DataItem[] hashArray;
	private int arraySize;
	//删除后的填充项
	private DataItem nonItem;
	
	public HashTable(int siz){
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
		//得到数组下标
		return key%arraySize;
	}
	
	public void insert(DataItem item){
		int key=item.getKey();
		int hashVal=hashFunc(key);
		//线性探测
		//有数据且数据不是-1
		while(hashArray[hashVal]!=null && hashArray[hashVal].getKey()!=-1){
			hashVal++;
			hashVal=hashVal%arraySize;//越界重定位,防止溢出
		}
		hashArray[hashVal]=item;
	}
	
	public DataItem delete(int key){
		int hashVal=hashFunc(key);
		while(hashArray[hashVal]!=null){
			if(hashArray[hashVal].getKey()==key){
				DataItem temp=hashArray[hashVal];
				hashArray[hashVal]=nonItem;
				return temp;
			}
			hashVal++;
			hashVal=hashVal%arraySize;//越界重定位
		}
		return null;
	}
	
	public DataItem find(int key){
		int hashVal=hashFunc(key);
		while(hashArray[hashVal]!=null){
			if(hashArray[hashVal].getKey()==key){
				
				return hashArray[hashVal];
			}
			hashVal++;
			hashVal=hashVal%arraySize;//越界重定位,防止溢出
		}
		return null;
	}
}
