package Family;

public class Person {
	private static String first;
	private static String last;
	private static int age;
	private static String gender;
	//__init__
	public Person(String firstName, String lastName, int personAge, String personGender) {
		first = firstName;
		last = lastName;
		age = personAge;
		gender = personGender;
	}
	public void generic() {
		first = "John";
		last = "Doe";
		age = 45;
		gender = "Male";
	}
	public static void setName(String firstName, String lastName) {
		first = firstName;
		last = lastName;
	}
	//getters
	public static void setFirst(String firstName) {
		first = firstName;
	}
	public static void setLast(String lastName) {
		last = lastName;
	}
	public static void setAge (int personAge) {
		age = personAge;
	}
	public static void setGender(String personGender) { 
		gender = personGender;
	}
	//setters
	public String getFirst() {
		return first;
	}
	public String getLast() {
		return last;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	//toString and firstLast
	public String toString() {
		return first+" "+last;
	}
	public String lastFirst() {
		return last+" "+first;
	}
	
}
