package tugas4;
import  java.util.Scanner;

public class soal3 {
    public static void main(String[]afd){
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukkan Nilai =");
		double nilai = sc.nextDouble();

		if(nilai>=0 && nilai <=100){
			} if(nilai>=80 && nilai<=100) {
			System.out.println("Nilai:"+nilai);
			System.out.println("Nilai A");
			System.out.println("Nilai indek: 4.0");
			}else if(nilai>=70 && nilai<80) {
			System.out.println("Nilai:"+nilai);
			System.out.println("Nilai B");
			System.out.println("Nilai indek: 3.0");
			}else if(nilai>=60 && nilai<70) {
			System.out.println("Nilai:"+nilai);
			System.out.println("Nilai C");
			System.out.println("Nilai indek: 2.0");
			}else if(nilai>=50 && nilai<60) {
			System.out.println("Nilai:"+nilai);
			System.out.println("Nilai D");
			System.out.println("Nilai indek: 2.0");
			}else if(nilai>=0 && nilai<50) {
			System.out.println("Nilai:"+nilai);
			System.out.println("Nilai E");
			System.out.println("Nilai indek: 0");
		}else{
			System.out.println("inputan nilai salah");
		}
	}  
}
