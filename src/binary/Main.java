package binary;
import java.util.*;

public class Main { 
	  public static void main(String[] args)
	    {
	    Scanner input = new Scanner(System.in);

	    System.out.println("Enter a binary number (all 0's and 1's)");
	    String s = input.nextLine();
	    int trial = 0;
	    while (trial < 2 && !isBinary(s))
	      {
	      trial++;
	      System.out.println("The String you entered, " + s + "is not a valid binary number. Trial # " + trial + "\nTry again: ");
	      s = input.nextLine();
	      }
	    if (!isBinary(s))
	    {
	      System.out.println("Dummy! You failed three times. Goodbye");
	      return;
	    }
	    // Create a Binary object from the String s and display the Binary object with descriptive text
	    // Use the method toIntRL( ) to convert the Binary number to a decial number, and
	    //  display the result with descriptive text
	    Binary b = new Binary(s);
	    System.out.println(b +" is "+ b.toIntRL() + " in int form.");
	    }
	  public static boolean isBinary(String str)
	    {
		  for(int x=0; x <str.length();x++) if(!str.substring(x,x+1).equals("1")&&!str.substring(x,x+1).equals("0"))return false;
		  return true;
	    }
}
