package pekan2_2511532005;

public class Musik_2511532005 {
	private String judul_2005;
	private String penyanyi_2005;
	private int durasi_2005;
	
	//coonstructor
	public Musik_2511532005(String judul, String penyanyi, int durasi) {
		this.judul_2005 = judul;
		this.penyanyi_2005 = penyanyi;
		this.durasi_2005 = durasi;
	}
	
	// getter
	public String getJudul_2005() {
		return judul_2005;
	}
	public String getPenyanyi_2005() {
		return penyanyi_2005;
	}
	public int getDurasi_2005() {
		return durasi_2005;
	}
	
	// setter
	public void setJudul_2005(String judul) {
		this.judul_2005 = judul;
	}
	public void setPenyanyi_2005(String penyanyi) {
		this.penyanyi_2005 = penyanyi;
	}
	public void setDurasi_2005(int durasi) {
		this.durasi_2005 = durasi;
	}
	
	// untuk menampilkan data
	public void tampilkanLagu() {
		System.out.println("Judul : " + judul_2005);
		System.out.println("Penyanyi : " + penyanyi_2005);
		System.out.println("Durasi : " + durasi_2005);
	}
 }
