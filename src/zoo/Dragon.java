package zoo;

public class Dragon extends Animal {
	private static final String REALM = "AIR";
	private static final String DEFAULT_SIZE = "BIG";
	private String size;
	private static final int LEGS = 2;
	public Dragon(String n, String g, String s) {
		super(n,REALM,g,LEGS);
		size = s;
	}
	public Dragon() {
		this("No Name","FEMALE",DEFAULT_SIZE);
	}
	public String toString() {
		return super.toString() + " Size:" +size;
	}
	public String makeSound() {
		return "Roar";
	}
	public String move() {
		return "Whoosh";
	}
	public void changeSize(String s) {
		size = s;
	}
	public String getSize() {
		return size;
	}
}