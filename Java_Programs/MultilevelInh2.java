class Person {

	String name;

	String address;

	void insertPersonData(String name,String address) {

		this.name=name;

		this.address=address;
	}

	void displayPersonData() {

		System.out.println("Name: " +name);

		System.out.println("Address: " +address);
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

		System.out.println("Employee No.: " +empno);

		System.out.println("Employee Salary: " +salary);
	}
}

class PartTimeEmployee extends Employee {

	int hours;

	void insertPartTimeEmployeeData(int hours) {

		this.hours=hours;
	}

	void displayPartTimeEmployeeData() {

		System.out.println("Hours of work: " +hours);
	}
}

class MultilevelInh2 {

	public static void main(String []args) {

		PartTimeEmployee p1=new PartTimeEmployee();

		p1.insertPersonData("Amit","Nagpur");

		p1.insertEmployeeData(123,15000);

		p1.insertPartTimeEmployeeData(5);

		p1.displayPersonData();

		p1.displayEmployeeData();

		p1.displayPartTimeEmployeeData();
	}
}