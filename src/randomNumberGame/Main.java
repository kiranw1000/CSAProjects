package randomNumberGame;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		int target = getRandom1N(10);
		int trial = 0;
		int guess = -1;
		boolean done = false;
		while (trial < 10 && !done) {
			trial++;
			guess = Integer.valueOf(input.nextLine());
			if (guess == target)
			done = true;
			else
			System.out.println("Play #" + trial + ": You missed this time! Try again!");
		}
		System.out.println("You played to reach the target " + target);
		String won = "You won on trial #" + trial + "; you won $";
		int winnings = 0;
		if (trial == 1) winnings = 100;
		else if (trial == 2) winnings = 50;
		else if (trial < 6) winnings  = 20;
		else winnings = 0;
		if (trial < 10) System.out.println(won+winnings);
		else System.out.println("You did not get a match in 10 trials; you owe Dr. Gordon $50");
		input.close();
	}
	public static int getRandom1N(int n) {
		double d = Math.random() * n;
		int a = (int)d + 1;
		return a;
	}
}
