package zoo;

public class Main {

	public static void main(String[] args) {
		String myName = "aname";
		Animal ani = new Animal(myName,"WATER","UNKNOWN",2);
		Penguin pen = new Penguin(myName,"WATER","UNKNOWN",2,true);
		System.out.println(ani.toString());
		System.out.println(pen.toString());
		System.out.println("ani equals pen is "+ ani.equals(pen));
		System.out.println("pen equals ani is "+ pen.equals(ani));
		System.out.println("The second statement is false becaus ani is not a penguin");
	}

}
