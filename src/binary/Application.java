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
		System.out.println("����1�Ĳ��ҽY����"+binTree.findValue(1));
		System.out.println("����6�Ĳ��ҽY����"+binTree.findValue(6));
	    binTree.PreTraversal_non_Recu();
	    binTree.PreTraversal_Recu();
	}
}