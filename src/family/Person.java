package family;

public class Person
{
// fields
private String firstName;
private String lastName;
private int age;
private String gender;
// constructors
public Person( )
{
firstName = "no first name";
lastName = "no last name";
age = 0;
gender = "U";
}
public Person(String fn, String ln, int yrs, String gdr)
{
firstName = fn;
lastName = ln;
age = yrs;
gender = gdr;
}
public Person(String fn, String ln)
{
firstName = fn;
lastName = ln;
age = -1;
gender = "U";
}
//getters and setters
public String getFirstName()
{
return firstName;
}
public String getLastName()
{
return lastName;
}
public int getAge()
{
return age;
}
public String getGender()
{
return gender;
}
public void setFirstName(String myFirst)
{
firstName = myFirst;
}
public void setLastName(String myLast)
{
lastName = myLast;
}
public void setAge(int myAge)
{
age = myAge;
}
public void setGender(String myGender)
{
gender = myGender;
}
//methods
public String toString()
{
String fl = firstName + " " + lastName;
return fl;
}
public String lastFirst()
{
String lf = lastName + ", " + firstName;
return lf;
}
public boolean equals(Object other)
{
if (other instanceof Person == false)
return false;
Person pOther = (Person)other;
if (this.firstName.equals(pOther.firstName) &&
this.lastName.equals(pOther.lastName) &&
this.age == pOther.age &&
this.gender.equals(pOther.gender))
return true;
return false;
}
}
