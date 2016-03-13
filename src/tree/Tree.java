package tree;

import java.util.Stack;

//二叉树      三种遍历二叉树的方法，插入，删除（重点，复杂）
public class Tree {
	private Node root;
	public Tree(){
		root=null;
	}
	
	//插入
	public void insert(int id,double dd){
		Node newNode=new Node();
		newNode.iData=id;
		newNode.dData=dd;
		if(root==null){
			root=newNode;
		}else{
			Node current=root;
			Node parent;
			while(true){
				parent=current;
				if(id<current.iData){
					current=current.leftChild;
					if(current==null){
						parent.leftChild=newNode;
						return;
				      }
				}else{
					current=current.rightChild;
					if(current==null){
						parent.rightChild=newNode;
						return;
					}
				} 
			}
		}
	}
	
	
	public boolean delete(int key){
		Node current=root;
		Node parent=root;
		boolean isLeftChild=true;
		//没有找到继续找，找到了退出循环
		while(current.iData!=key){
			parent=current;
			if(key<current.iData){
				isLeftChild=true;
				current=current.leftChild;
			}else {
				isLeftChild=false;
				current=current.rightChild;
			}
			if(current==null)return false;
		}
		
		
		//要删除的节点没有子节点
		if(current.leftChild==null && current.rightChild==null){
			//叶子节点
			if(current==root)root=null;//无子节点根
			else if(isLeftChild){
				parent.leftChild=null;
			}else{
				parent.rightChild=null;
			}
		}else if(current.rightChild==null){//要删除的节点有一个左子节点
			if(current==root) root=current.leftChild;
			else if(isLeftChild)parent.leftChild=current.leftChild;
			else parent.rightChild=current.rightChild;
		}else if(current.leftChild==null){//要删除的节点有一个右子节点
			if(current==root)root=current.rightChild;
			else if(isLeftChild) parent.leftChild=current.rightChild;
			else parent.rightChild=current.rightChild;
		}else{//要删除的节点有两个子节点
			Node successor=getSuccessor(current);	
			if(current==root) root=successor;
			else if(isLeftChild) parent.leftChild=successor;
			else parent.rightChild=successor;
			successor.leftChild=current.leftChild;
		}
		
		return true;
	}

	//子节点下的继承者,找出最小值替代上述current
	private Node getSuccessor(Node delNode) {
		// TODO Auto-generated method stub
		Node successorParent=delNode;
		Node successor=delNode;
		Node current=delNode.rightChild;
		while(current!=null){
			successorParent=successor;
			successor=current;
			current=current.leftChild;
		}
		if(successor!=delNode.rightChild){
			successorParent.leftChild=successor.rightChild;
			successor.rightChild=delNode.rightChild;
		}
		return successor;
	}
	
	//查找
	public Node find(int key){
		Node current=root;
		while(current.iData==key){
			if(key<current.iData){
				current=current.leftChild;
			}else{
				current=current.rightChild;
			}
			if(current==null) return null;
		}
		
		return current;
	}
	
	//遍历
	public void traverse(int traverdeType){
		switch(traverdeType){
		case 1://上下左右
			preOrder(root);
			break;
		case 2://下上左右
			inOrder(root);
			break;
		case 3://下上右左
			postOrder(root);
			break;
		}
		System.out.println();
		System.out.println("------------------------------------------");
	}
	
	//上下左右
	private void preOrder(Node localRoot){
		if(localRoot!=null){
			System.out.print(localRoot.iData+" ");
			//递归
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);
		}
	}
	//下上左右
	private void inOrder(Node localRoot){
		if(localRoot!=null){
			inOrder(localRoot.leftChild);
			System.out.print(localRoot.iData+" ");
			inOrder(localRoot.rightChild);
		}
	}
	//下上右左
	private void postOrder(Node localRoot){
		if(localRoot!=null){
			postOrder(localRoot.rightChild);
			postOrder(localRoot.leftChild);
			System.out.print(localRoot.iData+" ");
		}
	}
	
	//以树的形式打印
	public void displayTree(){
		Stack globalStack=new Stack();
		globalStack.push(root);
		int nBlanks=32;
		boolean isRowEmpth=false;
		System.out.println("------------------------------------------");
		while(isRowEmpth==false){
			Stack localStack=new Stack();
			isRowEmpth=true;
			for (int i = 0; i < nBlanks; i++)
				System.out.print(" ");
				while(globalStack.isEmpty()==false){
					Node temp=(Node) globalStack.pop();
					if(temp!=null){
						System.out.print(temp.iData);
						localStack.push(temp.leftChild);
						localStack.push(temp.rightChild);
						if(temp.leftChild!=null || temp.rightChild!=null)
							isRowEmpth=false;
					}else{
						System.out.print("--");
						localStack.push(null);
						localStack.push(null);
					}
					for (int j = 0; j < nBlanks*2-2; j++) {
						System.out.print(" ");
					}
				}
				System.out.println();
				nBlanks/=2;
				while(localStack.isEmpty()==false){
					globalStack.push(localStack.pop());
				}
		}
		System.out.println("----------------------------------------------");
		
	}
	
}
