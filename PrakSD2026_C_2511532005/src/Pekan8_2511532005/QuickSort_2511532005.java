package Pekan8_2511532005;

public class QuickSort_2511532005 {
	static void swap_2005(int[] arr, int i_2005, int j_2005) {
		int temp = arr[i_2005];
		arr[i_2005] = arr[j_2005];
		arr[j_2005] = temp;
	}
	// metode tambahan untuk mengatur pivot menggunakan median of three
	static void medianOfThree_2005(int[] arr, int low_2005, int high_2005) {
		int mid_2005 = low_2005 + (high_2005 - low_2005) / 2;
		
		// urutkan elemen low, mid, dan high
		if (arr[low_2005] > arr[mid_2005]) {
			swap_2005(arr, low_2005, mid_2005);
		}
		if (arr[low_2005] > arr[high_2005]) {
			swap_2005(arr, low_2005, high_2005);
		}
		if (arr[mid_2005] > arr[high_2005]) {
			swap_2005(arr, mid_2005, high_2005);
		}
		swap_2005(arr, mid_2005, high_2005);
	}
	static int partition_2005(int[] arr, int low_2005, int high_2005) {
		// panggil fungsi medianOfThree sebelum menentukan pivot
		medianOfThree_2005(arr, low_2005, high_2005);
		int pivot_2005 = arr[high_2005]; // sekarang arr[high_2005] sudah berisi nilai media
		int i_2005 = (low_2005 - 1);
		
		for (int j_2005 = low_2005; j_2005<= high_2005 - 1; j_2005++) {
			// jika elemen saat ini lebih kecil dari atau sama dengan pivot
			if (arr[j_2005] < pivot_2005) {
				// increment indeks elemen yang lebih kecil
				i_2005++;
				swap_2005(arr, i_2005, j_2005);
			}
		}
		swap_2005(arr, i_2005 + 1, high_2005);
		return (i_2005 + 1);
	}
	
	static void QuickSort_2511532005(int[] arr, int low_2005, int high_2005) {
		if (low_2005 < high_2005) {
			int pi_2005 = partition_2005(arr, low_2005, high_2005);
			QuickSort_2511532005(arr, low_2005, pi_2005 - 1);
			QuickSort_2511532005(arr, pi_2005 + 1, high_2005);
		}
	}
	
	public static void printArr_2005(int[] arr) {
		for (int i_2005 = 0; i_2005 < arr.length; i_2005++) {
			System.out.print(arr[i_2005] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = { 10, 7, 8, 9, 1, 5 };
		int N_2005 = arr.length;
		System.out.print(" Data sebelum diurutkan : ");
		printArr_2005(arr);
		
		QuickSort_2511532005(arr, 0, N_2005 - 1);
		
		System.out.print("Data terurut quicsort :");
		printArr_2005(arr);
		
	}

}
