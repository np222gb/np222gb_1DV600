package Assign3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Hangman_Main {

	public static String randomWord = "";
	public static int chances = 0;
	public static String name = "";
	static Scanner sc = new Scanner(System.in);
	static Scanner sc2 = new Scanner(System.in);
	public static boolean restart;
	static int number;

	public boolean restart() {
		System.out.println("\nDo you want to restart the game?\n1 --> Start game\n2 --> Quit game");
		int num = sc.nextInt();
		if (num == 1) {
			return true;
		} else {
			System.out.println("Goodbye!");
			return false;
		}

	}

	public static void main(String[] args) {

		PlayerName details = new PlayerName();
		DifficultyLevel level = new DifficultyLevel();
		Guessing guess = new Guessing();
		System.out.println("Welcome to the game of Hangman. Save the man, Win the game!!");
		System.out.println("\nChoose an integer:\n1 --> Start game\n2 --> Quit game\n3 --> Instructions");
		do { 
			number = sc.nextInt();
			do {
				if (number == 1) {
					name = details.UserName();
					chances = level.Level();
					System.out.println();
					System.out.println(name + ", you may start the game now!");
					System.out.println("Good Luck\n");
					System.out.println("Guess the word");
					String newWord = "";
					File file = new File("C:\\Users\\MY PC\\Desktop\\hangman.txt");
					Random random = new Random();
					int randomNumber = random.nextInt(100);
					try {
						@SuppressWarnings("resource")
						Scanner scan = new Scanner(file);
						while (scan.hasNext() && randomNumber != 0) {
							randomWord = scan.next();
							randomNumber--;
						}
						randomWord = randomWord.toLowerCase(); // convert our random word to lower case
						newWord = randomWord.replace("", " ").trim();

					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}

					restart = guess.guessWord(newWord, chances);
					
				} else if (number == 2) {
					System.out.println("Goodbye!");
				} 	
				
				else if(number==3) {
					Instructions rule= new Instructions();
					rule.intro();
				}
			} while (restart);
		} while (!state(number));
	}
		

	public static boolean state(int number) {
		if (number == 1 || number == 2 || number==3)
			return true;
		else {
			System.err.println("Invalid Input. Try again!");
			return false;
		}
	}
}
