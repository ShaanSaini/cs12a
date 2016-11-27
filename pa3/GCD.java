// GCD.java
// Shaan Saini
// shksaini
// pa3
// Returns the greatest common denominator(GCD) of two positive numbers

import java.util.Scanner;

class GCD {

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a ,b ,q , r;
	
	System.out.print("Enter a positive integer: ");
	while (true) {
	    while (!s.hasNextInt() ) {
		s.next();
		System.out.print("Please enter a positive integer: ");
	    }
	    
	    a = s.nextInt();
	    if (a > 0) {
		break;
	    } else {
		System.out.print("Please enter a positive integer: ");
	    }
	}

	
	System.out.print("Enter another positive integer: ");
	while (true) {
	    while (!s.hasNextInt() ) {
		s.next();
		System.out.print("Please enter a positive integer: ");
	    }
	    b = s.nextInt();
	    if (b > 0) {
		break;
	    } else {
		System.out.print("Please enter a positive integer: ");
	    }
	}
	
	System.out.print("The GCD of "+a+" and "+b+" is ");
	gCD (a,b);

    }
    
    static void gCD (int x, int y) {
	int q, r;
	r = x%y;
	
	while (r > 0) { 
	    x = y;
	    y = r;
	    r = x%y;
	    q = x/y;
	    x = y*q+r;
	}
	
	System.out.println(y);
    }
}
