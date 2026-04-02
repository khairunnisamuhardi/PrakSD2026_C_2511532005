package pekan1_2511532005;

public class Mobil_2511532005 {
    private String nama;
    private int tahun;
    private int cc;
    private long harga;
    private String merk;

    // Konstruktor
    public Mobil_2511532005(String nama, int tahun, int cc, long harga, String merk) {
        this.nama = nama;
        this.tahun = tahun;
        this.cc = cc;
        this.harga = harga;
        this.merk = merk;
    }

    // Selektor (getter)
    public String getNama() { return nama; }
    public int getTahun() { return tahun; }
    public int getCc() { return cc; }
    public long getHarga() { return harga; }
    public String getMerk() { return merk; }

    // Mutator (setter)
    public void setNama(String nama) { this.nama = nama; }
    public void setTahun(int tahun) { this.tahun = tahun; }
    public void setCc(int cc) { this.cc = cc; }
    public void setHarga(long harga) { this.harga = harga; }
    public void setMerk(String merk) { this.merk = merk; }

    // Method tambah mobil (ubah data)
    public void tambahMobil(String nama, int tahun, int cc, long harga, String merk) {
        this.nama = nama;
        this.tahun = tahun;
        this.cc = cc;
        this.harga = harga;
        this.merk = merk;
    }

    // Method hapus mobil (reset)
    public void hapusMobil() {
        this.nama = "";
        this.tahun = 0;
        this.cc = 0;
        this.harga = 0;
        this.merk = "";
    }

    // toString
    @Override
    public String toString() {
        return nama + " | " + tahun + " | " + cc + "cc | Rp" + harga + " | " + merk;
    }
}