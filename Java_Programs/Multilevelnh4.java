class Person {

	String name;

	String address;

	void insertPersonData(String name,String address) {

		this.name=name;

		this.address=address;
	}

	void displayPersonData() {

		System.out.println("Name: " + name);

		System.out.println("Address: " + address);
	}
}

class Employee extends Person {

	int empno;

	int salary;

	void insertEmployeeData(int empno,int salary) {

		this.empno=empno;

		this.salary=salary;
	}

	void displayEmployeeData() {

		System.out.println("Employee No.: " + empno);

		System.out.println("Employee Salary: " + salary);
	}
}

class PartTimeEmployee extends Employee {

	int hours;

	void insertPartTimeEmployeeData(int hours) {

		this.hours=hours;
	}

	void displayPartTimeEmployeeData() {

		System.out.println("Hours: " + hours);
	}
}

class MultilevelInh4 {

	public static void main(String []args) {

		PartTimeEmployee e1=new PartTimeEmployee();

		java.util.Scanner scan=new java.util.Scanner(System.in);

		System.out.println("Enter Employee Name: ");

		String name = scan.next();

		System.out.println("Enter Employee Address: ");

		String address = scan.next();

		e1.insertPersonData(name,address);

		System.out.println("Enter Employee No.: ");

		int empno = scan.nextInt();

		System.out.println("Enter Employee Salary: ");

		int salary = scan.nextInt();

		e1.insertEmployeeData(empno,salary);

		System.out.println("Enter hours: ");

		int hours = scan.nextInt();

		e1.insertPartTimeEmployeeData(hours);

		e1.displayPersonData();

		e1.displayEmployeeData();

		e1.displayPartTimeEmployeeData();
	}
}