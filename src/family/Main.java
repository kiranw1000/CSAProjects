package family;

import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
	WHStudent studentx = getStudentInfo();
	System.out.println(studentx);
	WHStudent studenty = new WHStudent();
	System.out.println(studenty);
	
	/*int famSize = 6;
	Family myFam = new Family(famSize);
	for(int x = 0; x<famSize; x++) {
		Person newPerson = getPersonInfo();
		myFam.addPerson(newPerson, x);
	}
	System.out.println("My family is ");
	myFam.displayFamily();
	
Person who = getPersonInfo();
System.out.println(who);*/
}
public static WHStudent getStudentInfo()
{
Scanner input = new Scanner(System.in);
// get field info
System.out.println("Enter the first name:");
String first = input.nextLine();
System.out.println("Enter the last name:");
String last = input.nextLine();
System.out.println("Enter the age:");
String a = input.nextLine();
int yrs = Integer.valueOf(a);
System.out.println("Enter the gender (M, F, or U:");
String gen = input.nextLine();
System.out.println("Enter your studentID");
String i = input.nextLine();
int id = Integer.valueOf(i);
// use all-args constructor to create this Person
WHStudent p = new WHStudent(first, last, yrs, gen,id);
input.close();
return p;
}
public static Person getPersonInfo()
{
Scanner input = new Scanner(System.in);
System.out.println("Enter the first name:");
String first = input.nextLine();
System.out.println("Enter the last name:");
String last = input.nextLine();
System.out.println("Enter the age:");
String a = input.nextLine();
int age = Integer.valueOf(a);
System.out.println("Enter the gender:");
String gen = input.nextLine();
gen = gen.toUpperCase().substring(0, 1);
Person p = new Person(first, last, age, gen);
input.close();
return p;
}
}