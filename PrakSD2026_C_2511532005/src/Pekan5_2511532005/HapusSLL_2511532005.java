package Pekan5_2511532005;

public class HapusSLL_2511532005 {
	// fungsi untuk menghapus head
	public static NodeSLL_2511532005 deleteHead_2005(NodeSLL_2511532005 head_2005) {
		// jika SLL kosong 
		if (head_2005 == null)
			return null;
		// pindahkan head ke node berikutnya
		head_2005 = head_2005.next_2005;
		// return head baru
		return head_2005;
		}
	// fungsi menghapus node terakhir SLL
	public static NodeSLL_2511532005 removeLastNode(NodeSLL_2511532005 head_2005) {
		// jika list kosong, return null
		if (head_2005 == null) {
			return null;
		}
		//jika list satu node, hapus node dan return null
		if (head_2005.next_2005 == null) {
			return null;
		}
		//temukan node terakhir ke dua
		NodeSLL_2511532005 secondLast = head_2005;
		while (secondLast.next_2005.next_2005 != null) {
			secondLast = secondLast.next_2005;
		}
		//hapus node terakhir
		secondLast.next_2005 = null;
		return head_2005;
		}
	// fungsi menghapus node di posisi tertentu
		public static NodeSLL_2511532005 deleteNode_2005(NodeSLL_2511532005 head_2005, int position_2005) {
			NodeSLL_2511532005 temp_2005 = head_2005;
			NodeSLL_2511532005 prev_2005 = null;
			// jika linked lidt null
			if (temp_2005 == null)
				return head_2005;
			// kasus 1 = head dihapus
			if (position_2005 == 1) {
				head_2005 = temp_2005.next_2005;
				return head_2005;
				}
			// kasus 2 menghapus node di tengah
			// telusuri ke node yang dihapus
		for (int i = 1; temp_2005 != null && i < position_2005; i++) {
			prev_2005 = temp_2005;
			temp_2005 = temp_2005.next_2005; }
			
		// jika ditemukan, hapus node
		if (temp_2005 != null) {
			prev_2005.next_2005 = temp_2005.next_2005;
		} else {
			System.out.println(" Data tidak ada "); }
		return head_2005; 
		}
		
		// fungsi mencetak SLL
		public static void printList (NodeSLL_2511532005 head_2005) {
			NodeSLL_2511532005 curr_2005 = head_2005;
			while (curr_2005.next_2005 != null) {
				System.out.print(curr_2005.data_2005+"-->");
				curr_2005 = curr_2005.next_2005;
			}
			if (curr_2005.next_2005 == null ) {
				System.out.print(curr_2005.data_2005); 
				}
			System.out.println();
		}
		// ===== MAIN =====
		public static void main(String[] args) {

		    // buat SLL
		    NodeSLL_2511532005 head_2005 = new NodeSLL_2511532005(1);

		    head_2005.next_2005 = new NodeSLL_2511532005(2);
		    head_2005.next_2005.next_2005 = new NodeSLL_2511532005(3);
		    head_2005.next_2005.next_2005.next_2005 = new NodeSLL_2511532005(4);
		    head_2005.next_2005.next_2005.next_2005.next_2005 = new NodeSLL_2511532005(5);
		    head_2005.next_2005.next_2005.next_2005.next_2005.next_2005 = new NodeSLL_2511532005(6);

		    // cetak awal
		    System.out.println("List awal: ");
		    printList(head_2005);

		    // hapus head
		    head_2005 = deleteHead_2005(head_2005);
		    System.out.println("List setelah head dihapus: ");
		    printList(head_2005);

		    // hapus node terakhir
		    head_2005 = removeLastNode(head_2005);
		    System.out.println("List setelah simpul terakhir dihapus: ");
		    printList(head_2005);

		    // hapus posisi 2
		    int position_2005 = 2;
		    head_2005 = deleteNode_2005(head_2005, position_2005);

		    System.out.println("List setelah posisi 2 dihapus: ");
		    printList(head_2005);
		}
}

	


