package Aufgabe05;

import java.util.Scanner;

public class Aufgabe02 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println (" Geben Sie x ein : ");
		int x = in.nextInt();
		System.out.println (" Geben Sie y ein : ");
		int y = in.nextInt();
		if ( x > y) {
			int o = x;
			x = y;
			y = o;
	}
		for ( int i = y ; i >=x ; i--) {
			System.out.println (i);
		}
		in.close();
	}
}
