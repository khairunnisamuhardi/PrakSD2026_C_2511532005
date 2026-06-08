package pekan9_2511532005;

public class BTreeDriver_2511532005 {
	public static void main(String[] args) {
		// membuat pohon
	BTree_2511532005 tree_2005 = new BTree_2511532005();
	System.out.print("Jumlah Simpul awal pohon: ");
	System.out.println(tree_2005.countNodes_2005());
	// menambahkan simpul data 1
	Node_2511532005 root_2005 = new Node_2511532005(1);
	// menjadikan simpul 1 sebagai root
	tree_2005.setRoot_2005(root_2005);
	System.out.println("Jumlah simpul jika hanya ada root");
	System.out.println(tree_2005.countNodes_2005());
	Node_2511532005 node2_2005 = new Node_2511532005(2);
	Node_2511532005 node3_2005 = new Node_2511532005(3);
	Node_2511532005 node4_2005 = new Node_2511532005(4);
	Node_2511532005 node5_2005 = new Node_2511532005(5);
	Node_2511532005 node6_2005 = new Node_2511532005(6);
	Node_2511532005 node7_2005 = new Node_2511532005(7);
	Node_2511532005 node8_2005 = new Node_2511532005(8);
	Node_2511532005 node9_2005 = new Node_2511532005(9);
	root_2005.setLeft_2005(node2_2005);
	node2_2005.setLeft_2005 (node4_2005);
	node2_2005.setRight_2005 (node5_2005);
	node4_2005.setRight_2005 (node8_2005);
	root_2005.setRight_2005(node3_2005);
	node3_2005.setLeft_2005 (node6_2005);
	node3_2005.setRight_2005 (node7_2005);
	node6_2005.setLeft_2005 (node9_2005);
	// set root_2005
	tree_2005.setCurrent_2005(tree_2005.getRoot_2005());
	System.out.println("menampilkan simpul terakhir:");
	System.out.println(tree_2005.getCurrent_2005().getData_2005());
	System.out.println("Jumlah simpul; setelah simpul 7 ditambahkan");
	System.out.println(tree_2005.countNodes_2005());
	System.out.println("InOrder: ");
	tree_2005.printInorder_2005();
	System.out.println("\nPreorder: ");
	tree_2005.printPreorder_2005();
	System.out.println("\nPostorder: ");
	tree_2005.printPostorder_2005();
	System.out.println("\nMenampilkan simpul dalam bentuk pohon");
	tree_2005.print_2005();
	}

}
