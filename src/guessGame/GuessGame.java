package guessGame;

public class GuessGame {
	String hidden = "HARPS";
	String guess = "HARPD";
	public String getHint() {
		String hint = "";
		for(int x=0; x<hidden.length(); x++) {
			if(hidden.contains(guess.substring(x,x+1)))
				if(hidden.substring(x,x+1).equals(guess.substring(x,x+1))) {
					hint+=hidden.substring(x,x+1);
				}
				else hint+="+";
			else hint+="*";
		}
		return hint;
	}
}
