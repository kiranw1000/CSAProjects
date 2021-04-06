package apples;
import java.util.*;
class Main {
public static void main(String[] args) {
// create Apples, fill bagOfApples
Apple red = new Apple("Red Delicious", 12.8);
Apple yellow = new Apple("Golden Delicious", 10.1);
Apple green = new Apple("Granny Smith", 8.2);
Apple black = new Apple("Arkansas Black", 6.0);
Apple[ ] bagOfApples = {red, yellow, green, black};
System.out.println(Arrays.toString(bagOfApples));
System.out.println(calculateWeight(bagOfApples));
// use Arrays.toString( ) to display bagOfApples
// use calculateWeight to calculate the
// total weight of all the Apples in bagOfApples
// and then display it
}
/**
* @param bag an array of Apple
* @return the total weight of the Apples in bag
*/
public static double calculateWeight(Apple[ ] bag)
{
	double total = 0.0;
	for( int x=0; x<bag.length; x++) {
		total += bag[x].getWeight();
	}
	return total;
}
}
