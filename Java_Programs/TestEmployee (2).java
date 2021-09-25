import mkpits1.Employee;

import java.util.*;

public class TestEmployee {

	public static void main(String []args) {

		Employee e1=new Employee();

		Scanner s=new Scanner(System.in);

		System.out.println("Enter Employee No.: ");

		int empno=s.nextInt();

		System.out.println("Enter Emploee Name: ");

		String name=s.next();

		System.out.print("Enter Basic Salary: ");

		int basicsalary=s.nextInt();

		e1.insert(empno,name,basicsalary);

		e1.calculateBonus();

		e1.display();

	}

}