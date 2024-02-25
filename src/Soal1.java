import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan tiga bilangan bulat: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        // Memeriksa apakah semua bilangan adalah ribuan
        boolean isAllThousands = num1 >= 1000 && num1 < 10000 &&
                                 num2 >= 1000 && num2 < 10000 &&
                                 num3 >= 1000 && num3 < 10000;
        
        if (isAllThousands) {
            System.out.println("Semua bilangan adalah ribuan.");
        } else {
            System.out.println("Tidak semua bilangan adalah ribuan.");
        }
        
        scanner.close();
    }
}
