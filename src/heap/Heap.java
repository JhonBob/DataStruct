package heap;
//堆
public class Heap {
	private Node[] heapArray;
	private int maxSize;
	private int currentSize;
	
	public Heap(int max){
		maxSize=max;
		currentSize=0;
		heapArray=new Node[maxSize];
	}
	
	public boolean isEmpty(){
		return currentSize==0;
	}
	
	public boolean insert(int key){
		if(currentSize==maxSize)return false;
		Node newNode=new Node(key);
		heapArray[currentSize]=newNode;//新节点放到最后
		trickleUp(currentSize);//新节点向上调整
		currentSize++;//数据项增加
		return true;
	}
	
	public void trickleUp(int index){
		int parent=(index-1)/2;//其父节点的索引
		Node bottom=heapArray[index];
		while(index>0 && heapArray[parent].getKey()<bottom.getKey()){
			heapArray[index]=heapArray[parent];
			index=parent;
			parent=(parent-1)/2;
		}
		
		heapArray[index]=bottom;
	}
	
	public Node remove(){//删除最大项
		Node root=heapArray[0];
		heapArray[0]=heapArray[--currentSize];//最后一个数据项先移到根上
		trickleDown(0);//根位置的新数据向下比较
		return root;
	}
	
	public void trickleDown(int index){
		int largerChild;//大的子节点的位置
		Node top=heapArray[index];
		while(index<currentSize/2){
			int leftChild=2*index+1;
			int rightChild=leftChild+1;
			if(rightChild<currentSize && heapArray[leftChild].getKey()<heapArray[rightChild].getKey()){
				largerChild=rightChild;
			}else largerChild=leftChild;
			if(top.getKey()>=heapArray[largerChild].getKey())break;
			//交换
			heapArray[index]=heapArray[largerChild];
			//继续下层
			index=largerChild;
		}
		heapArray[index]=top;
	}
	
	
	
	public boolean change(int index ,int newValue){
		if(index<0 || index>currentSize){
			return false;
		}
		
		int oldValue=heapArray[index].getKey();
		heapArray[index].setKey(newValue);
		if(oldValue<newValue){
			trickleUp(index);
		}else{
			trickleUp(index);
		}
		
		return true;
	}
	
	public void display(){
		System.out.print("HeapArray:");
		for (int m = 0; m < currentSize; m++) 
			if(heapArray[m]!=null)System.out.print(heapArray[m].getKey()+" ");
			else {
				System.out.print("--");
			}
		System.out.println();
		int nBlanks=32;
		int itemsPreRow=1;
		int column=0;
		int j=0;
		String dots="---------------------------";
		System.out.println(dots+dots);
		while(currentSize>0){//树状显示
			if(column==0){
				for (int k = 0; k < nBlanks; k++) {
					System.out.print(' ');
				}
			}
			System.out.print(heapArray[j].getKey());
			if(++j==currentSize)break;
			if(++column==itemsPreRow){
				nBlanks/=2;
				itemsPreRow*=2;
				column=0;
				System.out.println();
			}else
				for (int k = 0; k < nBlanks*2-2; k++) {
					System.out.print(' ');
				}
		}
		System.out.println();
		System.out.println(dots+dots);
	}
}
