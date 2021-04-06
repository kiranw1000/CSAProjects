package apLine;

public class Main {

	public static void main(String[] args) {
		APLine lineOne = new APLine(5,4,-17);
		System.out.println(lineOne.getSlope());
		System.out.println(lineOne.isOnLine(5,-2));
		APLine line2 = new APLine(-25, 40, 30) ;

		double slope2 = line2.getSlope ( ) ;  // slope2 is assigned 0.625
		System.out.println(slope2);

		boolean onLine2 = line2. isOnLine (5, -2) ;
		System.out.println(onLine2);
	}

}
