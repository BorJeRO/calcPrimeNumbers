package calcPrimeNumbers;

import java.util.Scanner;

public class PrimeNumbers {
	String startApp() {
		System.out.println("Write an integer: ");
		return null;
	}

	int inputFromKeyboard() {
		Scanner keyboard = new Scanner(System.in);
		int myint = keyboard.nextInt();
		return myint;
	}

	public void isPrimeOrNot(int myint) {

			int count = 0;
			int i;
			for (i = 2; i < myint; i++) {
				if (myint % i == 0) {
					count++;
					break;
				}
			}
			if (myint == -1) {
				System.out.print("Good Bye!\n");
			} else if (count == 0) {
				System.out.print("This is a Prime Number \n");
			}
			else
				System.out.print("This is not a Prime Number \n");
		}
}

