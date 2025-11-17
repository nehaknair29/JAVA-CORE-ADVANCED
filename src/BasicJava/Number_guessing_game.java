package BasicJava;

import java.util.Scanner;

public class Number_guessing_game {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		 int num = 1 + (int)(100 * Math.random());
		 
		 int k = 5; //Maximum number of times one can try the game
		 
		 System.out.println(
				 "A number is chosen between 1 and 100:");
		 System.out.println("You have "+ k + "Attempts to guess");
		 
		 //k attempts using for loop
		 for(int i=0; i<k; i++) {
			 System.out.println("Enter your guess:");
			 int guess = sc.nextInt();
			 
			 //conditions
			 if(guess == num) {
				 System.out.println("You have guessed it correct");
				 sc.close();
				 
				 //exit function if the number is guessed correctly
				 return;
				 
			 }
			 else if(guess > num) {
				 System.out.println("You have guessed a number way too high please lower it a little bit!");
			 }
			 else {
				 System.out.println("The entered number is less. Please a number little more high.");
				 
			 }
		 }
		
		 //if k attempts are over
		 System.out.println("You have ran out of attempts.");
		 System.out.println("The correct number was" + num);
		 sc.close();
		 
	}
	public static void main(String[] args) {
		Number_guessing_game();
	}

}
