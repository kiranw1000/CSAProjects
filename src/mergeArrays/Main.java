package mergeArrays;
import java.util.*;

public class Main {
		public static void main(String[] args)
		{
		// TODO: complete this method
		}

	/*public static void main(String[] args) {
		System.out.println("Testing two different lengths");
		List<Integer> l1 = buildList((int)(10*Math.random()),15);
		List<Integer> l2 = buildList((int)(10*Math.random()),15);
		System.out.println("L1 is "+l1.toString());
		System.out.println("L2 is "+l2.toString());
		System.out.println("Combined, these lists are "+collMerge(l1,l2));
		System.out.println("L1 is still "+l1.toString());
		System.out.println("L2 is still "+l2.toString());
		List<Integer> l3 = buildList(3,15);
		List<Integer> l4 = buildList(3,15);
		System.out.println("L3 is "+l3.toString());
		System.out.println("L4 is "+l4.toString());
		System.out.println("Combined, these lists are "+collMerge(l3,l4));
		System.out.println("L3 is still "+l1.toString());
		System.out.println("L4 is still "+l2.toString());
		List<Integer> l5 = buildList(3,15);
		List<Integer> l6 = new ArrayList<>();
		System.out.println("L5 is "+l5.toString());
		System.out.println("L6 is "+l6.toString());
		System.out.println("Combined, these lists are "+collMerge(l5,l6));
		System.out.println("L5 is still "+l5.toString());
		System.out.println("L6 is still "+l6.toString());
	}
	public static ArrayList<Integer> buildList(int len, int max)
	{
	ArrayList<Integer> list = new ArrayList< >( );
	for (int j = 0; j < len; j++)
	{
	int n = (int)(Math.random() * max);
	list.add(n);
	}
	return list;
	}
	public static ArrayList<Integer> collMerge(List<Integer> list1, List<Integer>
	list2)
	{
		List<Integer> small = list1; List<Integer> large = list2;
		ArrayList<Integer> ret = new ArrayList<>();
		if(list2.size()-list1.size()<0) small = list2; large = list1;
		for(int x=0; x<small.size();x++) ret.addAll(Arrays.asList(small.get(x),large.get(x)));
		for(int x=small.size();x<large.size();x++) ret.add(large.get(x));
		return ret;
	}*/
	/**
	* Purpose: build an ArrayList<Integer> containing a sorted list of randomly
	generated Integers
	* @param len is the length of the generated ArrayList
	* @param gap the maximum difference betrween adjacent elements in the ArrayList
	* @return an ArrayList containing len elements, all >= 0 and sorted
	*/
	public static ArrayList<Integer> buildSortedList(int len, int gap)
	{
	ArrayList<Integer> list = new ArrayList< >( );
	int n = (int)(Math.random() * 10);
	list.add(n);
	for (int j = 1; j < len; j++)
	{
	n += (int)(Math.random() * gap);
	list.add(n);
	}
	return list;
	}
	/**
	* @param a the List to verify
	* @return true/false if a is/is not n increasing List
	*/
	public static boolean isIncreasing(List<Integer> a)
	{
		for(int x=0; x<a.length;x++){
	}
	/**
	* @param list1 one sorted List
	* @param list2 another sorted List
	* @return a new ArrayList containing all elements in list1 and list2
	* sorted small to large
	* Postconditions: neither list1 nor list2 is modified in any way; the
	returned List
	* contains list1.size() + list2.size() elements
	*/
	public static ArrayList<Integer> sortMerge(List<Integer> list1, List<Integer>
	list2)
	{
	// TODO: complete this method
	}
}
