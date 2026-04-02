package pekan1_2511532005;

public class MobilDriver_2511532005 {
    public static void main(String[] args) {

        Mobil_2511532005 a = new Mobil_2511532005("Avanza", 2020, 1300, 150000000, "Toyota");
        Mobil_2511532005 b = new Mobil_2511532005("Brio", 2022, 1200, 180000000, "Honda");

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Mutator
        a.setHarga(160000000);
        System.out.println("a setelah ubah harga = " + a);

        // Selektor
        System.out.println("Nama mobil a = " + a.getNama());
        System.out.println("Merk mobil b = " + b.getMerk());

        // Tambah mobil (update semua data)
        a.tambahMobil("Xenia", 2021, 1300, 155000000, "Daihatsu");
        System.out.println("a setelah tambahMobil = " + a);

        // Hapus mobil
        b.hapusMobil();
        System.out.println("b setelah hapus = " + b);
    }
}