import java.util.*;

class Operation3 {

	public static void main(String []args) {

		Scanner scan=new Scanner(System.in);

		System.out.println("Enter email address");

		String s1=scan.next();

		Boolean ss=s1.contains(".com");

		if(ss==true) {

			System.out.println("Valid email address");
		}else {

			System.out.println("Invalid email address");
		}
	}
}