package BasicJava;

import java.util.Scanner;

public class conditionalsandswitch {

	public static void main(String[] args) {
		
		//Question1
		int a = 10;
		if(a==11)
			System.out.println("I am 11");
		else
			System.out.println("I am not 11");
		
		//Question2
     	Scanner s = new Scanner(System.in);
		System.out.println("Enter marks in physics: ");
		byte phy = s.nextByte();
		System.out.println("Enter marks in chemistry: ");
		byte chem = s.nextByte();
		System.out.println("Enter marks in math: ");
		byte math = s.nextByte();
		float total = (phy+chem+math)/3.0f;
		System.out.println("Total average marks:" + total);
		
		if (phy >= 33 && chem >= 33 && math >=33 && total >= 40) {
			System.out.println("Pass!!");
		}
	    else
	    	System.out.println("Fail");
			
		//Question3
		float tax = 0;
		System.out.println("Enter the income: ");
		float income = s.nextFloat();
		if (income <= 2.5)
            tax = 0;
        else if (income <= 5.0)
            tax = 0.05f * (income - 2.5f);
        else if (income <= 10.0)
            tax = (0.05f * 2.5f) + (0.20f * (income - 5.0f));
        else if (income > 10.0)
            tax = (0.05f * 2.5f) + (0.20f * 5.0f) + (0.30f * (income - 10.0f));
        else
            System.out.println("Invalid Entry!!");
		System.out.println("Total Income Tax = ₹" + (tax*100000));
		
		//Question4
		System.out.println("Enter the number for day:");
		int day = s.nextInt();
		switch (day) {
		case 1:System.out.println("1.Sunday.");break;
		case 2:System.out.println("2.Monday.");break;
		case 3:System.out.println("3.Tuesday.");break;
		case 4:System.out.println("4.Wednesday.");break;
		case 5:System.out.println("5.Thursday.");break;
		case 6:System.out.println("6.Friday.");break;
		case 7:System.out.println("7.Saturday.");break;
		}
		
		//Question5
		System.out.println("Enter a year: ");
		int year = s.nextInt();
		if(year%4 == 0)
			System.out.println("You have entered a leap year!");
		else
			System.out.println("You have enteredd a non-leap year!");
		
		//Question6
		//to find out the type of website using url
		System.out.println("Enter a website: ");
		String web = s.next();
		if(web.endsWith(".com"))
			System.out.println("You have entered a Commercial Website.");
		else if(web.endsWith(".org"))
			System.out.println("You have entered a Organization Website.");
		else if(web.endsWith(".in"))
			System.out.println("You have entered an Indian Website.");
		else
			System.out.println("!!Invalid Entry!!!");
		

	}

}
