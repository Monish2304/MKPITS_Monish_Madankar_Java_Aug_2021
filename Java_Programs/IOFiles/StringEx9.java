import java.util.*;

class StringEx9 {

	public static void main(String []args) {

		String s1="Amit,Amar,Aryan,Ajay";

		String[] arr=s1.split(",",3);

		for(String s:arr) {

			System.out.println(s);
		}
	}
}