package screen;

public class Point {
	private static int row;
	private static int column;
	//No-args constructor
	public Point() {
		row = 0;
		column = 0;
	}
	//All-args constructor
	public Point(int rVal, int cVal) {
		row = rVal;
		column = cVal;
	}
	//Getters
	public int getRow() {
		return row;
	}
	public int getColumn() {
		return column;
	}
	//Setters
	public void setRow(int rVal) {
		row = rVal;
	}
	public void setColumn(int cVal) {
		column = cVal;
	}
	//toString
	public String toString() {
		return row+" "+column;
	}
	//isAboveRow
	public boolean isAboveRow(int targetRow) {
		if(row>targetRow) return true;
		else return false;
	}
	//isLeftOfColumn
	public boolean isLeftOfColumn(int targetCol) {
		if(column<targetCol) return true;
		else return false;
	}
}
