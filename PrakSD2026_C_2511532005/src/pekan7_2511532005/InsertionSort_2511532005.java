package pekan7_2511532005;

public class InsertionSort_2511532005 {
	public static void insertionSort_2511532005 (int[] arr) {
		int n = arr.length;
		for (int i_2005 = 1; i_2005 < n; i_2005++) {
			int key_2005 = arr[i_2005];
			int j_2005 = i_2005 - 1;
			while (j_2005 >= 0 && arr[j_2005] > key_2005) {
				arr[j_2005 + 1] = arr[j_2005];
				j_2005--;
			}
			arr[j_2005 + 1] = key_2005;
		}
	}
	public static void main(String[] args) {
		int arr[] = { 23, 78, 45, 8, 32, 56, 1 };
		int n = arr.length;
		System.out.printf("array yang belum terurut: \n");
		for (int i_2005 = 0; i_2005< n; i_2005++)
			System.out.print(arr[i_2005] + " ");
		System.out.println("");
		insertionSort_2511532005(arr);
		System.out.printf("array yang terurut :\n");
		
		for (int i_2005 = 0; i_2005 < n; i_2005++)
			System.out.print(arr[i_2005] + " ");
		System.out.println(" ");	
	}

}
