package pekan7_2511532005;

public class SelectionSort_2511532005 {
	public static void selectionSort_2511532005(int[] arr) {
		int n = arr.length;
		for (int i_2005 = 0; i_2005 < n; i_2005++) {
			int minIndex_2005 = i_2005;
			for (int j_2005 = i_2005 + 1; j_2005 < n; j_2005++) {
				if (arr[j_2005] < arr[minIndex_2005]) {
					minIndex_2005 = j_2005;
				}
			}
			int temp = arr[i_2005];
			arr[i_2005] = arr[minIndex_2005];
			arr[minIndex_2005] = temp;
		}
		
	}
	public static void main(String[] args) {
		int arr[] = { 23, 78, 45, 8, 32, 56, 1 };
		int n = arr.length;
		System.out.printf("array yang belum terurut: \n");
		for (int i_2005 = 0; i_2005< n; i_2005++)
			System.out.print(arr[i_2005] + " ");
		System.out.println("");
		selectionSort_2511532005(arr);
		System.out.printf("array yang terurut :\n");
		
		for (int i_2005 = 0; i_2005 < n; i_2005++)
			System.out.print(arr[i_2005] + " ");
		System.out.println(" ");
	}
}
