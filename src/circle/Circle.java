package circle;

public class Circle {
	public static final double PI = 3.1416;
	public static double radius;
	public Circle() {
		radius = 1.0;
	}
	public Circle(double val) {
		radius = val;
	}
	public String toString() {
		return "This circle has radius "+radius;
	}
	public double area() {
		return radius*radius*PI;
	}
}
