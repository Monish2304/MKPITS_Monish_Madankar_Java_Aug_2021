//wap to determine whether the candidate is eligible to vote or not.

import java.util.*;
class IfElseExam5 {

	public static void main(String []args) {

		int age;

		Scanner s=new Scanner(System.in);

		System.out.print("Enter age of candidate: ");
		age = s.nextInt();

		if(age>=18) {

			System.out.println("The candidate is eligible to vote");
		}

		else {

			System.out.println("The candidate is not elegible to vote");
		}
	}
}