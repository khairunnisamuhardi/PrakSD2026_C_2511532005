package pekan4_2511532005;
import java.util.*;

public class QueueLinkedList_2511532005 {
	public static void main (String[] args) {
		
		Queue<Integer> q_2005 = new LinkedList<>();
		// tambah elemen {0, 1, 2, 3, 4, 5} ke antrian
		for (int i_2005 = 0; i_2005 < 6; i_2005++)
			q_2005.add(i_2005);
	
		// menampilkan isi antrian
		System.out.println("Elemen Antrian " + q_2005);
	
		// untuk menghapus kepala antrian
		int hapus_2005 = q_2005.remove();
		System.out.println("Hapus elemen = " + hapus_2005);
		System.out.println(q_2005);
	
		// untuk melihat antrian terdepan 
		int depan_2005 = q_2005.peek();
		System.out.println("Kepala antrian = " + depan_2005);
	
		int banyak_2005 = q_2005.size();
		System.out.println("Size Antrian =" + banyak_2005);
	}
	

}
