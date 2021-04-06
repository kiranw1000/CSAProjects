package phoneNumbers;

public class Main
{
	public static final String DIGITS = "0123456789";
	public static void main(String[] args) {
	// use these phone numbers to test your method
	String[ ] phones = {"(513) 363-8400", "859.341.2965", "802/254 3991", "8491049"};
	for (int j = 0; j < phones.length; j++)
	{
	System.out.println("The phone number as entered was " + phones[j]);
	String s = toStandardForm(phones[j]);
	System.out.println(" In standard form this is " + s + "\n");
	}
	}
	/**
	* @param str is a String representing a phone number
	* @result a String containing only all the digits in str, in order
	* Postcondition str is not modified
	*/
	public static String toStandardForm(String str) {
		String result = "";
		for(int x=0,y=1; x<str.length();x++,y++) if(DIGITS.indexOf(str.substring(x,y))>=0) result+=str.substring(x,y);
		return result;
	}
}