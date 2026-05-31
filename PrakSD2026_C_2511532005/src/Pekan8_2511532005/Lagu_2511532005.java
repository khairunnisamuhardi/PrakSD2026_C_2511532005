package Pekan8_2511532005;

public class Lagu_2511532005 {
	    String judul;
	    String penyanyi;
	    int durasi;

	    // Konstruktor
	    public Lagu_2511532005 (String judul, String penyanyi, int durasi) {
	        this.judul = judul;
	        this.penyanyi = penyanyi;
	        this.durasi = durasi;
	    }

	    // Getter untuk durasi
	    public int getDurasi() {
	        return this.durasi;
	    }

	    // Method untuk menampilkan data lagu
	    public void tampilkan() {
	        System.out.println(judul + " - " + durasi + " detik");
	    }
}
