package pekan4_2511532005;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class ReverseData_2511532005 {
	public static void main (String[] args) {
		Queue<Integer> q_2005 = new LinkedList<Integer>();
		q_2005.add(1);
		q_2005.add(2);
		q_2005.add(3);
		System.out.println( " sebelum reverse" + q_2005);
		Stack<Integer> s_2005 = new Stack<Integer>();
		while (!q_2005.isEmpty()) { // Q -> S
			s_2005.push(q_2005.remove());
		}
		while (!s_2005.isEmpty()) { // S -> Q
			q_2005.add(s_2005.pop());
		}
		System.out.println("Sesudah reverse =" + q_2005); // [3.2.1]
		
	}

}
