package practice;
import java.util.*;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList< >( );
		nums.add(37);
		nums.add(3);
		nums.add(0);
		nums.add(1, 2);
		nums.set(0, 1);
		nums.remove(2);
		System.out.println(nums);
	}
	public static List<String> flip(List<String> word){
		List<String> result = new ArrayList<String>();
		for(int x=word.size()-1; x>-1; x--)result.add(word.get(x));
		return result;
	}
	public static List<String> wordsN(List<String> word, int n){
		List<String> result = new ArrayList<String>();
		for(String s : word) if(s.length()==n) result.add(s);
		return result;
	}
	public int removeVariety(List<CookieOrder> orders, String cookieVar) {
		List<CookieOrder> orig = orders;
		for(int x=0; x<orders.size(); x++) { 
			if(orders.get(x).getVariety().equals(cookieVar)) {
				orders.remove(x); 
			}
		}
		int result = 0;
		for(CookieOrder c:orders) result+=Integer.valueOf(c.getNumBoxes());
		for(CookieOrder c:orig) result-=Integer.valueOf(c.getNumBoxes());
		return result;
	}

}
