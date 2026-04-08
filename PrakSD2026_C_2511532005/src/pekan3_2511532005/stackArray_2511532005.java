package pekan3_2511532005;

public class stackArray_2511532005 {
	static final int MAX_2005 = 1000;
	int top_2005;
	int a_2005[] = new int[MAX_2005];
	boolean isEmpty()
	{
		return (top_2005 < 0);
	}
	stackArray_2511532005()
	{
		top_2005 = -1;
	}
	boolean push_2005 (int x)
	{
		if (top_2005 >= (MAX_2005 - 1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			a_2005 [++ top_2005] = x;
			System.out.println(x + " dimasukkan dalam stack ");
			return true;
		}
	}
	int pop_2005()
	{
		if (top_2005 < 0) {
			System.out.println(" Stack Underflow");
			return 0;
		}
		else {
			int x = a_2005 [top_2005 --];
			return x;
		}
	}
	int peek_2005()
	{
		if (top_2005 < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a_2005[top_2005];
			return x;
		}
	}
	void print_2005() {
		for (int i = top_2005; i>-1;i--) {
			System.out.print (" " + a_2005[i]);
		}
		
	}

}
