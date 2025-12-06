package Aufgabe05;

import java.util.Scanner;

public class Aufgabe04 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Bitte eine ganze Zahl eingeben: "); 
		int dezimal = in.nextInt(); 
		String binaer = ""; 
		while ( dezimal> 0) {
		int rest = (dezimal % 2);
		binaer = rest + binaer; //داخل الحلقة: هذا السطر مهم جدًا. إنه يأخذ قيمة rest (الـ 0 أو 1) ويضيفها إلى بداية النص binaer.
		dezimal = dezimal / 2; //داخل الحلقة: يقوم بقسمة قيمة dezimal على 2 (قسمة صحيحة، أي يتم تجاهل البواقي العشرية).
	
		}
		System.out.println("Ergebnis: " +  binaer);
		in.close();
	}

}
