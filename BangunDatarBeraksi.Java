public class BangunDatarBeraksi {
    public static void main(String[] args) {
        BangunDatar bangun = new BangunDatar();

        // Hitung luas segitiga
        bangun.setAlas(10);
        bangun.setTinggi(5);
        bangun.hitungLuasSegitiga();
        System.out.println("Luas Segitiga: " + bangun.getHasil());

        // Hitung luas lingkaran
        bangun.setJariJari(7);
        bangun.hitungLuasLingkaran();
        System.out.println("Luas Lingkaran: " + bangun.getHasil());
    }
}
