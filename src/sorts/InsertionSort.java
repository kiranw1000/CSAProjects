package sorts;

/*********************************************************
 * InsertionSort class Framework
 *********************************************************/
import java.util.*;

public class InsertionSort
{
	public ArrayList<Integer> toSort;
	
	// fields
	// constructors
	public InsertionSort(ArrayList<Integer> source)
	{
		toSort = new ArrayList<Integer>(source);
	}
	// the no-args constructor creates toSort as an empty List
	public InsertionSort ( )
	{
		this(new ArrayList<Integer>());
	}
	// getters and setters
	public String getToSort(){
		return(toSort.toString());
	}
	
	// methods
	public String toString( )
	{
		return toSort.toString();
	}
	
	/**
	 * purpose: does a InsertionSort, smallest first, on toSort
	 * @param showSteps if true the method displays each intermediate sort
	 * @return none
	 * PostCondition: toSort is sorted small to large
	 */
	public void doSort( )
	{
		for (int j = 0; j < toSort.size(); j++)
		{
			int to = getInsertPosition(j);
			insert(j, to);
	    }
	}
	public void doSort(boolean showSteps )
	{
		for (int j = 0; j < toSort.size(); j++)
		{
			int to = getInsertPosition(j);
			insert(j, to);
			System.out.println("Pass: "+ j+" toSort: "+toSort);
	    }
	}
	
	/**
	 * @param unsorted the first position to check
	 * @return the position of the smallest element in 
	 *  toSort in positions >= start
	 */
	private int getInsertPosition(int unsorted)
	{
		int smindex = unsorted;
		int smallest = toSort.get(unsorted);
		for(int x=unsorted; x<toSort.size();x++) {
			if(toSort.get(x)<smallest) {
				smallest = toSort.get(x);
				smindex = x;
			}
		}
		return smindex;
	}
	
	/**
	 * @param from the position to move the element from
	 * @param to the position where the element should be moved
	 * @return none
	 * Precondition: from >= to
	 * Postcondition: all elemement except those in positions from and to are not changed
	 */
	private void insert(int from, int to)
	{
		  int toval = toSort.get(to);
		  int fromval = toSort.get(from);
		  toSort.set(to,fromval);
		  toSort.set(from, toval);
	}	
}