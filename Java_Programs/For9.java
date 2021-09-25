//wap to accept the age of 5 student and then print their average age

import java.util.*;

class For9 {

	public static void main(String []args) {

		int age,i,total=0;

		Scanner s=new Scanner(System.in);

		for(i=1;i<=5;i++) {

			System.out.println("Enter age of student "+i+ " : " );
			age = s.nextInt();

			total = total + age;

		}

		float averageage = (total/5);

		System.out.println("Average Age of 5 Students = " + averageage);

	}
}