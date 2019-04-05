package Assign3;

import java.util.Scanner;


public class PlayerName {
	private boolean valid=false;
	public static String name="";
	public static String newName="";
	Scanner sc=new Scanner(System.in);
	
	public String UserName() {

		while (!valid) {
			System.out.print("Enter a username: ");
			name=sc.nextLine();
			valid = validUserName(name);
			/*String s1 = name.substring(0, 1).toUpperCase();
		    newName = s1 + name.substring(1);*/
		}    	
		return name;

	}

	public  boolean validUserName(String name2) {
		if(name2.length()==0) {
			System.out.println("A username must have at least one character, try again");
			return false;	
		}
		return true;
	}

}
