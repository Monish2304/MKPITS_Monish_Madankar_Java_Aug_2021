import java.util.*;

class HashSet5 {

	public static void main(String []args) {

		ArrayList<String>list=new ArrayList<String>();

		list.add("Ravi");

		list.add("Vijay");

		list.add("Aajay");

		HashSet<String>set=new HashSet(list);

		set.add("Gaurav");

		Iterator<String>i=set.iterator();

		while(i.hasNext()) {

			System.out.println(i.next());
		}
	}
}