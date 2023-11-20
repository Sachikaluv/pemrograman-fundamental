package tugas4;
import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

public class soal1 {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		out.print("Input Nilai Huruf : ");
		String nilaihuruf = sc.nextLine();
		
		String nilaiindeks;
		switch (nilaihuruf){
			case "A":
			nilaiindeks = "4.0";
			break;
			case "B":
			nilaiindeks = "3.0";
			break;
			case "C":
			nilaiindeks = "2.0";
			break;
			case "D":
			nilaiindeks = "1.0";
			break;
			case "E":
			nilaiindeks = "0.0";
			break;
			default:
			nilaiindeks = "Konversi nilai tidak valid";
			break;
		}
		System.out.println("Nilai Index = "+nilaiindeks);
	}
}
