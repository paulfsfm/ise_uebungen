package uebung1;

import java.util.Locale;
import java.util.Scanner;

public class Zinsrechner {

	public static void main(String[] args) {
		
		double zs;
		double lz;
		double ab = 1000;
		double z;
		double eb;
		
		// Datenaufnahme
		Scanner in= new Scanner(System.in).useLocale(Locale.ENGLISH);
		System.out.print("Bitte geben Sie den Zinssatz (in Prozent) ein: ");
		zs = in.nextDouble();
		zs = zs/100;
		
		System.out.print("Bitte geben Sie die Laufzeit (in Jahren) ein: ");
		lz = in.nextDouble();
		
		System.out.print("Bitte geben Sie den Anlagebetrag ein: ");
		ab = in.nextDouble();
		
		//Ausgabe f�r eine bessere �bersichtlichkeit
		System.out.println();
		System.out.println("Jahr      Anfangsbetrag     Zinsen     Endbetrag");
		  
		// Kalkulation und Ausgabe
		for (int i = 0; i <= lz;i++) {
			z = zs * ab;
			eb = ab + z;
			System.out.println(i+"           "+ab+"           "+z+"       "+eb);
			ab += z;
		}
			

	}

}