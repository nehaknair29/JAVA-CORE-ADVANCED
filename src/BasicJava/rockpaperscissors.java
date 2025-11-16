package BasicJava;

import java.util.Random;
import java.util.Scanner;
	

public class rockpaperscissors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		//0 for Rock
		//1 for Paper
		//2 for Scissors
		System.out.println("Enter the choice(0,1,2): ");
		int user_input = sc.nextInt();
		
		int computer_input = random.nextInt(3);
		
		if(user_input == computer_input) {
			System.out.println("Tie -_-");
		} else if(user_input == 0 && computer_input ==2 || user_input == 1 && computer_input == 0 || user_input == 2 && computer_input == 1) {
			System.out.println("You Won!!");
		}else {
			System.out.println("-_- -_- You lost the game!!! Better Luck Next Time -_- ");
		}
		System.out.println("Computer Choice " + computer_input);
		
	}

}
