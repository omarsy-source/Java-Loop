package fundamentals.conversion;

import java.util.Scanner;

// Eine positive Dezimalzahl durch wiederholtes Teilen in eine Binärzahl umwandeln.
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Bitte eine ganze Zahl eingeben: "); 
		int decimalNumber = scanner.nextInt(); 
		// Die Binärzahl zunächst als leeren Text speichern.
		String binaryNumber = ""; 
		// Wiederholen, solange die verbleibende Zahl positiv ist.
		while ( decimalNumber> 0) {
		// Der Rest bei Division durch zwei ist die nächste Binärziffer: 0 oder 1.
		int remainder = (decimalNumber % 2);
		binaryNumber = remainder + binaryNumber; // Den Rest vorne an die Binärzahl anhängen.
		decimalNumber = decimalNumber / 2; // Ganzzahlig durch zwei teilen; Nachkommastellen werden verworfen.
	
		}
		System.out.println("Ergebnis: " +  binaryNumber);
		scanner.close();
	}

}
