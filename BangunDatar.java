/**
 * Nama  : Muhammad Fadilah
 * NPM   : 2310010609
 * Kelas : 4 A REG BJM
 */
public class BangunDatar {
    
    // Constructor tanpa parameter
    public BangunDatar() {
        // Inisialisasi jika perlu
    }
    
    // Contoh method menghitung luas (harus di-override di subclass)
    public double hitungLuas() {
        System.out.println("Luas belum diimplementasikan untuk BangunDatar umum.");
        return 0;
    }
    
    // Contoh method menghitung keliling (harus di-override di subclass)
    public double hitungKeliling() {
        System.out.println("Keliling belum diimplementasikan untuk BangunDatar umum.");
        return 0;
    }
}
