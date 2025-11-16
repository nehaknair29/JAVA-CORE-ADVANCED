package BasicJava;

import java.util.Scanner;


public class percentagecalcu {

	public static void main(String[] args) {
		//taking input for 5 subjects
		Scanner s = new Scanner(System.in);
		System.out.println("Enter marks for first subject: ");
		float s1=s.nextFloat();
		System.out.println("Enter marks for second subject: ");
		float s2=s.nextFloat();
		System.out.println("Enter marks for third subject: ");
		float s3=s.nextFloat();
		System.out.println("Enter marks for fourth subject: ");
		float s4=s.nextFloat();
		System.out.println("Enter marks for fifth subject: ");
		float s5=s.nextFloat();
		float percentage=((s1+s2+s3+s4+s5)/500)*100;
		System.out.println("Percentage is: "+percentage);
		
		s.close();
		
	}

}
 