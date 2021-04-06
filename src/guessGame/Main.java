package guessGame;

public class Main {

	public static void main(String[] args) {
		GuessGame game = new GuessGame();
		System.out.println(game.getHint());
		int k =0;
		while(k<10) {
			System.out.println((k%3)+" ");
			if((k%3) == 0) k+=2;
			else k++;
		}
	}
	public static double goFigure(int n) {
		n = n%7;
		return (double)(12/n);
	}
	  public static int mystery(int[ ] arr)
	   {
	    int x = 0;
	    for (int k = 0; k < arr.length; k += 2)
	      x = x + arr[k];
	    return x;
	   }
}
