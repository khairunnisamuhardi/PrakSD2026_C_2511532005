package pekan3_2511532005;

public class Website_2511532005 {
    // Atribut dengan akhiran 4 digit terakhir NIM (2005)
    private String judul_2005;
    private String url_2005;
    
    // Constructor
    public Website_2511532005(String judul, String url) {
        this.judul_2005 = judul;
        this.url_2005 = url;
    }
    
    // Getter (Selektor)
    public String getJudul_2005() {
        return judul_2005;
    }
    
    public String getUrl_2005() {
        return url_2005;
    }
    
    // Setter (Mutator)
    public void setJudul_2005(String judul) {
        this.judul_2005 = judul;
    }
    
    public void setUrl_2005(String url) {
        this.url_2005 = url;
    }
    
    // Method untuk menampilkan detail website
    public void tampilkanWebsite() {
        System.out.println("Judul: " + judul_2005);
        System.out.println("URL: " + url_2005);
        System.out.println("------------------------");
    }
}