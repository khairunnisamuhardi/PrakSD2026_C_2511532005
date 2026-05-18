package pekan7_2511532005;

public class BubbleSort_2511532005 {
	public static void bubbleSort_2511532005(int[] arr) {
		int n = arr.length;
		for (int i_2005 = 0; i_2005 < n; i_2005++) {
			for (int j_2005 = 0; j_2005 < n - i_2005 - 1; j_2005++ ) {
				if (arr[j_2005] > arr[j_2005 + 1]) {
					int temp = arr[j_2005];
					arr[j_2005] = arr[j_2005 + 1];
					arr[j_2005 + 1] = temp;
				//	System.out.println("data:" + arr[j_2005]+" "+arr[j_2005+1]);
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = { 23, 78, 45, 8, 32, 56, 1 };
		int n = arr.length;
		System.out.printf("array yang belum terurut: \n");
		for (int i_2005 = 0; i_2005< n; i_2005++)
			System.out.print(arr[i_2005] + " ");
		System.out.println("");
		//minMaxSelectionSort(arr,n);
		
		bubbleSort_2511532005(arr);
		System.out.printf("array yang terurut menggunakan BubbleSort:\n");
		for (int i_2005 = 0; i_2005 < n; i_2005++)
			System.out.print(arr[i_2005] + " ");
		System.out.println(" ");	
	}

}
