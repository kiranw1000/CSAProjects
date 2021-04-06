package zoo;

public class Ikran extends Animal {
	private static final String REALM = "AIR";
	private static final boolean DEFAULT_BONDED = false;
	private boolean bonded;
	private static final int LEGS = 2;
	public Ikran(String n, String g,boolean b) {
		super(n,REALM,g,LEGS);
		bonded = b;
	}
	public Ikran() {
		this("No Name","FEMALE",DEFAULT_BONDED);
	}
	public String toString() {
		String ret = super.toString();
		if(bonded) ret+= " and it is bonded";
		else ret+= " and it is not bonded";
		return ret;
	}
	public String makeSound() {
		return "SKREEECH";
	}
	public String move() {
		return "flap flap flap";
	}
	public void bond() {
		bonded = true;
	}
	public String isBonded() {
		if(bonded == true) return this.getName() + " is bonded";
		else return this.getName() + " is not bonded";
	}
}