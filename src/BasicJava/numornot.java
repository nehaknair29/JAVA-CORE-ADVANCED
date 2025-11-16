package BasicJava;

import java.util.Scanner;

public class numornot {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		System.out.println(s.hasNextInt());
		int num = s.nextInt();
		if(true) {
			System.out.println("Yes it is an integer");
		}
		
		s.close();
	}

}
