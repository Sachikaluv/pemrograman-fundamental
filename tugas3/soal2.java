package tugas3;


import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int n = scanner.nextInt();

        System.out.println("Masukkan minimal angka: ");
        int minVal = scanner.nextInt();

        System.out.println("Enter the maximum value: ");
        int maxVal = scanner.nextInt();

        System.out.println("Enter the interval: ");
        int interval = scanner.nextInt();

        if (maxVal - minVal < interval) {
            System.out.println("Invalid interval");
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += minVal;
                minVal += interval;
            }
            System.out.println("Sum of terms: " + sum);
        }
    }

}