package flag;
import java.util.*;

public class Main {

  public static final String STAR = "*";
  public static final String SPACE = " ";

  public static void main(String[] args) {
	  String[][] flag8 = flag(8);
	  String[][] flag3 = flag(3);
	  display2Dim(flag8);
	  display2Dim(flag3);
	  String[][] num = {{"3","4","5"},{"6","7","8"}};
	  display2Dim(num);  
	  int[][] arr = {{1, 3, 4}, {4, 5, 3}};
	  int max = arr[0][0];
	  int rand = 0;
	  for (int row = 0; row < arr.length; row++)
	    {
	    for (int col = 0; col < arr[row].length; col++)
	      {
	      int temp = arr[row][col];
	      if (temp % 2 == 0)
	        {
	        arr[row][col] = temp + 1; 
	        System.out.println(rand);
	        rand++;// line 11
	        }
	      if (temp > max)
	        {
	          max = temp;
	        }
	      }
	    }
	  System.out.println(max);
	    }

  /**
   * purpose display a 2-dimensional array of Strings, with all Strings
   *  in a row concatenated, and each row displayed on its own line
   * @param arr2 a 2-dimensional array of ints
   */ 
  public static void display2Dim(String[ ][ ] arr2)
    {
      for (String[] r : arr2)
        {
          System.out.print("|");
          for (String c : r)
            System.out.print(c);
          System.out.println("|");
        }
    }
  
  public static void display2Dim(int[ ][ ] arr2)
    {
      for (int[] r : arr2)
        {
    	  System.out.println();
          for (int c : r)
            System.out.print(c);
        }
    }

  /**
   * @param n the number of rows and columns in the flag
   * @return a 2-dim array whose rth row contains r "*"s
   *  followed by n - r SPACES
   * You must use the constants STAR and SPACE in this method
  */
  public static String[ ][ ] flag(int n)
  {
	  String[][] ret = new String[n][n];
	  for(int r=0; r<n; r++) {
		  for(int c=0; c<=r; c++) ret[r][c]=STAR;
		  for(int c=r+1;c<ret[r].length; c++) ret[r][c]=SPACE;
	  }
	  return ret;
  }
  

}
