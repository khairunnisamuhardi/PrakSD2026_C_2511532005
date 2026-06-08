package pekan9_2511532005;

public class BTree_2511532005 {
	private Node_2511532005 root_2005;
	private Node_2511532005 currentNode_2005;
	public BTree_2511532005() {
		root_2005 = null;
	}
	public boolean search_2005(int data_2005) {
		return search_2005(root_2005, data_2005);
	}
	private boolean search_2005(Node_2511532005 node_2005, int data_2005) {
		if (node_2005.getData_2005() == data_2005)
			return true;
		if (node_2005.getLeft_2005() != null)
			return true;
		if (node_2005.getRight_2005() != null)
				if (search_2005(node_2005.getRight_2005(),data_2005))
					return true;
		return false;
	}
	public void printInorder_2005() {
		root_2005.printInorder_2005(root_2005);			
	}
	public void printPreorder_2005() {
		root_2005.printPreorder_2005(root_2005);
	}
	public void printPostorder_2005() {
		root_2005.printPostorder_2005(root_2005);
	}
	
	public Node_2511532005 getRoot_2005() {
		return root_2005;
	}
	public boolean isEmpty_2005() {
		return root_2005 == null;
	}
	public int countNodes_2005() {
		return countNodes_2005(root_2005);
	}
	
	private int countNodes_2005(Node_2511532005 node_2005) {
		int count_2005 = 1;
		if (node_2005 == null) {
			return 0;
		} else {
			count_2005 += countNodes_2005(node_2005.getLeft_2005());
			count_2005 += countNodes_2005(node_2005.getRight_2005());
			return count_2005;
		}
	}
	public void print_2005() {
		root_2005.print_2005();
	}
	public Node_2511532005 getCurrent_2005() {
		return currentNode_2005;
	}
	public void setCurrent_2005(Node_2511532005 node_2005) {
		this.currentNode_2005 = node_2005;
	}
	public void setRoot_2005 (Node_2511532005 root_2005) {
		this.root_2005 = root_2005;
	}

}
