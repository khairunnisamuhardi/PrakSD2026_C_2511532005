package Pekan5_2511532005;

public class Pasien_2511532005 {
	private String namaPasien_2005;
	private String penyakit_2005;
	private int nomorAntrian_2005;
	private Pasien_2511532005 next_2005;
	
	// inisialisasi atribut
	public Pasien_2511532005(String namaPasien_2005, String penyakit_2005, int nomorAntrian_2005) {
        this.namaPasien_2005 = namaPasien_2005;
        this.penyakit_2005 = penyakit_2005;
        this.nomorAntrian_2005 = nomorAntrian_2005;
        this.next_2005 = null;
    }
    // Getter
    public String getNamaPasien_2005() { return namaPasien_2005;}
    public String getPenyakit_2005() {return penyakit_2005;}
    public int getNomorAntrian_2005() {return nomorAntrian_2005;}
    public Pasien_2511532005 getNext_2005() { return next_2005; }
    
    // setter
    public void setNamaPasien_2005(String namaPasien_2005) {
        this.namaPasien_2005 = namaPasien_2005;
    }
    public void setPenyakit_2005(String penyakit_2005) {
        this.penyakit_2005 = penyakit_2005;
    }
    public void setNext_2005(Pasien_2511532005 next_2005) {
        this.next_2005 = next_2005;
    }
    public void setNext_2005(Pasien_2511532005 next_2005) { 
    	this.next_2005 = next_2005; 
    }
}
    