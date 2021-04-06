package family;

public class WHStudent extends Person {
	private int studentID;
	public WHStudent(String fn, String ln,  int age, String g, int sid) {
		super(fn,ln,age,g);
		studentID = sid;
	}
	public WHStudent() {
		super("Silly","Dufas", 105,"U");
		studentID = 0;
	}
	public void setStudentID(int sid) {
		studentID = sid;
	}
	public int getStudentID() {
		return studentID;
	}
	public String toString() {
		return getFirstName()+","+getLastName()+","+getAge()+","+getGender()+","+getStudentID();
	}
	public boolean equals(Object other) {
		return other instanceof WHSudent && super.equals(other)&&studentID==other.getStudentID();
	}
}
