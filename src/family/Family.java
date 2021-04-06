package family;

import java.util.Arrays;

public class Family {
	Person[] clan;
	public Family(int n) {
		clan = new Person[n];
	}
	public String getClan() {
		return Arrays.toString(clan);
	}
	public void displayFamily() {
		for(int x = 0; x<clan.length; x++) System.out.println(clan[x].toString());
	}
	public void addPerson(Person p, int pos) {
		clan[pos] = p;
	}
	
}
