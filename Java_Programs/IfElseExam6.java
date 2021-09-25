//wap to find largest of three

import java.util.*;
class IfElseExam6 {

	public static void main(String []args) {

		int n1,n2,n3;

		Scanner s=new Scanner(System.in);

		System.out.print("Enetr n1 value: ");
		n1 = s.nextInt();

		System.out.print("Enter n2 value: ");
		n2 = s.nextInt();

		System.out.print("Enter n3 value: ");
		n3 = s.nextInt();

		if(n1>n2 && n2>n3) {

			System.out.println("n1 is greater");
		}

		else if(n2>n3) {

			System.out.println("n2 is greater");
		}

		else {

			System.out.println("n3 is greater");
		}
	}
}