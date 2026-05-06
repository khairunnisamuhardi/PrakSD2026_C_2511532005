package Pekan5_2511532005;

public class TambahSLL_2511532005 {
	public static NodeSLL_2511532005 insertAtFront (NodeSLL_2511532005 head_2005, int value_2005) {
		NodeSLL_2511532005 new_node_2005 = new NodeSLL_2511532005 (value_2005);
		new_node_2005.next_2005 = head_2005;
		return new_node_2005;
	}
	//fungsi menambahkan node di akhir SLL
	public static NodeSLL_2511532005 insertAtEnd (NodeSLL_2511532005 head_2005, int value_2005) {
		//buat sebuah node dengan sebuah nilai
		NodeSLL_2511532005 newNode = new NodeSLL_2511532005 (value_2005);
		//jika list kosong maka node jadi head
		if (head_2005 == null) {
			return newNode;
		}
		//simpan head ke variabel sementara
		NodeSLL_2511532005 last= head_2005;
		//telusuri ke node akhir
		while (last.next_2005 != null) {
			last = last.next_2005;
		}
		//ubah pointer
		last.next_2005 = newNode;
		return head_2005;
	}
	static NodeSLL_2511532005 GetNode (int data) {
		return new NodeSLL_2511532005 (data);
	}
	static NodeSLL_2511532005 insertPos (NodeSLL_2511532005 headNode_2005, int position_2005, int value_2005) {
		NodeSLL_2511532005 head_2005 = headNode_2005;
		if (position_2005 < 1)
			System.out.print ("Invalid position");
		if (position_2005 == 1) {
			NodeSLL_2511532005 new_node = new NodeSLL_2511532005 (value_2005);
			new_node.next_2005 = head_2005;
			return new_node;
		} else {
			while (position_2005-- != 0) {
				if (position_2005 == 1) {
					NodeSLL_2511532005 newNode = GetNode (value_2005);
					newNode.next_2005 = headNode_2005.next_2005;
					headNode_2005.next_2005 = newNode;
					break;
				}
				headNode_2005 = headNode_2005.next_2005;
			}
			if (position_2005 != 1)
				System.out.print ("Posisi di luar jangkauan"); 
		}
		return head_2005;
	}
	public static void printList_2005 (NodeSLL_2511532005 head_2005) {
		NodeSLL_2511532005 curr_2005= head_2005;
		while (curr_2005.next_2005 != null) {
			System.out.print (curr_2005.data_2005+"-->");
			curr_2005 = curr_2005.next_2005;
		}
		if (curr_2005.next_2005 == null) {
			System.out.print (curr_2005.data_2005);
		}
		System.out.println();
	}
	public static void main (String [] args) {
		//buat linked list 2->3->5->6
		NodeSLL_2511532005 head_2005 = new NodeSLL_2511532005 (2);
		head_2005.next_2005 = new NodeSLL_2511532005 (3);
		head_2005.next_2005.next_2005 = new NodeSLL_2511532005 (5);
		head_2005.next_2005.next_2005.next_2005 = new NodeSLL_2511532005 (6);
		//cetak list asli
		System.out.print ("Senarai berantai awal: ");
		printList_2005 (head_2005);
		//tambahkan node baru di depan
		System.out.print ("tambah 1 simpul di depan: ");
		int data_2005 = 1;
		head_2005 = insertAtFront (head_2005, data_2005);
		//cetak update list
		printList_2005 (head_2005);
		
		//tambahkan ode baru dibelakang
		System.out.print ("tambah 1 simpul di belakang: ");
		int data2_2005 = 7;
		head_2005 = insertAtEnd (head_2005, data2_2005);
		
		//cetak update list
		printList_2005 (head_2005);
		System.out.print("tambah 1 simpul ke data 4: ");
		int data3_2005 = 4;
		int pos_2005 = 4;
		head_2005 = insertPos (head_2005, pos_2005, data3_2005);
		//cetak update list
		printList_2005 (head_2005);
	
	
	}
}