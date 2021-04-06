package sorts;
import java.util.*;

public class SelectionSort
{
  // fields
  private ArrayList<Integer> toSort;
  // constructors
  public SelectionSort(ArrayList<Integer> source)
  {
	  toSort = new ArrayList<Integer>(source);
  }
  // the no-args constructor creates toSort as an empty List
  public SelectionSort ( )
  {
	  this(new ArrayList<Integer>());
  }
  // getters and setters
  public ArrayList<Integer> getToSort() {
	 return(toSort);
  }
  
  // methods
  public String toString( )
  {
    return toSort.toString( );
  }

  /**
   * purpose: does a SelectionSort, smallest first, on toSort
   * @return none
   * PostCondition: toSort is sorted small to large
   */
 /* public void doSort()
  {
    for (int j = 0; j < toSort.size(); j++)
    {
    	int from = getMinPosition(j);
    	swap(from, j);
    }
  }*/
  
  public void doSort(boolean every)
  {
	  for (int j = 0; j < toSort.size(); j++)
	  {
    	if(every) System.out.println(toSort);
    	int from = getMinPosition(j);
    	swap(from, j);
	  }
  }
  
  public void doSort() { 
	  doSort(false);
  }

  /**
   * @param start the first position to check
   * @return the position of the smallest element in 
   *  toSort in positions >= start
   */
  private int getMinPosition(int start)
  {
    int pos = start;
	int smallest=toSort.get(start);
    for(int i=start+1; i<toSort.size();i++) {
    	int current = toSort.get(i);
    	if(current<=smallest) {
    		smallest=current;
    		pos=i;
    	}
    }
    return pos;
    // TODO: complete the method
  }

  /**
   * @param from the position to move the element from
   * @param to the position where the element should be moved
   * @return none
   * Precondition: from >= to
   * Postcondition: all elemement except those in positions from and to are not changed
   */
  private void swap(int from, int to)
  {
	  int toval = toSort.get(to);
	  int fromval = toSort.get(from);
	  toSort.set(to,fromval);
	  toSort.set(from, toval);
  }
}

