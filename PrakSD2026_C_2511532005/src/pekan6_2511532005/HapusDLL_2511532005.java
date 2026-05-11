package pekan6_2511532005;

public class HapusDLL_2511532005 {
	//FUNGSI menghapus node awal
	public static NodeDLL_2511532005 delHead_2005 (NodeDLL_2511532005 head_2005) {
		if (head_2005 == null) {
			return null;
		}
		NodeDLL_2511532005 temp = head_2005;
		head_2005 = head_2005.next_2005;
		if (head_2005 != null) {
			head_2005.prev_2005 = null;
		}
		return head_2005;
	}
	// fungsi menghapus akhir
	public static NodeDLL_2511532005 delLast_2005 (NodeDLL_2511532005 head_2005) {
		if (head_2005 == null) {
			return null;
		}
		if (head_2005.next_2005 == null) {
			return null;
		}
		NodeDLL_2511532005 curr_2005 = head_2005;
		while (curr_2005.next_2005 != null) {
			curr_2005 = curr_2005.next_2005;
		}
		// update pointer previouse node
		if (curr_2005.prev_2005 != null) {
			curr_2005.prev_2005.next_2005 = null;
		}
		return head_2005;
	}
// fungsi menghapus node posisi tertentu
	public static NodeDLL_2511532005 delPos_2005 (NodeDLL_2511532005 head_2005, int pos_2005) {
		// jika DLL kosong
		if (head_2005 == null) {
			return head_2005;
		}
		NodeDLL_2511532005 curr_2005 = head_2005;
		// telusuri sampau ke node yang akan di hapus
		for (int i = 1; curr_2005 != null && i < pos_2005; ++i) {
			curr_2005 = curr_2005.next_2005;
		}
		// jika posisi tidak di temukan 
		if (curr_2005 == null) {
			return head_2005;
		}
		// update pointer
		if (curr_2005.prev_2005 != null) {
			curr_2005.prev_2005.next_2005 = curr_2005.next_2005;
		}
		if (curr_2005.next_2005 != null) {
			curr_2005.next_2005.prev_2005 = curr_2005.prev_2005;
		}
		// jika yang dihapus head
		if (head_2005 == curr_2005) {
			head_2005 = curr_2005.next_2005;
		}
		return head_2005;
	}
	// fungsi mencetak DLL
	public static void printList(NodeDLL_2511532005 head_2005) {
		NodeDLL_2511532005 curr_2005 = head_2005;
		while (curr_2005 != null) {
			System.out.print(curr_2005.data_2005 + " ");
			curr_2005 = curr_2005.next_2005;
		}
		System.out.println();
	}
	public static void main(String[] args) {
	    // buat sebuah DLL
	    NodeDLL_2511532005 head_2005 = new NodeDLL_2511532005(1);
	    head_2005.next_2005 = new NodeDLL_2511532005(2);
	    head_2005.next_2005.prev_2005 = head_2005;
	    head_2005.next_2005.next_2005 = new NodeDLL_2511532005(3);
	    head_2005.next_2005.next_2005.prev_2005 = head_2005.next_2005;
	    head_2005.next_2005.next_2005.next_2005 = new NodeDLL_2511532005(4);
	    head_2005.next_2005.next_2005.next_2005.prev_2005 = head_2005.next_2005.next_2005;
	    head_2005.next_2005.next_2005.next_2005.next_2005 = new NodeDLL_2511532005(5);
	    head_2005.next_2005.next_2005.next_2005.next_2005.prev_2005 = head_2005.next_2005.next_2005.next_2005;

	    System.out.print("DLL Awal: ");
	    printList(head_2005);

	    System.out.print("Setelah head dihapus: ");
	    head_2005 = delHead_2005(head_2005);
	    printList(head_2005);

	    System.out.print("Setelah node terakhir dihapus: ");
	    head_2005 = delLast_2005(head_2005);
	    printList(head_2005);

	    System.out.print("menghapus node ke 2: ");
	    head_2005 = delPos_2005(head_2005, 2);

	    printList(head_2005);
	}
}
