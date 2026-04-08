package pekan3_2511532005;
import java.util.Stack;

public class NilaiMaksimum_2511532005 {
	public static int max_2005 (Stack<Integer> s_2005) {
		Stack<Integer> backup_2005 = new Stack<Integer> ();
		int maxValue_2005 = s_2005.pop();
		backup_2005.push (maxValue_2005);
		while (!s_2005.isEmpty()) {
			int next_2005 = s_2005.pop();
			backup_2005.push (next_2005);
			maxValue_2005 = Math.max(maxValue_2005,next_2005);
		}
		while (!backup_2005.isEmpty()) {
			s_2005.push (backup_2005.pop());
		}
		return maxValue_2005;
	}
	public static void main (String[] args) {
		Stack<Integer> s_2005 = new Stack<Integer> ();
		s_2005.push (70);
		s_2005.push (12);
		s_2005.push (20);
		System.out.println (" Isi stack " + s_2005);
		System.out.println (" Stack Teratas " + s_2005.peek());
		System.out.println ("Nilai maksimum " + max_2005(s_2005));
	}

}
