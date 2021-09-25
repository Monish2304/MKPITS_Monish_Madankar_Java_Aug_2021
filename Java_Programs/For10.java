//wap to accept 5 sub marks using for loop and print total, percentage and grade.

import java.util.*;

class For10 {

	public static void main(String []args) {

		int marks=0,i;
		int total=0;
		float per;
		char grade;

		Scanner s=new Scanner(System.in);

		for(i=1;i<=5;i++) {

			System.out.println("Enter marks of sub "+i+" : ");
			marks = s.nextInt();

			total = total + marks;
		}

		System.out.println("Total marks = " + total);


		per = (float)(total/500.0f)*100.0f;
		System.out.println("Percentage = " + per);

		if(per>=75) {

			System.out.println("Grade = A");
		}

		else if(per>=60 && per<75) {

			System.out.println("Grade = B");
		}

		else if(per>=45 && per<60) {

			System.out.println("Grade = C");
		}

		else {

			System.out.println("Fail");
		}
	}
}