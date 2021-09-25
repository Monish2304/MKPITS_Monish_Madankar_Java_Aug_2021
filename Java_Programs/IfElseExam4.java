//wap to find whether a given year is leap year or not.

import java.util.*;
class IfElseExam4 {

	public static void main(String []args) {

		int year;

		Scanner s=new Scanner(System.in);

		System.out.print("Enter a year: ");
		year = s.nextInt();

		if(((year%4==0) && (year%100!=0)) || (year%400==0)) {

			System.out.println("It is a leap year");
		}

		else {

			System.out.println("It is not a leap year");
		}
	}
}