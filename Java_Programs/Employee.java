package mkpits1;

public class Employee {

	int empno;

	String name;

	int basicsalary;

	float bonus;

	public void insert(int e,String n,int b) {

		empno=e;

		name=n;

		basicsalary=b;

}

public void calculateBonus() {

	bonus = basicsalary * 0.65f;

}

public void display() {

	System.out.println("Employee no.: " + empno);

	System.out.println("Employee Name: " + name);

	System.out.println("Basic Salary: " + basicsalary);

	System.out.println("Bonus: " + bonus);

}

}