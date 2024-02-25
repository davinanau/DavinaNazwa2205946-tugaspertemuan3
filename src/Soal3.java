import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jam masuk dan jam keluar: ");
        int jamMasuk = scanner.nextInt();
        int jamKeluar = scanner.nextInt();
        
        // Menghitung lama parkir
        int lamaParkir = jamKeluar - jamMasuk;
        if (lamaParkir < 0) {
            lamaParkir += 24; // Menambahkan 24 jam jika jam keluar lebih kecil dari jam masuk
        }
        
        // Menghitung biaya parkir
        int biayaParkir = 1500; // Biaya untuk 2 jam pertama
        if (lamaParkir > 2) {
            biayaParkir += (lamaParkir - 2) * 1000; // Biaya untuk jam-jam berikutnya
        }
        
        System.out.println("Biaya parkir adalah: " + biayaParkir + " Rupiah");
        
        scanner.close();
    }
}
