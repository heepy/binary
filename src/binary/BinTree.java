package binary;

import java.util.Stack;

public class BinTree<T extends Comparable<T>> {
	private Node<T> root;// 根节点
	private int height;

	public BinTree(Node<T> root, int height) {
		super();
		this.root = root;
		this.height = height;
	}

	public void insertNode(T value) {// 插入节点(非递归实现)
		Node<T> newNode = new Node<T>(value);
		if (root == null) {
			root = newNode;
		} else {
			Node<T> cNode = root;
			while (cNode != null) {
				if (newNode.getData().compareTo(cNode.getData()) > 0) {
					if (cNode.getlChild() == null) {
						cNode.setlChild(newNode);
						break;
					}
					cNode = cNode.getlChild();

				} else {
					if (cNode.getrChild() == null) {
						cNode.setrChild(newNode);
						break;
					}
					cNode = cNode.getrChild();
				}

			}

		}

	}

	public boolean findValue(T value) { // 查找节点（非递归实现）
		Node<T> newNode = new Node<T>(value);
		if (root == null) {
			return false;
		} else {
			Node<T> cNode = root;
			while (cNode != null) {
				if (newNode.getData().compareTo(cNode.getData()) == 0) {
					return true;
				}
				if (newNode.getData().compareTo(cNode.getData()) > 0) {
					if (cNode.getlChild() != null) {
						cNode = cNode.getlChild();
					}
				} else {
					cNode = cNode.getrChild();
				}
			}
		}
		return false;
	}
	public void  PreTraversal_non_Recu() {//前序遍历（非递归实现）需要借助栈来实现
		 Stack<Node> stack = new Stack<>();
	
		if(root == null) {
			System.out.println("二叉树为空");
		}else {
			System.out.println("二叉树前序遍历:");
			Node<T> cNode = root;
			while (cNode!=null||!stack.isEmpty()) {
			   while(cNode!=null) {
				   System.out.print(cNode.getData());
				   stack.push(cNode);
				   cNode=cNode.getlChild();
			   }
			   if(!stack.isEmpty()) {
				   cNode=stack.pop();
				   cNode=cNode.getrChild();
			   }
                				
			}
		}
		
	}

	public BinTree() {
		super();
		// TODO Auto-generated constructor stub
	}
}
