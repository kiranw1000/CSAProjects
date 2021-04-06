package warmup2;
import java.util.*;

public class Warmup2 {
	// These problems come from Codingbat/Warmup-2:
	/**
	* @param nums an ArrayList of Integers
	* @return the number of 9's in nums
	*/
	public int arrayCount9(ArrayList<Integer> nums) {
		int result = 0;
		for(Integer x: nums) if(x==9) result++;
		return result;
	}
	/**
	* @param intList an ArrayList of Integers
	* @return true if intList contains 1, 2, and 3 in order
	* in consecutive positions / false if not
	*/
	public boolean array123(ArrayList<Integer> intList) {
		for(int x=0,y=1,z=2; z<intList.size()-2; x++,y++,z++) if(intList.get(x)==1&&intList.get(y)==2&&intList.get(z)==3) return true;
		return false;
	}//The positions of the various values are needed for this
	/**
	* @param nums an array of ints
	* @return the number of times that consecutive items
	* in nums are a 6 followed by another 6 or a 7
	*/
	public int array667(int[ ] nums){
		int total = 0;
		for(int x = 0,y = 1; y<nums.length;x++,y++)if(nums[x]==6&&nums[y]==7||nums[y]==6)total++;
		return total;
	}//Need the positions of the values to evaluate expressions regarding consecutive values
	// These problems come from Codingbat/Array-2:
	/**
	* @param nums an array of ints
	* @return true if nums contains no 1's and no 3's;
	* false if it contains at least 1 or 3
	*/
	public boolean lucky13(int[] nums) {
		for(Integer x: nums) if(x==3||x==1) return false;
		return true;
	}
	/**
	* @param intList an ArrayList of Integers
	* @return true if the sum of all the 2's in intList is 8
	* false if that's not true
	*/
	public boolean sum28(List<Integer> intList) {
		int total = 0;
		for(Integer x: intList) if(x==2) total+=2;
		return total==8;
	}
	/**
	* @param arrList an ArrayList<Integer>
	* @return true if arrList contains no 1's or no 4's;
	* false otherwise
	* Examples: the Lists {1, 2, 3} and {3, 4, 11} return true
	* the List {1, 2, 4} returns false
	*/
	public boolean no14(ArrayList<Integer> arrList) {
		boolean f=false,o=false;
		for(Integer x: arrList) if(x==4) f=true; else if(x==0) o=true;
		return(!(f&&o));
	}
	/**
	* @param nums an array of ints
	* @return true if nums contains two 2's next to each other,
	* or two 4's next to each other, but not both;
	* return false otherwise
	*/
	public boolean either24(int[] nums) {
		for(int x=0,y=1;y<nums.length;x++,y++) if(nums[x]==2||nums[x]==4&&nums[x]==nums[y]) return true;
		return false;
	}//Cannot find consecutive numbers with for each
}
