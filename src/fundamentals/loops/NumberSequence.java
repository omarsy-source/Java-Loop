package fundamentals.loops;

import java.util.Scanner;

// Eine obere Grenze einlesen und die Zahlen von 1 bis zu dieser Grenze ausgeben.
public class NumberSequence {

	public static void main(String[] args) {
		// Scanner liest die eingegebene ganze Zahl aus der Konsole.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie eine Zahl ein: ");
		int upperLimit = scanner.nextInt();
		// Die Schleife zählt aufwärts; es wird keine Summe berechnet.
		for (int currentNumber =1; currentNumber <= upperLimit; currentNumber++) {
			System.out.print(currentNumber + " ");
		}

	}

}
