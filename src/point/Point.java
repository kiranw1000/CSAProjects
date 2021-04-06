package point;

public class Point
{
 //feilds
 private int row;
 private int col;
 //constructors
 /*public Point()
 {
   row = 0;
   col = 0;
 }*/
 public Point( int rowVal, int colVal)
 {
   row = rowVal;
   col = colVal;
 }
 //getters and setters
 public int getCol()
 {
   return col;
 }
 public void setCol(int myCol)
 {
   col = myCol;
 }
 public int getRow()
 {
   return row;
 }
 public void setRow(int myRow)
 {
   row = myRow;
 }
 //methods
 /**
*  Provides a human-readable description of the current Point
*  @return A String of the form (r, c) where r and c are the
*   Point’s row and column positions
*/
public String toString( )
{
 String s = "This point lies at ("+row + ","+ col+ ")";
 return s;
}
public String toString(int myrow, int mycol)
{
  String s = "This should work. This point lies at ("+row + ","+ col+ ")";
 return s;
}
 
 
/**
*  @param targetRow is the number of the target row
*  @return true if the current Point is above the target row,
*          false otherwise
*/
public boolean isAboveRow(int targetRow)
{ boolean acc = false;
 if (row< targetRow)
 acc = true;
 return acc;
}
 
/**
*  @param targetCol is the number of the target column
*  @return true if the current Point is left of the target
*   column, false otherwise
*/
public boolean isLeftOfColumn(int targetCol)
{
 boolean acc = false;
 if ( col<targetCol)
   acc = true;
 return acc;
}
 
 
}
