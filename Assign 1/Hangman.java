import java.util.Scanner;

public class Hangman {

	public static int lifeCounter = 5;
	//private static String words = "";

	public static void guessWord(String mainWord, char c) {

		for (int i = 0; i < mainWord.length(); i++) {
			if (mainWord.charAt(i) == c && lifeCounter > 0) {
				System.out.print(mainWord.charAt(i));
			} else {
				System.out.print("_ ");
			}
		}
		
	}

	public static void main(String[] args) {
		String word = "apple";
		char c = 0;
		Scanner sc= new Scanner(System.in);
		System.out.println("This is the first iteration for the assignment 1");
		System.out.println("You must to guess a word!"+"\nClue: Name of a fruit as well as name of an American multinational technology company  ");
	    for(int i=0; i<lifeCounter;i++) {
	    	System.out.print("\nEnter a character: ");
	    	 c=sc.next().charAt(0);
	    	 guessWord(word, c);
	    }
	    sc.close();
	    
	}

}
