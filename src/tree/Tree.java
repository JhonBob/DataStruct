package tree;

import java.util.Stack;

//������      ���ֱ����������ķ��������룬ɾ�����ص㣬���ӣ�
public class Tree {
	private Node root;
	public Tree(){
		root=null;
	}
	
	//����
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
		//û���ҵ������ң��ҵ����˳�ѭ��
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
		
		
		//Ҫɾ���Ľڵ�û���ӽڵ�
		if(current.leftChild==null && current.rightChild==null){
			//Ҷ�ӽڵ�
			if(current==root)root=null;//���ӽڵ��
			else if(isLeftChild){
				parent.leftChild=null;
			}else{
				parent.rightChild=null;
			}
		}else if(current.rightChild==null){//Ҫɾ���Ľڵ���һ�����ӽڵ�
			if(current==root) root=current.leftChild;
			else if(isLeftChild)parent.leftChild=current.leftChild;
			else parent.rightChild=current.rightChild;
		}else if(current.leftChild==null){//Ҫɾ���Ľڵ���һ�����ӽڵ�
			if(current==root)root=current.rightChild;
			else if(isLeftChild) parent.leftChild=current.rightChild;
			else parent.rightChild=current.rightChild;
		}else{//Ҫɾ���Ľڵ��������ӽڵ�
			Node successor=getSuccessor(current);	
			if(current==root) root=successor;
			else if(isLeftChild) parent.leftChild=successor;
			else parent.rightChild=successor;
			successor.leftChild=current.leftChild;
		}
		
		return true;
	}

	//�ӽڵ��µļ̳���,�ҳ���Сֵ�������current
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
	
	//����
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
	
	//����
	public void traverse(int traverdeType){
		switch(traverdeType){
		case 1://��������
			preOrder(root);
			break;
		case 2://��������
			inOrder(root);
			break;
		case 3://��������
			postOrder(root);
			break;
		}
		System.out.println();
		System.out.println("------------------------------------------");
	}
	
	//��������
	private void preOrder(Node localRoot){
		if(localRoot!=null){
			System.out.print(localRoot.iData+" ");
			//�ݹ�
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);
		}
	}
	//��������
	private void inOrder(Node localRoot){
		if(localRoot!=null){
			inOrder(localRoot.leftChild);
			System.out.print(localRoot.iData+" ");
			inOrder(localRoot.rightChild);
		}
	}
	//��������
	private void postOrder(Node localRoot){
		if(localRoot!=null){
			postOrder(localRoot.rightChild);
			postOrder(localRoot.leftChild);
			System.out.print(localRoot.iData+" ");
		}
	}
	
	//��������ʽ��ӡ
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
