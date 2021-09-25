//wap to accept salary of 10 person and print total salary and average salary, use while loop

import java.util.*;

class While12 {

	public static void main(String []args) {

		int salary,totalsalary=0;
		int i=1;
		float averagesalary;

		Scanner s=new Scanner(System.in);

		while(i<=10) {

			System.out.print("Enter salary of person "+i+" : ");
			salary = s.nextInt();

			i++;

			totalsalary = totalsalary + salary;
		}

		System.out.println("Total Salary = " + totalsalary);

		averagesalary = (float)(totalsalary/10);

		System.out.println("Average Salary = " + averagesalary);
	}
}