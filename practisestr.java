package BasicJava;

import java.util.Scanner;

public class practisestr {

	public static void main(String[] args) {
		String n = "This is a String";
		
		//question2
		System.out.println("After replacing spaces: " + n.replace(' ','_'));
		
		//question3
		String nu = "Dear <|name|>, Trans a lot";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a name to replace: ");
		String nm = sc.nextLine();
		System.out.println("replacing name with the entered name: " + nu.replace("<|name|>",nm));
		
		//question4
		String l = "This string contains  double and   triple spaces!!";
		
		
		//question5
		String letter = "Dear Harry,\n\tThis Java Course is nice.\nThanks";
		System.out.println(letter);

	}

}
