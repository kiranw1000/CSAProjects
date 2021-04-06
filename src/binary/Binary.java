package binary;

public class Binary {
	private String strBin;
	public Binary() {
		strBin = "0";
	}
	public Binary(String str) {
		strBin = str;
	}
	public String toString() {
		return strBin;
	}
	 public int toIntRL()
	    {
	    int multiplier = 1;
	    int sum = 0;
	    for(int x = strBin.length();x>0;x--) {
	    	sum+= multiplier*Integer.valueOf(strBin.substring(x-1,x));
	    	multiplier *= 2;
	    }
	    return sum;
	    }
}
