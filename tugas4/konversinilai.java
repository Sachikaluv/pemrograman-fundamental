package tugas4;
import java.util.Scanner;

public class konversinilai {
    public static void main(String[] asg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai angka: ");
        double nilai = scanner.nextDouble();
        scanner.close();
        
        char nilaiHuruf;
        
        if (nilai >= 0 && nilai <= 100) {
            int nilaiangka = (int) nilai;
            switch (nilaiangka / 10) {
                case 10:
                case 8:
                    nilaiHuruf = 'A';
                    break;
                case 7:
                    nilaiHuruf = 'B';
                    break;
                case 6:
                    nilaiHuruf = 'C';
                    break;
                case 5:
                    nilaiHuruf = 'D';
                    break;
                default:
                    nilaiHuruf = 'E';
            }
            System.out.println("Nilai Huruf : "+nilaiHuruf);
        } else {
            System.out.println("Nilai Tidak Valid");
        }
    }
}
