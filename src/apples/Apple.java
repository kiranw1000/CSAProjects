package apples;

public class Apple
{
	// fields
	private String type;
	private double weight;
	// constructors
	public Apple(String myType, double myWeight)
	{
	type = myType;
	weight = myWeight;
	}
	// getters and setters
	public double getWeight()
	{ return weight; }
	// methods
	public String toString( )
	{
	String s = type + " (" + weight + " oz)";
	return s;
	}
}
