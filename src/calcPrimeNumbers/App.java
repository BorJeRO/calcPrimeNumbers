package calcPrimeNumbers;

public class App {

	public static void main(String[] args) {
		int myint;
		do {
			PrimeNumbers app = new PrimeNumbers();
			app.startApp();
			myint = app.inputFromKeyboard();
			app.isPrimeOrNot(myint);
		} while (myint != -1);
	}
}
