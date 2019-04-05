package Assign3;

import java.util.Scanner;

public class DifficultyLevel extends PlayerName {

	private static int chances = 0;
	static Scanner sc2=new Scanner(System.in);
    
	public int Level() {
		System.out.println("\n"+PlayerName.name+" before you start the game, please select the Difficulty Level");
		System.out.println("A ---> Child (10 chances)");
		System.out.println("B ---> Adult (7 chances)");
		System.out.println("C ---> Expert (5 chances)");


		System.out.print("Enter your choice [A,B or C]: ");
		//char n=(Character) null;
		char n;
		do {
			n = sc2.next().charAt(0);

		}	while(!checkValidation(n));
		return chances;
	}


	public boolean checkValidation(char n) {
		if(n == 'å')			// this is bug for testing
			n = 'a';
		switch(n){
		case 'A':
			chances=10;
			return true;
		case 'a':
			chances=10;
			return true;
		case 'B':
			chances=7;
			return true;
		case 'b':
			chances=7;
			return true;
		case 'C':
			chances =5;
			return true;
		case 'c':
			chances =5;
			return true;
		default:
			System.err.println("Invalid input!");
			System.out.print("Enter your choice [A,B or C]: ");
			return false;
		}
	}

}
