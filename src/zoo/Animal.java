package zoo;

public class Animal
{
// fields wjg
public static final String LAND = "land";
public static final String WATER = "water";
public static final String AIR = "air";
public static final String DEFAULT_REALM = LAND;
public static final String MALE = "male";
public static final String FEMALE = "female";
public static final String UNKNOWN = "unknown";
public static final String DEFAULT_GENDER = UNKNOWN;
public static final String DEFAULT_NAME = "not named";
public static final int DEFAULT_NUM_LEGS = 4;
private String name;
private String realm;
private String gender;
private int numLegs;
// constructors wjg
public Animal(String myName, String myRealm, String myGender, int myLegs)
{
name = myName;
realm = myRealm;
gender = myGender;
numLegs = myLegs;
}
public Animal()
{
this(DEFAULT_NAME, DEFAULT_REALM, DEFAULT_GENDER, DEFAULT_NUM_LEGS);
}
// getters and setters
public String getName()
{ return name; }
public void setName(String myName)
{ this.name = myName; }
public String getRealm()
{ return realm; }
public void setRealm(String realm)
{ this.realm = realm; }
public String getGender()
{ return gender; }
public void setGender(String gender)
{ this.gender = gender; }
public int getNumLegs()
{ return numLegs; }
public void setNumLegs(int numLegs)
{ this.numLegs = numLegs; }
// other methods
public String move()
{
return "I am moving";
}
// or setName(myName); etc.
public String makeSound()
{
return "I am silent";
}
public String toString()
{
String s = "Animal " + name + " has " + numLegs + " legs. Its realm is " +
realm;
return s;
}
public boolean equals(Object other) {
	if(other instanceof Animal!=true){
		return false;
	}
	else {
		Animal aOther = (Animal) other;
		if(aOther.name==this.name&&aOther.realm==this.realm&&aOther.gender==this.gender&&aOther.numLegs==this.numLegs) return true;
		else return false;
	}
}
}
