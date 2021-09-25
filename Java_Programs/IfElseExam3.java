//wap to check whether a given number is positive or negative.

import java.util.*;
class IfElseExam3 {

	public static void main(String []args) {

		int num;

		Scanner s=new Scanner(System.in);

		System.out.print("Enter a number: ");
		num = s.nextInt();

		if(num>0) {

			System.out.println("Number is positive");
		}

		else {

			System.out.println("Number is negative");
		}
	}
}