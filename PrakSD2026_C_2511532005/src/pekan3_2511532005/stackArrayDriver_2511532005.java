package pekan3_2511532005;

public class stackArrayDriver_2511532005 {

	public static void main(String[] args) {
		stackArray_2511532005 s_2005 = new stackArray_2511532005();
		s_2005.push_2005 (10);
		s_2005.push_2005 (20);
		s_2005.push_2005(30);
		System.out.println(s_2005.pop_2005() + " dikeluarkan dari stack");
		System.out.println(" Elemen teratas adalah :" + s_2005.peek_2005());
		System.out.print("Element pada Stack :");
		s_2005.print_2005();
	}

}
