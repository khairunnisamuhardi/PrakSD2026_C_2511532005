package pekan2_2511532005;

public class DaftarKataDriver_2511532005 {
	public static void main(String[] args) {
	
	DaftarKata_2511532005 al = new DaftarKata_2511532005();
	
	// menambah elemen (akhir)
	al.tambah_2511532005("Kami ");
	al.tambah_2511532005("Informatika ");
	
	// Menyisipkan elemen pada indeks 1
	al.tambahPada_2511532005(1,"Mahasiswa");
	
	// cetak isi awal
	System.out.println (" Awal 			: " + al);
	
	// mengubah elemen (index 1 )
	al.ubahElemen_2511532005(1, "Departemen");
	System.out.println("Setelah Ubah : " + al);
	
	// menghapus elemen (hapus indeks 0)
	String terhapus = al.hapusElemen_2511532005(0);
	System.out.println("Terhapus :" + terhapus);
	System.out.println("Setelah Hapus: " + al);
	
	// iterasi pada ArrayList (cetak setiap elemen)
	System.out.print("Iterasi:");
	al.iterasiCetak_2511532005();
	System.out.println();
}
}
