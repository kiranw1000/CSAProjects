package zoo;

public class Penguin extends Animal{
	private static final boolean DEFAULT_HUNGRY = true;
	private boolean hungry;
	public boolean getHungry() {
		return hungry;
	}
	public void setHungry(boolean b) {
		hungry = b;
	}
	public Penguin(String n, String r, String g, int nL, boolean h) {
		super(n,r,g,nL);
		hungry = h;
	}
	public Penguin() {
		setRealm("WATER");
		setNumLegs(2);
		hungry = DEFAULT_HUNGRY;
	}
	public Penguin(String n, String g) {
		this(n,"WATER",g,2,DEFAULT_HUNGRY);
	}
	public String makeSound() {
		return "Ghaa Ghaa Ghaa";
	}
	public String move() {
		return "I am swimming";
	}
	public String swim() {
		return "I am swimming, looking for fish to eat";
	}
	public String toString() {
		String s = "";
		if(hungry) s = "It is hungry"; else s ="It is not hungry";
		return super.toString()+", "+s;
	}
	public boolean equals(Object other) {
		if(other instanceof Penguin!=true){
			return false;
		}
		else {
			Penguin pOther = (Penguin) other;
			if(super.equals(pOther)&&this.hungry==pOther.hungry) return true;
			else return false;
		}
	}
}
