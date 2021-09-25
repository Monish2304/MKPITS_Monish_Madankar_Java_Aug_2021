//wap to accept two integers and check whether they are equal or not.

import java.util.*;
class IfElseExam1 {

	public static void main(String []args) {

		int n1,n2;

		Scanner  s=new Scanner(System.in);

		System.out.println("Enter n1 value: ");
		n1 = s.nextInt();

		System.out.println("Enter n2 value: ");
		n2 = s.nextInt();

		if(n1==n2) {

			System.out.println("Both the integers are equal");
		}

		else {

			System.out.println("Both the integers are not equal");
		}
	}
}