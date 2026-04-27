package pekan4_2511532005;
import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;

public class IterasiQueue_2511532005 {
	public static void main(String args[]) {
		Queue<String> q_2005 = new LinkedList<>();
		
		q_2005.add("Praktikum");
		q_2005.add("Struktur");
		q_2005.add("Data");
		q_2005.add("Dan");
		q_2005.add("Algoritma");
		Iterator<String> iterator = q_2005.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}

}
