package pekan3_2511532005;
import java.util.Stack;
import java.util.Scanner;

public class Browser_2511532005 {
    private Stack<Website_2511532005> history;  // Stack LIFO
    private Scanner input;
    
    public Browser_2511532005() {
        history = new Stack<>();
        input = new Scanner(System.in);
    }
    
    public void tampilkanMenu() {
        System.out.println("=== Browser History NIM: 2511532005 ===");
        System.out.println("1. Kunjungi Website (Push)");
        System.out.println("2. Tombol Back (Pop)");
        System.out.println("3. Lihat Halaman Aktif (Peek)");
        System.out.println("4. Cek Status History");
        System.out.println("5. Keluar");
        System.out.print("Pilihan: ");
    }
    
    // 1. PUSH - Kunjungi Website Baru
    public void kunjungiWebsite() {
        System.out.print("Masukkan Judul: ");
        String judul = input.nextLine();
        
        System.out.print("Masukkan URL: ");
        String url = input.nextLine();
        
        Website_2511532005 websiteBaru = new Website_2511532005(judul, url);
        history.push(websiteBaru);  // ✅ PUSH ke Stack (LIFO)
        
        System.out.println("\nBerhasil mengunjungi halaman!");
        System.out.println();
    }
    
    // 2. POP - Tombol Back
    public void tombolBack() {
        if (history.isEmpty()) {  // ✅ Handle EmptyStackException
            System.out.println("History kosong! Tidak ada halaman untuk kembali.");
        } else {
            Website_2511532005 halamanTerakhir = history.pop();  // ✅ POP (LIFO)
            System.out.println("Kembali ke halaman sebelumnya:");
            System.out.println("Halaman yang ditutup: " + halamanTerakhir.getJudul_2005());
        }
        System.out.println();
    }
    
    // 3. PEEK - Lihat Halaman Aktif
    public void lihatHalamanAktif() {
        if (history.isEmpty()) {
            System.out.println("History kosong! Belum ada halaman yang dikunjungi.");
        } else {
            Website_2511532005 halamanAktif = history.peek();  // ✅ PEEK (tanpa hapus)
            System.out.println("Halaman Aktif Saat Ini:");
            halamanAktif.tampilkanWebsite();
        }
        System.out.println();
    }
    
    // 4. CEK STATUS HISTORY
    public void cekStatusHistory() {
        if (history.isEmpty()) {
            System.out.println("History kosong. Belum ada riwayat penjelajahan.");
        } else {
            System.out.println("Jumlah total riwayat: " + history.size());
            System.out.println("Halaman teratas: " + history.peek().getJudul_2005());
        }
        System.out.println();
    }
    
    public void run() {
        int pilihan;
        do {
            tampilkanMenu();
            pilihan = input.nextInt();
            input.nextLine(); // Clear buffer
            
            switch (pilihan) {
                case 1:
                    kunjungiWebsite();
                    break;
                case 2:
                    tombolBack();
                    break;
                case 3:
                    lihatHalamanAktif();
                    break;
                case 4:
                    cekStatusHistory();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    System.out.println();
            }
        } while (pilihan != 5);
    }
    
    public static void main(String[] args) {
        Browser_2511532005 browser = new Browser_2511532005();
        browser.run();
    }
}