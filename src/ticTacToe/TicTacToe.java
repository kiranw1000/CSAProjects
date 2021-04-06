package ticTacToe;
import java.util.*;
/*********************************************************
 * TicTacToe class Framework
 *********************************************************/

public class TicTacToe
{
  // fields
  public static final String X = "X", O = "O", LOSER = "&";
  public static final String[ ] PLAYERS = {X, O};

  private String [ ][ ] board;
  private String winner;
  // constructors
  /**
   * the no-args constructor creates a TicTacToe board that is
   * filled with randomly selected "X" and "O" characters;
   * winner is initialized to the value LOSER
   */
  public TicTacToe( )
  {
	  /*board = new String[3][3];
	  for(int x=0; x<board.length; x++) {
		  for(int y = 0; y<board[x].length;y++) {
			  if(Math.random()>0.5) board[x][y]="X";
			  else board[x][y]="O";*/
	  ArrayList<Integer> rowList = new ArrayList<Integer>(Arrays.asList(0,1,2));
	  ArrayList<Integer> colList = new ArrayList<Integer>(Arrays.asList(0,1,2));
	  board = new String[3][3];
	  for(int x=0;x<9;x++) {
		  if(x%2==1) {
			  int rand1 = (int) (Math.random()*rowList.size());
			  int rand2 = (int) (Math.random()*colList.size());
			  int cor1 = rowList.get(rand1);
			  int cor2 = colList.get(rand2);
			  while(board[cor1][cor2]!=null) {
				  rand1 = (int) (Math.random()*rowList.size());
				  rand2 = (int) (Math.random()*colList.size());
				  cor1 = rowList.get(rand1);
				  cor2 = colList.get(rand2);
			  }
			  board[cor1][cor2] = "X";
		  }
		  else{
			  int rand1 = (int) (Math.random()*rowList.size());
			  int rand2 = (int) (Math.random()*colList.size());
			  int cor1 = rowList.get(rand1);
			  int cor2 = colList.get(rand2);
			  while(board[cor1][cor2]!=null) {
				  rand1 = (int) (Math.random()*rowList.size());
				  rand2 = (int) (Math.random()*colList.size());
				  cor1 = rowList.get(rand1);
				  cor2 = colList.get(rand2);
			  }
			  board[cor1][cor2] = "O";
		  }
	  }
			  winner = "LOSER";
  }
  // getters and setters
  public String[][] getBoard()
  { return  board; }
  public String getWinner()
  { return winner; }
  // methods
  /** 
   * @return a String that shows the board in a familiar form 
   */
  public String toString()
  {
    String s = "| ";
    for (int r = 0; r < board.length; r++)
      {
        for (int c = 0; c < board[r].length; c++) {
          s += board[r][c] + " ";
        }
        s += "|\n";
        if (r != board.length-1)
          s += "| ";
      }
    return s;
  }

  /**
   * @param r the row to check
   * @return true if row is filled with all X or all O; else false
   * Postcondition if true winner is set to the character that
   *  fills this row
   */
  public boolean isRowWinner(int r)
  { 
    boolean ret = false;
    if (board[r][0].equals(board[r][1]) &&
        board[r][1].equals(board[r][2]))
      { 
        winner = board[r][0];
        ret = true;
      }
    return ret;
  }
  /**
   * @param c the column to check  
   * @return true if column is filled with all X or all O; else false
   * Postcondition if true winner is set to the character that
   *  fills this column 
   */
  public boolean isColWinner(int c) {
	  if(board[1][c].equals(board[0][c])&&board[2][c].equals(board[0][c])) {
		  winner = board[0][c];
		  return true;
	  }
	  return false;
  }
  /**
   * @return true if either diagonal (top left to bottom right or
   *  top right to bottom left) is filled with all X or all O; 
   *  false if neither diagonal is filled with matching characters 
   * Postcondition if true, winner is set to the character that
   *  fills the diagonal
   */
  public boolean isDiagWinner()
  {
	  if(board[1][1].equals(board[0][0])&&board[2][2].equals(board[0][0])) {
		  winner = board[0][0];
		  return true;
	  }
	  return false;
  }
  /**
   * @return true if any row, any column, or either diagonal 
   *  is filled with all X or all O; false if board is not a winner
   */
  public boolean isWinningBoard()
  {
    boolean ret = false;
    for (int r = 0; r < board.length; r++)
      if (isRowWinner(r))
        ret = true;
    if (ret == false)
      for (int c = 0; c < board[0].length; c++)
        if (isColWinner(c))
          ret = true;
    if (ret == false)
      if (isDiagWinner())
          ret = true;
    return ret;
  } 
}