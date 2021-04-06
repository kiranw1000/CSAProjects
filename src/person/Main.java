package Family;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Person p = getPersonInfo();
		System.out.println(p);
		System.out.println(p.getAge());
		System.out.println(p.getGender());
		System.out.println(p.lastFirst());
	}
	public static Person getPersonInfo()
	{
		Scanner input = new Scanner(System.in);
		// get field info
		System.out.println("Enter the first name:");
		String first = input.nextLine();
		System.out.println("Enter the last name:");
		String last = input.nextLine();
		System.out.println("Enter the age:");
		String a = input.nextLine();
		int yrs = Integer.valueOf(a);
		System.out.println("Enter the gender (M, F, or U:)");
		String gen = input.nextLine();
		// use all-args constructor to create this Person
		Person p = new Person(first, last, yrs, gen);
		return p;
	}
}
