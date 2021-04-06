package twoDArrays;
import java.util.Arrays;

public class Main
{
	  public static void main(String[] args) {
		  /*int rand = ((int) (Math.random()*24));
		  int [][] mulTable1 = multiplicationTable(rand);
		  display2Dim(mulTable1);
		  int [][] mulTable2 = multModN(7);
		  display2Dim(mulTable2);
		  char [][]borderGrid = borderedGrid(5,8);
		  display2Dim(borderGrid);
		  */
		  int a =(int) (Math.random()*10 +4);
		  int b = (int) (Math.random()*10 +4);
		  int[][] grid1 = buildGrid(a,b,12);
		  display2Dim(grid1);
		  int[] rows = rowSums(grid1);
		  int[] cols = colSums(grid1);
		  System.out.println(Arrays.toString(rows));
		  System.out.println(Arrays.toString(cols));
	  }
  
	/**
   * @param n the max factors used in the table
   * @result a square array of ints holding in cell (r, c) the product r*c
   *  The products shown in table go from 0*0 to n*n 
   */
	public static int[ ][ ] multiplicationTable(int n)
	{
		int[][] grid  = new int[n][n];
		for(int r = 0; r<grid.length; r++) {
			for(int c = 0; c<grid[0].length; c++) {
				grid[r][c] = r*c;
			}
		}
		return grid;
	}
  /**
   * @param n the max factors used in the table
   * @result a square array of ints holding in cell (r, c) the product r*c % n
   * the products shown go from 0*0 to (n-1) * (n-1)
   */
	public static int[ ][ ] multModN(int n)
	{
		int[][] grid  = new int[n+1][n+1];
		for(int r = 0; r<grid.length; r++) {
			for(int c = 0; c<grid[0].length; c++) {
				grid[r][c] = (r*c)%n;
			}
		}
		return grid;
    }
  /**
   * @param a the number of rows in 
   * @param b the number of cols
   * @result a grid of chars with a rows, b cols. The top and bottom rows are filled with *'s;
   *  the leftmost and rightmost columns are filled with *'s
   *  every other cell is filled with a 'O' 
   */
	public static char[ ][ ] borderedGrid(int a, int b)
    {
		char[][] grid  = new char[a][b];
		for(int r=0; r<grid.length;r++) {
			for(int c=0; c<grid[0].length;c++) {
				grid[r][c] = '0';
			}
		}
		for(int r=0; r<grid.length;r++) {
			for(int c=0; c<grid[0].length;c++) {
				if(r==0||c==0||r==a-1||c==b-1)grid[r][c] = '*';
			}
		}
		return grid;
    }
  /**
   * purpose display a 2-dimensional array of ints so that each row is displayed in the form [#, #, ..., #] 
   * @param arr2 a 2-dimensional array of ints
   */ 
	public static void display2Dim(int[ ][ ] arr2)
    {
		for(int r=0; r<arr2.length; r++) System.out.println(Arrays.toString(arr2[r]));
    }
  /**
   * purpose display a 2-dimensional array of chars so that each row is displayed in the form [c, c, ..., c] 
   * Notice that this is an overloaded version of the previous method; copy/paste/modify as needed
   * @param arr2 a 2-dimensional array of chars
   */ 
	public static void display2Dim(char[ ][ ] arr2)
    {
		for(int r=0; r<arr2.length; r++) System.out.println(Arrays.toString(arr2[r]));
	}
	  /**
	   * @param rows the number of rows in the array
	   * @param cols the number of columns in the array
	   * @param max  all entries will be >= 0 and < max
	   * @return an array with specified number of rows and columns, 
	   *  all cells containing randomly selected ints >= 0 and < max
	   */
	  public static int[ ][ ] buildGrid(int rows, int cols, int max)
	    {
		  int [][] ret = new int[rows][cols];
		  for(int x = 0; x<rows; x++) for(int y=0; y<cols; y++) ret[x][y]= (int) (Math.random()*max);
		  return ret;
	    }
	
	  /**
	   * @param grid a 2-dimensional array of ints
	   * @return an array whose entry in cell n is the sum of entries in row n of grid
	   */
	  public static int[ ] rowSums(int[ ][ ] grid)
	    {
		  int[] ret = new int[grid.length];
		  for(int x = 0; x<grid.length;x++) {
			  int sum = 0;
			  for(int y=0; y<grid[0].length;y++) sum+= grid[x][y];
			  ret[x]=sum;
		  }
		  return ret;
	    }
	  /**
	   * @param grid a 2-dimensional array of ints
	   * @return an array whose entry in cell n is the sum of entries in column n of grid
	   * */
	  public static int[ ] colSums(int[ ][ ] grid)
	  {
		  int[] ret = new int[grid[0].length];
		  for(int x = 0; x<grid[0].length;x++) {
			  int sum = 0;
			  for(int y = 0; y<grid.length;y++) sum +=grid[y][x];
			  ret[x] = sum;
		  }
		  return ret;
	  }
}
