package Pekan8_2511532005;

public class ShellSort_2511532005 {
	public static void ShellSort_2511532005(int[] A) {
		int n_2005 = A.length;
		int gap = n_2005 / 2;
		while (gap > 0) {
			for (int i_2005 = gap; i_2005 < n_2005; i_2005++) {
				int temp = A[i_2005];
				int j_2005 = i_2005;
				while (j_2005 >= gap && A [j_2005 - gap] > temp) {
					A[j_2005] = A[j_2005 - gap];
					j_2005 = j_2005 - gap;
				}
				A[j_2005] = temp;
			}
			gap = gap / 2;
		}
	}
	
	public static void main(String[] args) {
		int[] data_2005 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		System.out.print("Sebelum : ");
		printArray(data_2005);
		ShellSort_2511532005(data_2005);
		
		System.out.print("Sesudah (Shell Short) : ");
		printArray(data_2005);
	}
	public static void printArray(int[] arr) {
		for (int i_2005 : arr) System.out.print(i_2005 + " ");
		System.out.println();
	}
}
