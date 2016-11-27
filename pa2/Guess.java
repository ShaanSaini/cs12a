// Guess.java
// Shaan Saini
// shksaini
// pa2
// Plays a guessing game where the user is prompted to guess the number correctly

import java.util.Scanner;
import java.util.Random;

class Guess {
    
    public static void main (String[] args) {
	int a,b,c;
	Scanner s = new Scanner(System.in);
	Random r = new Random();
	int rR = r.nextInt(11);
	String lose = ("You lose. The number was " + rR);
	
	System.out.print("I'm thinking of an integer in the range 1 to 10. You have three guesses.");
	System.out.println(" ");
	System.out.println(" ");

	System.out.print("Enter your first guess: ");
	a = s.nextInt();

	if (a == rR){
	    System.out.println("You win!");
	    System.out.println(" ");
	} else if(a > rR) {
	    System.out.println("Your guess is too high.");
	    System.out.println(" ");
	    
	    System.out.print("Enter your second guess: ");
	    b = s.nextInt();
	    
	    if (b == rR){
		System.out.println("You win!");
		System.out.println(" ");
	    } else if(b > rR) {
		System.out.println("Your guess is too high.");
		System.out.println(" ");
		
		System.out.print("Enter your third guess: ");
		c = s.nextInt();
		
		if (c == rR){
		    System.out.println("You win!");
		    System.out.println(" ");
		} else if(c > rR) {
		    System.out.println("Your guess is too high.");
		    System.out.println(" ");
		    System.out.println(lose);
		    System.out.println(" ");
		} else if(c < rR) {
		    System.out.println("Your guess is too low.");
		    System.out.println(" ");
		    System.out.println(lose);
		    System.out.println(" ");
		}
	    } else if(b < rR) {
		System.out.println("Your guess is too low.");
		System.out.println(" ");
		
		System.out.print("Enter your third guess: ");
		c = s.nextInt();
		
		if (c == rR){
		    System.out.println("You win!");
		    System.out.println(" ");
		} else if(c > rR) {
		    System.out.println("Your guess is too high.");
		    System.out.println(" ");
		    System.out.println(lose);
		    System.out.println(" ");
		} else if(c < rR) {
		    System.out.println("Your guess is too low.");
		    System.out.println(" ");
		    System.out.println(lose);
		    System.out.println(" ");
		}
	    }
	    
	} else if(a < rR) {
	    System.out.println("Your guess is too low.");
	    
	    System.out.println(" ");
	    
	    System.out.print("Enter your second guess: ");
	    b = s.nextInt();
	    if (b == rR){
		System.out.println("You win!");
		System.out.println(" ");
	    } else if(b > rR) {
		System.out.println("Your guess is too high.");
		System.out.println(" ");
		System.out.print("Enter your third guess: ");
		c = s.nextInt();
		if (c == rR){
		    System.out.println("You win!");
		    System.out.println(" ");
		} else if(c > rR) {
		    System.out.println("Your guess is too high.");
		    System.out.println(" ");
		    System.out.println(lose);
		    System.out.println(" ");
		} else if(c < rR) {
		    System.out.println("Your guess is too low.");
		    System.out.println(" ");
		    System.out.println(lose);
		    System.out.println(" ");
		}
	    } else if(b < rR) {
		System.out.println("Your guess is too low.");
		System.out.println(" ");
		System.out.print("Enter your third guess: ");
		c = s.nextInt();
		if (c == rR){
		    System.out.println("You win!");
		    System.out.println(" ");
		} else if(c > rR) {
		    System.out.println("Your guess is too high.");
		    System.out.println(" ");
		    System.out.println(lose);
		    System.out.println(" ");
		} else if(c < rR) {
		    System.out.println("Your guess is too low.");
		    System.out.println(" ");
		    System.out.println(lose);
		    System.out.println(" ");
		}
	    }
	}
    }
}
