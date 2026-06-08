package pekan9_2511532005;

public class Node_2511532005 {
	int data_2005;	// boleh string
	Node_2511532005 left_2005;
	Node_2511532005 right_2005;
	public Node_2511532005 (int data_2005) {
		this.data_2005 = data_2005;
		left_2005 = null;
		right_2005 = null;
	}
	public void setLeft_2005(Node_2511532005 node_2005) {
		if (left_2005 == null)
			left_2005 = node_2005;
	}
	public void setRight_2005(Node_2511532005 node_2005) {
		if (right_2005 == null)
			right_2005 = node_2005;
	}
	public Node_2511532005 getLeft_2005() {
		return left_2005;
	}
	public Node_2511532005 getRight_2005() {
		return right_2005;
	}
	public int getData_2005() {
		return data_2005;
	}
	public void setData_2005(int data_2005) {
		this.data_2005 = data_2005;
	}
	void printPreorder_2005 (Node_2511532005 node_2005) {
		if (node_2005 == null)
			return;
		System.out.print(node_2005.data_2005 + " ");
		printPreorder_2005(node_2005.left_2005);
		printPreorder_2005(node_2005.right_2005);
		
	}
	void printPostorder_2005(Node_2511532005 node_2005) {
		if (node_2005 == null)
			return;
		printPostorder_2005(node_2005.left_2005);
		printPostorder_2005(node_2005.right_2005);
		System.out.print(node_2005.data_2005 + " ");
	}
	void printInorder_2005 (Node_2511532005 node_2005) {
		if (node_2005 == null)
			return;
		printInorder_2005(node_2005.left_2005);
		System.out.print(node_2005.data_2005 + " ");
		printInorder_2005(node_2005.right_2005);
	}
	public String print_2005() {
		return this.print_2005("", true, ""); }
	public String print_2005(String prefix_2005, boolean isTail_2005, String sb_2005) {
		if (right_2005 != null) {
			right_2005.print_2005(prefix_2005 + (isTail_2005 ? "| " : "   "), false, sb_2005);
		}
		System.out.println(prefix_2005 + (isTail_2005 ? "\\--" : "/--")+data_2005);
		if (left_2005 != null) {
			left_2005.print_2005(prefix_2005 + (isTail_2005 ? "  " : "| "), true, sb_2005);
		}
		return sb_2005;
		}
	}
