package Pekan8_2511532005;
import java.util.Scanner;

import java.util.Scanner;

public class Sorting_2511532005 {
    // Array untuk menyimpan maksimal 20 lagu
    Lagu_2511532005[] dataLagu_2005 = new Lagu_2511532005[20];
    int n = 0;
    Scanner scanner = new Scanner(System.in);

    // Method untuk input data secara MANUAL
    public void inputData_2005() {
        System.out.print("Berapa banyak lagu yang ingin diinput? (minimal 3): ");
        int jumlah = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        // Validasi minimal 7 lagu
        if (jumlah < 3) {
            System.out.println("Minimal harus 3 lagu!");
            return;
        }
        
        // Batasi maksimal 20 lagu
        if (jumlah > 20) {
            System.out.println("Maksimal 20 lagu! Hanya bisa input 20.");
            jumlah = 20;
        }

        // Input data lagu satu per satu
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\n--- Lagu ke-" + (i + 1) + " ---");
            System.out.print("Judul   : ");
            String judul = scanner.nextLine();
            System.out.print("Penyanyi: ");
            String penyanyi = scanner.nextLine();
            System.out.print("Durasi (detik): ");
            int durasi = scanner.nextInt();
            scanner.nextLine(); // consume newline

            dataLagu_2005[i] = new Lagu_2511532005(judul, penyanyi, durasi);
        }
        
        n = jumlah;
        System.out.println("\n✅ Data berhasil diinput!");
    }

    // Method menampilkan data
    public void tampilData_2005() {
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + dataLagu_2005[i].judul + 
                               " - " + dataLagu_2005[i].durasi + " detik");
        }
    }

    // QUICK SORT - Mengurutkan berdasarkan Durasi (Ascending)
    int partition_2005(int low, int high) {
        Lagu_2511532005 pivot = dataLagu_2005[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (dataLagu_2005[j].getDurasi() <= pivot.getDurasi()) {
                i++;
                Lagu_2511532005 temp = dataLagu_2005[i];
                dataLagu_2005[i] = dataLagu_2005[j];
                dataLagu_2005[j] = temp;
            }
        }

        Lagu_2511532005 temp = dataLagu_2005[i + 1];
        dataLagu_2005[i + 1] = dataLagu_2005[high];
        dataLagu_2005[high] = temp;

        return i + 1;
    }

    // Method utama Quick Sort (wajib pakai nama quickSort_xxxx)
    void quickSort_2005(int low, int high) {
        if (low < high) {
            int pi = partition_2005(low, high);
            quickSort_2005(low, pi - 1);
            quickSort_2005(pi + 1, high);
        }
    }

    // Main Method
    public static void main(String[] args) {
        Sorting_2511532005 playlist = new Sorting_2511532005();
        
        System.out.println("=== Sorting Playlist NIM: 2511532005 ===");
        System.out.println("Pilih Algoritma (1=Shell, 2=Quick, 3=Merge): 2");
        
        // Input Data secara MANUAL
        playlist.inputData_2005();

        // Tampilkan Sebelum Sorting
        System.out.println("\n📋 Data Sebelum Sorting:");
        playlist.tampilData_2005();

        // Proses Quick Sort
        playlist.quickSort_2005(0, playlist.n - 1);

        // Tampilkan Sesudah Sorting
        System.out.println("\n📋 Data Setelah Quick Sort (Durasi Asc):");
        playlist.tampilData_2005();
    }
}