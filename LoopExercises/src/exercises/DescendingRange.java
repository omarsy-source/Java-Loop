package exercises;

import java.util.Scanner;

// Zwei Grenzen einlesen und alle Zahlen dazwischen absteigend ausgeben.
public class DescendingRange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println (" Geben Sie x ein : ");
		int x = scanner.nextInt();
		System.out.println (" Geben Sie y ein : ");
		int y = scanner.nextInt();
		// Die Grenzen bei Bedarf tauschen, damit x die kleinere Zahl ist.
		if ( x > y) {
			int temporaryValue = x;
			x = y;
			y = temporaryValue;
	}
		// Von der größeren bis zur kleineren Grenze rückwärts zählen.
		for ( int currentNumber = y ; currentNumber >=x ; currentNumber--) {
			System.out.println (currentNumber);
		}
		// Die Eingabe nach der Ausgabe schließen.
		scanner.close();
	}
}
