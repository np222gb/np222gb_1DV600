package Assign3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Instructions extends Hangman_Main{

	static Scanner sc=new Scanner(System.in);
	static PlayerName details = new PlayerName();
	static DifficultyLevel level = new DifficultyLevel();
	static Guessing guess = new Guessing();
	private int integer;
	
	public void intro() {
		 
    	String s="Hangman is a simple word guessing game. You have to try to figure out an unknown word by guessing letters.You has limited number of lives to guess and for every incorrect guess, the lives decrease by one.If too many letters which do not appear in the word are guessed, the man is hanged (and you lose).";

		for(int i=0;i<s.length();i++) {
    		System.out.print(s.charAt(i));
    		if(i==105 || i== 203) {
    			System.out.println();}
    	}
			System.out.println("\n\nChoose an integer:");
			System.out.println("1 --> Start game\n2 --> Quit game");
			do {
			integer=sc.nextInt();
			do {
				if (integer == 1) {
					Hangman_Main.name = details.UserName();
					Hangman_Main.chances = level.Level();
					System.out.println();
					System.out.println(Hangman_Main.name + ", you are welcome to start the game now!");
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
							Hangman_Main.randomWord = scan.next();
							randomNumber--;
						}
						Hangman_Main.randomWord = Hangman_Main.randomWord.toLowerCase(); // convert our random word to lower case
						newWord = Hangman_Main.randomWord.replace("", " ").trim();

					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}

					restart = guess.guessWord(newWord, Hangman_Main.chances);
				}
				else if(integer==2) {
						System.out.println("Goodbye!");
					}
			} while (restart);
				} while (!stateIt(integer));
			}
	
	public static boolean stateIt(int number) {
		if (number == 1 || number == 2)
			return true;
		else {
			System.out.println("Invalid Input. Try again!");
			
			return false;
		}
	}
	}

