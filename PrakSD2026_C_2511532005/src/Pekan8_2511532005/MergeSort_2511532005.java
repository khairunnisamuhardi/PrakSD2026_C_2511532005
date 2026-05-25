package Pekan8_2511532005;

public class MergeSort_2511532005 {

    void merge_2005(int arr[], int l_2005, int m_2005, int r_2005) {

        // Find sizes of two subarrays to be merged
        int n1_2005 = m_2005 - l_2005 + 1;
        int n2_2005 = r_2005 - m_2005;

        /* Create temp arrays */
        int L_2005[] = new int[n1_2005];
        int R_2005[] = new int[n2_2005];

        /* Copy data to temp arrays */
        for (int i_2005 = 0; i_2005 < n1_2005; ++i_2005)
            L_2005[i_2005] = arr[l_2005 + i_2005];

        for (int j_2005 = 0; j_2005 < n2_2005; ++j_2005)
            R_2005[j_2005] = arr[m_2005 + 1 + j_2005];

        int i_2005 = 0, j_2005 = 0;

        // Initial index of merged subarray array
        int k_2005 = l_2005;

        while (i_2005 < n1_2005 && j_2005 < n2_2005) {
            if (L_2005[i_2005] <= R_2005[j_2005]) {
                arr[k_2005] = L_2005[i_2005];
                i_2005++;
            } else {
                arr[k_2005] = R_2005[j_2005];
                j_2005++;
            }
            k_2005++;
        }

        /* Copy remaining elements of L[] if any */
        while (i_2005 < n1_2005) {
            arr[k_2005] = L_2005[i_2005];
            i_2005++;
            k_2005++;
        }

        /* Copy remaining elements of R[] if any */
        while (j_2005 < n2_2005) {
            arr[k_2005] = R_2005[j_2005];
            j_2005++;
            k_2005++;
        }
    }
    
    void sort_2005(int arr[], int l_2005, int r_2005) {
        if (l_2005 < r_2005) {

            // Find the middle point
            int m_2005 = (l_2005 + r_2005) / 2;

            // Sort first and second halves
            sort_2005(arr, l_2005, m_2005);
            sort_2005(arr, m_2005 + 1, r_2005);

            // Merge the sorted halves
            merge_2005(arr, l_2005, m_2005, r_2005);
        }
    }

    /* A utility function to print array of size n */
    static void printArray_2005(int arr[]) {
        int n_2005 = arr.length;

        for (int i_2005 = 0; i_2005 < n_2005; ++i_2005)
            System.out.print(arr[i_2005] + " ");

        System.out.println();
    }

    public static void main(String args[]) {

        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Sebelum terurut");
        printArray_2005(arr);

        MergeSort_2511532005 ob_2005 = new MergeSort_2511532005();
        ob_2005.sort_2005(arr, 0, arr.length - 1);

        System.out.println("\nSesudah Terurut menggunakan merge Sort");
        printArray_2005(arr);
    }
}