package Assign3;

import java.util.ArrayList;
import java.util.Scanner;

public class Guessing {
	
	static Hangman_Main restart = new Hangman_Main();
	
public boolean guessWord(String word, int life) {
		
		char[] filler= new char[word.length()];
		int i=0;
		while(i<(word.length())) {     
			filler[i]='_';                  // replacing the word with blanks

			if(word.charAt(i) ==' ') {
				filler[i]=' ';
			}
			i++;
		}

		System.out.print(filler);
		System.out.println("          Life remaining= "+ life);

		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);

		ArrayList<Character> l= new ArrayList<Character>();
		while(life>0) {
			char x=s.next().charAt(0);

			if(l.contains(x)) {
				System.out.println("Already entered");
				continue;
			}

			l.add(x);
			if(word.contains(x+"")) {
				//count--;
				System.out.println("Correct Guess! ");

				for(int y=0;y<word.length();y++) {
					if(word.charAt(y)==x) {
						filler[y]=x;
	
					}
				}

			}
			else {
				System.out.println("Incorrect Guess!");
				life--;


			}

			if(word.contentEquals(String.valueOf(filler) )) {
				System.out.println(filler);
				System.out.println();
				System.out.println(PlayerName.name+" you won!!!"+"\tTime for a party");
				break;
			}

			System.out.print(filler);
			System.out.println("          Life remaining= "+ life);

		}

		if(life==0) {
			System.out.println("\n"+PlayerName.name+" you lose! The man was hanged\n");
			System.out.println("===============");
			System.out.println("||          |");
			System.out.println("||          |");
			System.out.println("||          |");
			System.out.println("||         (_)");
			System.out.println("||          |");
			System.out.println("||         / \\");
			System.out.println("||          |");
			System.out.println("||         / \\");
			System.out.println("||");
			System.out.println("||__________");
			System.out.println("|___________]");


			System.out.println("\nThe word to be guessed was: "+Hangman_Main.randomWord);
		}
		return restart.restart();

	}


}
