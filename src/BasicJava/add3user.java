package BasicJava;

import java.util.Scanner;

public class add3user {
	
	public static void main(String[] args) {
		//adding using user input numbers
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first Number:");
		int num1=scanner.nextInt();
		System.out.println("Enter the second number:");
		int num2=scanner.nextInt();
		System.out.println("Enter the third number:");
		int num3=scanner.nextInt();
		
		//sum calculation
		int sum=num1+num2+num3;
		
		//printing the sum
		System.out.println("The sum is "+sum);
		
		//close the scanner
		scanner.close();
	}

}
