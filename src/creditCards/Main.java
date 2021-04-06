package creditCards;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String number = input.nextLine();
		Luhn card = new Luhn(number);
		System.out.println(card);
		System.out.println(card.getCcDigitList());
		System.out.println(card.isValid());
		input.close();
	}

}
