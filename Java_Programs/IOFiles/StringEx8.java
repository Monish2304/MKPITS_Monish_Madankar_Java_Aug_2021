import java.util.*;

class StringEx8 {

	public static void main(String []args) {

		String s1="Amit,Amar,Aryan";

		String[] arr=s1.split(",");

		for(String s:arr) {

			System.out.println(s);
		}
	}
}