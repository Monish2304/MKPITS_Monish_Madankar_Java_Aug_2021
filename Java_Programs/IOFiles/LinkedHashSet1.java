import java.util.*;

class LinkedHashSet1 {

	public static void main(String []args) {

		//creating Hash set and adding elements

		LinkedHashSet<String>set=new LinkedHashSet();

		set.add("one");

		set.add("Two");

		set.add("Three");

		set.add("Four");

		set.add("Five");

		Iterator<String>i=set.iterator();

		while(i.hasNext()) {

			System.out.println(i.next());
		}
	}
}