package works;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
public class Removing_dublicates {
	String aa = "gokul";
	public static void main(String[] args) {
		// creating a object to the arraylist with object refrencename (name)
		Collection<String> name = new ArrayList<>();
		// adding duplicate dates to the names
		name.add("gokul");
		name.add("lenin");
		name.add("renger");
		name.add("gokul");
		System.out.println("With duplicate Values: ");
		name.forEach(s -> System.out.println(s));
		System.out.println(" ");
		// creating a object to the hashset with object referencename(details)
		Collection<String> details = new HashSet<>();
		// now we adding the name arraylist to the details hashset because
		// while we adding the arrylist the duplicates present in the arraylist
		// was removed when we merge it to the hashset
		details.addAll(name);
		System.out.println("After removing dublicates: ");
		details.forEach(g->System.out.println(g));
	}
}