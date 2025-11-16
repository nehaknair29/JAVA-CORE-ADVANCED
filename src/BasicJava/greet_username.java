package BasicJava;

import java.util.Scanner;


public class greet_username {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=s.nextLine();
		
		//greeting with user input name
		System.out.println("Hello " + name + "! Have a good day!");
		s.close();
	}

}
