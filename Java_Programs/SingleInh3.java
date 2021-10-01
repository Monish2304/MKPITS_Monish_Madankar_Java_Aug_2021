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

class SingleInh3 {

	public static void main(String []args) {

		Employee e1=new Employee();

		e1.insertPersonData("Amit","Nagpur");

		e1.insertEmployeeData(123,50000);

		e1.displayPersonData();

		e1.displayEmployeeData();
	}
}