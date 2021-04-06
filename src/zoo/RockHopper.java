package zoo;

public class RockHopper extends Penguin {
	
	private static final boolean DEFAULT_HUNGRY = true;
	private static final int NUMLEGS = 2;
	
	public RockHopper(String n, String r, String g, boolean h) {
			super(n,r,g,NUMLEGS,h);
	}
	public RockHopper(String n, String r, String g) {
		this(n,r,g,DEFAULT_HUNGRY);
	}
	public RockHopper() {}
	public String makeSound() {
		return super.makeSound() + " Hippity hoppity";
	}
	public String move() {
		return "Hop along";
	}
}
