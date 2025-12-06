package Aufgabe05;

import java.util.Scanner;

public class Aufgabe03 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int bonbonPreis = 0;
		int anzahl = 0;
		System.out.println ( "Wie viel Geld haben Sie in Cent : ");
		int geldBetrag = in.nextInt();	
		while (geldBetrag >= bonbonPreis && anzahl <10  ) {
			bonbonPreis +=10;
			anzahl++;
			geldBetrag = geldBetrag - bonbonPreis;
		}
		System.out.println (" Anzahl = " + anzahl);
		System.out.println (" rest = " + geldBetrag);
		in.close();
	}


}
