package BasicJava;

import java.util.Scanner;

public class kmtomile {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter in kilometers:");
		float km=s.nextFloat();
		
		double miles=km*0.621371;
		System.out.println("Entered kilometers in miles is "+miles);
		s.close();

	}

}
