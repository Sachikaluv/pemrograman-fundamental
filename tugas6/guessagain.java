package tugas6;
import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class guessagain {
    public static void main(String args[]) {
		Scanner keyboard = new Scanner (System.in);
		
		int numGuesses = 0;
		int randomNumber = new Random() .nextInt(10) + 1;
		
		out.println("     *****************      ");
		out.println("welcome to the Guessing Game");
		out.println("     *****************      ");
		out.println();
		
		out.print("Enter an int from 1 to 10: ");
		int inputNumber = keyboard.nextInt();
		numGuesses++;
		
		while (inputNumber != randomNumber) {
			out.println();
			out.println("Try again...");
			out.println("Enter an int from 1 to 10: ");
			inputNumber = keyboard.nextInt();
			numGuesses++;
		}
		out.print("You win after ");
		out.println(numGuesses + " guesses.");
		
		keyboard.close();
	}
}
