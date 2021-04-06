package creditCards;
import java.util.*;

public class Luhn
{
	// fields – lookup String and instance fields
	public static final String DIGITS = "0123456789";
	private String ccNumber; // the credit card number as entered
	private ArrayList<Integer> ccDigitList; // the digits in ccNumber
	// constructor
	public Luhn(String s) /* code provided here */
	{
	ccNumber = s;
	ccDigitList = new ArrayList<Integer> ( );
	fillCcDigitList();
	}
	public String getCcDigitList() {
		return ccDigitList.toString();
	}
	// methods
	private void fillCcDigitList(){
		for(int x = ccNumber.length()-1; x>-1; x--) {
			if(DIGITS.contains(ccNumber.substring(x,x+1))) {
				ccDigitList.add(Integer.valueOf(ccNumber.substring(x,x+1)));
			}
		}
	}
	public int luhnSum() {
		int result = 0;
		for(int x = 0; x<ccDigitList.size();x++) {
			if(x%2==0) result+=ccDigitList.get(x);
			else if(ccDigitList.get(x)*2<10) result+=ccDigitList.get(x)*2;
			else result+=(ccDigitList.get(x)*2)-9;
		}
		return result;
	}
	public boolean isValid() {
		return luhnSum()%10==0;
	}
	public String toString( ) { return ccNumber; }
// there
}
