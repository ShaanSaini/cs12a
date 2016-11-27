// Lawn.java
// Shaan Saini
// shksaini
// pa1
// Calculates the amount of time to mow the lawn of a house

import java.util.Scanner;

class Lawn{

    public static void main( String[] args ){

	double length_lawn, width_lawn, length_house, width_house, area_house, mowing_rate, area_lawn, total_lawn_area;
	Scanner sc = new Scanner(System.in);

	//	System.out.print("Enter the length and width of the lot, in feet: ");
	length_lawn = sc.nextDouble();
	width_lawn = sc.nextDouble();
	area_lawn = length_lawn * width_lawn;

	//	System.out.print("Enter the length and width of the house, in feet: ");
	length_house = sc.nextDouble();
	width_house = sc.nextDouble();
	area_house = length_house * width_house;

	total_lawn_area = area_lawn - area_house;
	//	System.out.println("The lawn area is " + total_lawn_area + " square feet.");

	//	System.out.print("Enter the mowing rate, in square feet per second: ");
	mowing_rate = sc.nextDouble();

	double sec = total_lawn_area / mowing_rate;
	int h, m, s;

	s = (int) Math.round(sec);
	m = s/60;
	s = s%60;
	h = m/60;
	m = m%60;

	//	System.out.println("The mowing time is " + h + " hour" + (h==1?" ":"s ") + m + " minute" + (m==1?" ":"s ") + "and " +s+ " second" + (s==1?".":"s."));

    }
}
