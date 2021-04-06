package arrayListExamples;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int listLen = 12;
		int listMax = 100;
		System.out.println("listLen: " + listLen);
		System.out.println("listMax: " +listMax);
		ArrayList<Integer> theList = buildList(listLen,listMax);
		System.out.println("The created list is" + theList);
		int addOddsOut = addOdds(theList);
		System.out.println("addOdds: "+String.valueOf(addOddsOut));
		System.out.println("onlyOdds: "+ onlyOdds(theList));
		setLimit(theList, -3);
		System.out.println("setLimit: "+ theList);
	}
	/**
	* Purpose: build an ArrayList<Integer> containing randomly generated Integers
	* @param len is the length of the array
	* @param max the maximum size of the elements in the generated ArrayList
	* @return an ArrayList containing len elements, all >= 0 and < max
	*/
	public static ArrayList<Integer> buildList(int len, int max)
	{
		ArrayList<Integer> ints = new ArrayList<Integer>();
		for(int x = 0; x<len; x++) ints.add((int) (Math.random()*max));
		return ints;
	}
	/**
	* Purpose: sum pattern example
	* @param intList is the ArrayList being processed
	* @return the sum of the odd numbers in intList
	*/
	public static int addOdds(ArrayList<Integer> intList)
	{
		int result = 0;
		for(int x=0; x<intList.size(); x++) {
			if(intList.get(x)%2==1) result+=intList.get(x);
		}
		return result;
	}
	/**
	* Purpose: extract pattern example
	* @param intList is the ArrayList being processed
	* @return an ArrayList<Integer> containing the odd numbers in intList, in
	order
	*/
	public static ArrayList<Integer> onlyOdds(List<Integer> intList)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int x=0; x<intList.size(); x++) {
			if(intList.get(x)%2==1) result.add(intList.get(x));
		}
		return result;
	}
	/**
	* Purpose: modify pattern example
	* @param intList the ArrayList to modify
	* @param limit an int > 2
	* Post-condition: intList is modified by replacing all
	* entries > limit with the value limit
	*/
	public static void setLimit(List<Integer> intList, int limit)
	{
		for(int x = 0; x<intList.size(); x++) {
			if(intList.get(x)>limit) intList.set(x, limit);
		}
	}
}