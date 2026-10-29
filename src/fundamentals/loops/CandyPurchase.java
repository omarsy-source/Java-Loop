package fundamentals.loops;

import java.util.Scanner;

// Bonbons mit steigenden Preisen kaufen und das Restgeld anzeigen.
public class CandyPurchase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		// Preis und gekaufte Anzahl beginnen bei null.
		int candyPrice = 0;
		int candyCount = 0;
		System.out.println ( "Wie viel Geld haben Sie in Cent : ");
		int moneyAmount = scanner.nextInt();	
		// Vor jedem Kauf das Restgeld mit dem bisherigen Preis vergleichen; höchstens zehn Bonbons kaufen.
		while (moneyAmount >= candyPrice && candyCount <10  ) {
			// Der Preis steigt beim nächsten Kauf um zehn Cent.
			candyPrice +=10;
			candyCount++;
			// Den erhöhten Preis vom Restgeld abziehen.
			moneyAmount = moneyAmount - candyPrice;
		}
		// Gekaufte Anzahl und verbleibendes Geld ausgeben.
		System.out.println (" Anzahl = " + candyCount);
		System.out.println (" rest = " + moneyAmount);
		scanner.close();
	}


}
