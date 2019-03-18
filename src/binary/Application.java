package binary;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinTree<Integer> binTree = new BinTree<>();
		binTree.insertNode(3);
		binTree.insertNode(4);
		binTree.insertNode(1);
		binTree.insertNode(6);
		binTree.insertNode(5);
		binTree.insertNode(7);
		System.out.println("数字1的查找結果是"+binTree.findValue(1));
		System.out.println("数字6的查找結果是"+binTree.findValue(6));
	    binTree.PreTraversal_non_Recu();
	    binTree.PreTraversal_Recu();
	}
}