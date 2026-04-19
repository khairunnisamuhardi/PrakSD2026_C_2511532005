package pekan2_2511532005;
import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511532005 {
	private ArrayList<Musik_2511532005> playlist;
	private Scanner input;
	
	public Playlist_2511532005() {
		playlist = new ArrayList<>();
		input = new Scanner(System.in);
	}
	
	public void tampilkanMenu() {
		System.out.println("=== Playlist Musik NIM : 2511532005 ===");
		System.out.println("1. Tambah Lagu");
		System.out.println("2. Lihat Playlist");
		System.out.println("3. Hapus Lagu");
		System.out.println("4. Cek Kapasitas");
		System.out.println("5. Keluar");
		System.out.println("Pilihan : ");
	}
	
	public void tambahLagu() {
		System.out.print("Masukkan Judul: ");
		String judul = input.nextLine();
		System.out.print("Masukkan Penyanyi: ");
		String penyanyi = input.nextLine();
		System.out.print("Masukkan Durasi (detik): ");
		int durasi = input.nextInt();
		input.nextLine();
		
		Musik_2511532005 LaguBaru = new Musik_2511532005(judul, penyanyi, durasi);
		playlist.add(LaguBaru);
		System.out.println("Data berhasil ditambahkan!");
		System.out.println();
		
	}
	
	public void LihatPlaylist() {
		if (playlist.isEmpty()) {
			System.out.println("Playlist kosong");
		
		} else {
			System.out.println("=== DAFTAR LAGU ===");
			for (int i = 0; i < playlist.size(); i++) {
				System.out.println((i+1) + ". ");
				playlist.get(i).tampilkanLagu();
			}
		}
		System.out.println();
	}
	
	public void hapusLagu() {
		if (playlist.isEmpty()) {
			System.out.println("Playlist kosong");
		} else {
			System.out.print("Masukkan nomor lagu yang ingin di hapus (1-" + playlist.size() + "): ");
			int nomor = input.nextInt() -1;
			input.nextLine();
			
			if (nomor >= 0 && nomor < playlist.size()) {
				System.out.println("Menghapus Lagu: " + playlist.get(nomor).getJudul_2005());
				playlist.remove(nomor);
				System.out.println("Lagu berhasil di hapus");
				
			} else {
				System.out.println("Nomor tidak valid");
			}
		}
		System.out.println();
	}
	
	public void cekKapasitas() {
		System.out.println("Jumlah total lagu : " + playlist.size());
		System.out.println();
	}
	
	public void run() {
		int pilihan;
		do {
			tampilkanMenu();
			pilihan = input.nextInt();
			input.nextLine();
			
			switch (pilihan) {
			case 1:
				tambahLagu();
				break;
			case 2:
				LihatPlaylist();
				break;
			case 3:
				hapusLagu();
				break;
			case 4:
				cekKapasitas();
				break;
			case 5:
				System.out.println("Terima Kasih");
				break;
			default:
				System.out.println("Pilihan tidak valid");
				System.out.println();
			}
		} while (pilihan != 5);
	}
	
	public static void main(String[] args) {
		Playlist_2511532005 playlistApp = new Playlist_2511532005();
		playlistApp.run();
	}
}
