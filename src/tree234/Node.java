package tree234;

public class Node {
	private static final int ORDER=4;
	private int numItems;
	private Node parent;//父节点
	private Node[] childArray=new Node[ORDER];//指向子节点
	private DataItem[] itemArray=new DataItem[ORDER-1];//数据项数组
	
	public Node getChild(int childNum){//取子节点
		return childArray[childNum];
	}
	
	public Node getParent(){
		return parent;
	}
	
	public boolean isLeaf(){
		return childArray[0]==null?true:false;
	}
	
	public int getNumItems(){//取数据项个数
		return numItems;
	}
	
	public DataItem getItem(int index){//取某项数据
		return itemArray[index];
	}
	
	public boolean isFull(){//满了
		return (numItems==ORDER-1);
	}
	
	//连接子节点
	public void connectChild(int childNum,Node child){
		childArray[childNum]=child;
		if(child!=null)child.parent=this;
	}
	//拆分子节点
	public Node disconnectChild(int childNum){
		Node tempNode=childArray[childNum];
		childArray[childNum]=null;
		return tempNode;
	}
	
	//从当前结点中找数据项索引
	public int findItem(long key){
		for (int j = 0; j < ORDER-1; j++) {
			if(itemArray[j]==null)break;
			else if(itemArray[j].dData==key)return j;
		}
		return -1;//没找到
	}
	
	public int insertItem(DataItem newItem){
		numItems++;
		long newKey=newItem.dData;
		for (int j = ORDER-2; j >=0; j--) {
			if(itemArray[j]==null)continue;
			else{
				long itsKey=itemArray[j].dData;
				if(newKey<itsKey)
					itemArray[j+1]=itemArray[j];
				else{
					itemArray[j+1]=newItem;
					return j+1;
				}
			}
		}
		itemArray[0]=newItem;
		return 0;
	}
	
	public DataItem removeItem(){
		DataItem temp=itemArray[numItems-1];
		itemArray[numItems-1]=null;
		numItems--;
		return temp;
	}
	
	public void displayNode(){
		for (int i = 0; i < numItems; i++) {
			itemArray[i].diaplayItem();
		}
		System.out.println();
	}
	
}
