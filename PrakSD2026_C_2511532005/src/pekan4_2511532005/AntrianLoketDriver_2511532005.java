package pekan4_2511532005;
import java.util.Scanner;

public class AntrianLoketDriver_2511532005 {
	public static void main(String[] args) {
		Scanner scanner_2005 = new Scanner(System.in);
		AntrianLoket_2511532005 antrian_2005 = new AntrianLoket_2511532005(100);
		
		while (true) {
			System.out.println("\n===PROGRAM ANTRIAN LOKET===");
			System.out.println("1. Tambah Antrian");
			System.out.println("2. Hapus Antrian");
			System.out.println("3. Tampilkan Antrian");
			System.out.println("4. Reverse");
			System.out.println("5. Keluar");
			System.out.print("Pilih menu: ");
			
			int pilihan_2005 = scanner_2005.nextInt();
			scanner_2005.nextLine();
			
			switch (pilihan_2005) {
				case 1:
					System.out.print("Masukkan nama pelanggan: ");
					String nama_2005 = scanner_2005.nextLine();
					antrian_2005.enqueue_2005(nama_2005);
					System.out.println("Data berhasil ditambahkan ke antrian");
					break;
					
				case 2:
					String pelanggan_2005 = antrian_2005.dequeue_2005();
					if (pelanggan_2005 != null) {
						System.out.println(pelanggan_2005 + " telah dilayani");
					} else {
						System.out.println("Antrian kosong!");
					}
					break;
					
				case 3:
					antrian_2005.display_2005();
					break;
					
				case 4:
					antrian_2005.reverse_2005();
					System.out.println("Antrian berhasil di-reverse");
					antrian_2005.display_2005(); 
					break;
					
				case 5:
					System.out.println("Terima kasih!");
					return;
					
				default:
					System.out.println("Pilihan tidak valid!");
			}
		}
	}
}
