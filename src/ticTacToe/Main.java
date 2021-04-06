package ticTacToe;
/*********************************************************
 * Main class Framework
 *********************************************************/
public class Main {
  public static void main(String[] args) {
    TicTacToe t = new TicTacToe( );
    System.out.println("The board is");
    System.out.println(t);
    
    if (t.isWinningBoard() )
    {
      System.out.println("You have a winner");
      System.out.println("Player " + t.getWinner( ) + " won");
    } 
    else
      System.out.println("Not a winning game");
  }
}
