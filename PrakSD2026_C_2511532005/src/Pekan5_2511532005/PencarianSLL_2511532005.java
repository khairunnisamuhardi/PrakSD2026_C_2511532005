package Pekan5_2511532005;

public class PencarianSLL_2511532005 {
	static boolean searchKey_2005(NodeSLL_2511532005 head_2005, int key_2005) {
		NodeSLL_2511532005 curr_2005 = head_2005;
		while (curr_2005 != null) {
			if (curr_2005.data_2005 == key_2005)
				return true;
			curr_2005 = curr_2005.next_2005; }
			return false; }
	public static void traversal_2005 (NodeSLL_2511532005 head_2005) {
		// mulai dari head
		NodeSLL_2511532005 curr_2005 = head_2005;
		// telusuri sampai pointer null
		while (curr_2005 != null) {
			System.out.print(" " + curr_2005.data_2005);
			curr_2005 = curr_2005.next_2005; }
		System.out.println(); }
	
	public static void main(String[] args) {
		NodeSLL_2511532005 head_2005 = new NodeSLL_2511532005 (14);
		head_2005.next_2005 = new NodeSLL_2511532005 (21);
		head_2005.next_2005.next_2005 = new NodeSLL_2511532005 (13);
		head_2005.next_2005.next_2005.next_2005 = new NodeSLL_2511532005 (30);
		head_2005.next_2005.next_2005.next_2005.next_2005 = new NodeSLL_2511532005 (10);
		System.out.print ("Penelusuran SLL: ");
		traversal_2005 (head_2005);
		//data yang akan dicari
		int key_2005 = 30;
		System.out.print ("cari data "+key_2005+ "= ");
		if (searchKey_2005 (head_2005, key_2005))
			System.out.println ("Ketemu");
		else
			System.out.println ("Tidak ada");
	
	}
		
	}


