package tugas4;
import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

public class percabangan {
    public static void main (String[] asg) {
        Scanner scanner = new Scanner(System.in);
            out.print("Masukkan Nilai Huruf: ");
            String nilaiHuruf = scanner.next();
            double nilaiIndeks;
            
            //mengkonversi nilai huruf ke nilai indeks menggunakan if-else
            if (nilaiHuruf.equals("A")) {
                nilaiIndeks= 4.0;
            } else if (nilaiHuruf.equals("B")) {
                nilaiIndeks = 3.0;
            } else if (nilaiHuruf.equals("C")) {
                nilaiIndeks = 2.0;
            } else if(nilaiHuruf.equals("D")) {
                nilaiIndeks = 1.0;
            } else if (nilaiHuruf.equals("E")) {
                nilaiIndeks = 0.0;
            } else {
                System.out.println("Maaf, konveksi nilai tidak valid.");
                return;//keluar dari program jika nilai tidak valid 
            }
            //Menampilkan hasil konversi
            System.out.println("Nilai indeks : " + nilaiIndeks);
        }
}
