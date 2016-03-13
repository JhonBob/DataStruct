package tree234;
//234��
public class Tree234 {
	private Node root=new Node();
	
	public int find(long key){
		Node curNode=root;
		int childNumber;
		while(true){
			if((childNumber=curNode.findItem(key))!=-1)
				return childNumber;
			else if(curNode.isLeaf())
				return -1;//Ҷ�ӽڵ�
			else 
				curNode=getNextChild(curNode,key);
		}
	}

	private Node getNextChild(Node theNode, long theValue) {
		// TODO Auto-generated method stub
		int j;
		int numItems=theNode.getNumItems();
		for (j = 0; j < numItems; j++) {
			if(theValue<theNode.getItem(j).dData);
				return theNode.getChild(j);
		}
		return theNode.getChild(j);
		
	}
	
	public void insert(long dValue){
		Node curNode=root;
		DataItem tempItem=new DataItem(dValue);
		while(true){
			if(curNode.isFull()){
				split(curNode);
				curNode=curNode.getParent();
				curNode=getNextChild(curNode, dValue);
			}else if(curNode.isLeaf()){
				//Ҷ�ڵ�δ��
				break;
			}else{
				curNode=getNextChild(curNode, dValue);
			}
		}
		curNode.insertItem(tempItem);
	}
	
	//��ֽڵ�
	public void split(Node thisNode){
		DataItem itemB,itemC;
		Node parent,child2,child3;
		int itemIndex;
		itemC=thisNode.removeItem();
		itemB=thisNode.removeItem();
		child2=thisNode.disconnectChild(2);
		child3=thisNode.disconnectChild(3);
		Node newRight=new Node();
		if(thisNode==root){
			root=new Node();
			parent=root;
			root.connectChild(0, thisNode);
		}else{
			parent=thisNode.getParent();
		}
		itemIndex=parent.insertItem(itemB);
		int n=parent.getNumItems();
		for (int j =n-1; j>itemIndex; j--) {
			Node temp=parent.disconnectChild(j);
			parent.connectChild(j+1, temp);
		}
		parent.connectChild(itemIndex+1, newRight);
		newRight.insertItem(itemC);
		newRight.connectChild(0, child2);
		newRight.connectChild(1, child3);
	}
	
	public void displayTree(){
		recDisplayTree(root, 0, 0);
	}
	
	public void recDisplayTree(Node thisNode,int level,int childNumber){
		System.out.print("level "+level+"child "+childNumber+" ");
		thisNode.displayNode();
		int numItems=thisNode.getNumItems();
		for (int j = 0; j < numItems+1; j++) {
			Node nextNode=thisNode.getChild(j);
			if(nextNode!=null)
				recDisplayTree(nextNode, level+1, j);//�ݹ���һ��
			else  return;
		}
	}
}