package BasicJava;

import java.util.Scanner;

public class cgpa {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("First subject marks: ");
		int mark1=sc.nextInt();
		System.out.println("Second subject marks: ");
		int mark2=sc.nextInt();
		System.out.println("Third subject marks: ");
		int mark3=sc.nextInt();
		
		//converting marks to grade points
		double gp1=getGP(mark1);
		double gp2=getGP(mark2);
		double gp3=getGP(mark3);
		
		//cgpa calculation
		double cgpa=(gp1+gp2+gp3)/3;
		
		System.out.println("CGPA is "+cgpa);
		
		sc.close();

	}
	
	//function to convert marks to grade points
	public static double getGP(int marks) {
		if(marks>=90) return 10;
		else if(marks>=80) return 9;
		else if(marks>=70) return 8;
		else if(marks>=60) return 7;
		else if(marks>=50) return 6;
		else if(marks>=40) return 5;
		else return 0;
	}

}
