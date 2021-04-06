package arrayLists2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		   int[ ] testArr = buildArrayLen(12);  
		   ArrayList<Integer> testList = buildArrayListLen(12);
		   System.out.println(Arrays.toString(testArr));
		   System.out.println(testList);
		   System.out.println(countEvens(testList));
		   System.out.println(fizzArray(12));
		   System.out.println(makeSameEnds(testArr,12));
		   System.out.println(withoutTen(testList));
		   System.out.println(evenOdd(testList));
	}
	public static int countEvens(ArrayList<Integer> nums) {
		int result = 0;
		for(int x=0; x<nums.size();x++) if(nums.get(x)%2==0) result++;
		return result;
	}
	public static ArrayList<Integer> fizzArray(int n){
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int x=0; x<n; x++) result.add(x);
		return result;
	}
	public static ArrayList<Integer> makeSameEnds(int[] nums, int len) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int x = 0; x<nums.length; x++) result.add(nums[x]);
		for(int x = 0; x<len; x++) result.add(nums[x]);
		return result;
	}
	public static ArrayList<Integer> withoutTen(List<Integer> nums){
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int x=0; x<nums.size();x++) if(nums.get(x)!=10) result.add(nums.get(x));
		return result;
	}
	public static ArrayList<Integer> evenOdd(ArrayList<Integer> nums){
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int zo=0; zo<2; zo++) for(int x=0; x<nums.size();x++) if(nums.get(x)%2==zo)result.add(nums.get(x));
		return result;
	}
	public static int[ ] buildArrayLen(int n)
	{
	int[ ] ret = new int[n];
	for (int j = 0; j < n; j++)
	ret[j] = (int)(Math.random() * 13);
	return ret;
	}
	public static ArrayList<Integer> buildArrayListLen(int n)
	{
	ArrayList<Integer> ret = new ArrayList< >( );
	for (int j = 0; j < n; j++)
	ret.add( (int)(Math.random() * 13) );
	return ret;
	}
}
