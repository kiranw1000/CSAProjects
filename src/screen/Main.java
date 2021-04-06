package screen;

public class Main {

	public static void main(String[] args) {
		int row = (int) (Math.random()*767);
		int column = (int) (Math.random()*1023);
		Point point = new Point(row,column);
		System.out.println(point.toString());
		String above450 ="is";
		if(!point.isAboveRow(450)) above450 = "is not";
		System.out.println("The point "+above450+" above 450");
		String leftOf800 = "is";
		if(!point.isLeftOfColumn(800)) leftOf800 = "is not";
		System.out.println("The point "+leftOf800+" left of 800");
	}

}
