package dogsAge;

import java.util.*;

public class Main {
	public static final int FACTOR = 7;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How old is your dog?");
		int dogAge = Integer.valueOf(input.nextLine());
		System.out.println("My dog is "+dogAge+" years old in dog years.");
		int personYears = dogAge*FACTOR;
		System.out.println("My dog is "+personYears+" years old in person years.");
		input.close();
	}

}
