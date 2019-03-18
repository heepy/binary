package binary;

public class Node<T extends Comparable<T>> {
	private Node<T> lChild;
	public Node<T> getlChild() {
		return lChild;
	}
	public void setlChild(Node<T> lChild) {
		this.lChild = lChild;
	}
	public Node(T data) {
		super();
		this.data = data;
	}
	public Node<T> getrChild() {
		return rChild;
	}
	public void setrChild(Node<T> rChild) {
		this.rChild = rChild;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	private Node<T> rChild;
	private T data;

}
