package Pekan5_2511532005;

import java.util.Scanner;

public class RumahSakit_2511532005 {
    private Pasien_2511532005 head_2005;
    private int counter_2005;

    public RumahSakit_2511532005() {
        this.head_2005 = null;
        this.counter_2005 = 0;
    }

    // Daftarkan Pasien (Insert at Tail) - Auto increment nomor antrian
    public void daftarkanPasien_2005(String namaPasien_2005, String penyakit_2005) {
        counter_2005++;
        Pasien_2511532005 newPasien_2005 = new Pasien_2511532005(namaPasien_2005, penyakit_2005, counter_2005);

        if (head_2005 == null) {
            // Jika list kosong, node baru jadi head
            head_2005 = newPasien_2005;
        } else {
            // Telusuri ke node terakhir
            Pasien_2511532005 curr_2005 = head_2005;
            while (curr_2005.getNext_2005() != null) {
                curr_2005 = curr_2005.getNext_2005();
            }
            // Set pointer next node terakhir ke node baru
            curr_2005.setNext_2005(newPasien_2005);
        }
        System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: " + counter_2005);
    }

    // Panggil Pasien (Delete Head)
    public void panggilPasien_2005() {
        if (head_2005 == null) {
            System.out.println("Antrian kosong, tidak ada pasien yang dapat dipanggil.");
        } else {
            System.out.println("Pasien yang dipanggil:");
            System.out.println("Nomor Antrian: " + head_2005.getNomorAntrian_2005());
            System.out.println("Nama        : " + head_2005.getNamaPasien_2005());
            System.out.println("Keluhan    : " + head_2005.getPenyakit_2005());
            // Geser head ke node berikutnya
            head_2005 = head_2005.getNext_2005();
        }
    }

    // Tampilkan Antrian (Display) - Menampilkan posisi pasien
    public void tampilkanAntrian_2005() {
        if (head_2005 == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        Pasien_2511532005 curr_2005 = head_2005;
        int posisi_2005 = 1;
        System.out.println("Daftar Antrian Pasien:");
        while (curr_2005 != null) {
            System.out.println("Posisi " + posisi_2005 + " - Nomor Antrian: " + 
                               curr_2005.getNomorAntrian_2005() + 
                               ", Nama: " + curr_2005.getNamaPasien_2005() +
                               ", Keluhan: " + curr_2005.getPenyakit_2005());
            curr_2005 = curr_2005.getNext_2005();
            posisi_2005++;
        }
    }

    // Cari Pasien (Search) - Case insensitive
    public void cariPasien_2005(String namaCari_2005) {
        if (head_2005 == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        Pasien_2511532005 curr_2005 = head_2005;
        boolean found_2005 = false;
        while (curr_2005 != null) {
            if (curr_2005.getNamaPasien_2005().equalsIgnoreCase(namaCari_2005)) {
                System.out.println("Pasien ditemukan:");
                System.out.println("Nomor Antrian: " + curr_2005.getNomorAntrian_2005());
                System.out.println("Nama        : " + curr_2005.getNamaPasien_2005());
                System.out.println("Keluhan    : " + curr_2005.getPenyakit_2005());
                found_2005 = true;
                break;
            }
            curr_2005 = curr_2005.getNext_2005();
        }
        if (!found_2005) {
            System.out.println("Pasien dengan nama '" + namaCari_2005 + "' tidak ditemukan.");
        }
    }

    // Cek Status Antrian
    public void cekStatusAntrian_2005() {
        if (head_2005 == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        int totalPasien_2005 = 0;
        Pasien_2511532005 curr_2005 = head_2005;
        while (curr_2005 != null) {
            totalPasien_2005++;
            curr_2005 = curr_2005.getNext_2005();
        }
        System.out.println("Total pasien dalam antrian: " + totalPasien_2005);
        System.out.println("Pasien terdepan:");
        System.out.println("Nomor Antrian: " + head_2005.getNomorAntrian_2005());
        System.out.println("Nama        : " + head_2005.getNamaPasien_2005());
        System.out.println("Keluhan    : " + head_2005.getPenyakit_2005());
    }

    // Main method dengan menu sesuai contoh output
    public static void main(String[] args) {
        RumahSakit_2511532005 rs_2005 = new RumahSakit_2511532005();
        Scanner input_2005 = new Scanner(System.in);
        int pilihan_2005;

        do {
            System.out.println("\n=== Antrian Rumah Sakit NIM: 2511532005 ===");
            System.out.println("1. Daftarkan Pasien (Insert)");
            System.out.println("2. Panggil Pasien   (Delete Head)");
            System.out.println("3. Tampilkan Antrian (Display)");
            System.out.println("4. Cari Pasien      (Search)");
            System.out.println("5. Cek Status Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            
            pilihan_2005 = input_2005.nextInt();
            input_2005.nextLine();

            switch (pilihan_2005) {
                case 1:
                    System.out.print("Masukkan Nama Pasien : ");
                    String nama_2005 = input_2005.nextLine();
                    System.out.print("Masukkan Keluhan     : ");
                    String keluhan_2005 = input_2005.nextLine();
                    rs_2005.daftarkanPasien_2005(nama_2005, keluhan_2005);
                    break;
                case 2:
                    rs_2005.panggilPasien_2005();
                    break;
                case 3:
                    rs_2005.tampilkanAntrian_2005();
                    break;
                case 4:
                    System.out.print("Masukkan Nama Pasien yang dicari : ");
                    String cari_2005 = input_2005.nextLine();
                    rs_2005.cariPasien_2005(cari_2005);
                    break;
                case 5:
                    rs_2005.cekStatusAntrian_2005();
                    break;
                case 6:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan_2005 != 6);

        input_2005.close();
    }
}
