package pekan3_2511532005;
import java.util.Scanner;
import java.util.Stack;

public class StackPostfix_2511532005 {
	public static int postfixEvaluate (String expression) {
		Stack<Integer> s_2005 = new Stack<Integer>();
		Scanner input_2005 = new Scanner(expression);
		while (input_2005.hasNext()) {
			if (input_2005.hasNextInt()) { // an operand (integer)
				s_2005.push (input_2005.nextInt());
			} else {						// an operator
				String operator_2005 = input_2005.next();
				int operand2_2005 = s_2005.pop ();
				int operand1_2005 = s_2005.pop ();
				if (operator_2005.equals("+")) {
					s_2005.push (operand1_2005 + operand2_2005);
				} else if (operator_2005.equals ("-")) {
					s_2005.push(operand1_2005 - operand2_2005);
				} else if (operator_2005.equals("*")) {
					s_2005.push(operand1_2005 * operand2_2005);
				} else {
					s_2005.push (operand1_2005 / operand2_2005);
				}
				
			}
		}
		input_2005.close();
		return s_2005.pop();
	}
	public static void main (String[] args) {
		System.out.println (" Hasil postfix = " + postfixEvaluate (" 5 2 4 * + 7 -"));
	}
}
