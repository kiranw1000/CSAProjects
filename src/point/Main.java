package point;

class Main {
	 public static void main(String[] args)
	 {
	 int col1 = (int)(Math.random()*768);
	 int row1 = (int)(Math.random()*1204);
	 Point me = new Point(col1,row1);
	 System.out.println(me.toString(col1,row1));
	 boolean above = me.isAboveRow(400);
	 System.out.println(" The point is above the traget row =" + above);
	 Point3D p3 = new Point3D();
	 System.out.println(p3);
	 }
	}

