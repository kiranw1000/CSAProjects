package apQuadratic;

public class APQuadratic {
	private double a;
	private double b;
	private double c;
	public void setA(double aVal) {
		a=aVal;
	}
	public APQuadratic(double aVal, double bVal, double cVal) {
		a = aVal;
		b = bVal;
		c = cVal;
	}
	public APQuadratic() {
		a = 1.0;
		b = 0.0;
		c = -1.0;
	}
	public double getA() {
		return a;
	}
	public boolean isQuadratic() {
		return !(a==0);
	}
	/**
	* @return the String ax^2 + bx + c. If b or c is 0, omit the
	* corresponding term(s) in the String returned by the method.
	* There is no need to eliminate the + sign if b or c is < 0.
	*/
	public String toString( ) {
		String firstVal = "("+a+")";
		String secondVal = "("+b+")";
		String thirdVal = "("+c+")";
		String result = "";
		if(a!=0) result+=(firstVal+"x^2+");
		if(b!=0) result+=(secondVal+"x");
		if(c!=0) result+=(thirdVal);
		return result;
	}
}
