package Game;

import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {
	
	//private static String words = "";

	public static void guessWord(String word, int life) {
		
		char[] filler= new char[word.length()];
		int i=0;
		while(i<word.length()) {
			filler[i]='-';
			if(word.charAt(i)==' ') {
				filler[i]=' ';
			}
			i++;
		}
		System.out.print(filler);
        System.out.println("    Life remaining= "+ life);
        
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
        		for(int y=0;y<word.length();y++) {
        			if(word.charAt(y)==x) {
        				filler[y]=x;
        			}
        		}
        	}
        	else {
        		life--;
        
        	}
        	
        	if(word.contentEquals(String.valueOf(filler) )) {
        		System.out.println(filler);
        		System.out.println("You Won!!!");
        		break;
        	}
        	
        	System.out.print(filler);
            System.out.println("    Life remaining= "+ life);
        	
        }
        
        if(life==0) {
        	System.out.println("You lose!!!\n");
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
    		System.out.println("------------");
        }
	 
	}

	public void run () {
		System.out.println("Guess the word");
	
		String word = "breakdown";
		int lifeCounter = 5;
		guessWord(word,lifeCounter);
}
}
