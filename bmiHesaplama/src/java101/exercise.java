package java101;

import java.util.Scanner;

public class exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double boy;
		double kilo;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("boyunuzu metre cinsinden giriniz :");
		boy = inp.nextDouble();
		
		System.out.print("kilonuzu giriniz :");
		kilo = inp.nextDouble();
		
		double kitleIndeksi = (kilo / (boy*boy));
		System.out.print("vücut kitle indeksi" + kitleIndeksi);	
	}

}
