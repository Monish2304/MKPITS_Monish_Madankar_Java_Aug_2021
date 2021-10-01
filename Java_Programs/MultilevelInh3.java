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

	int rno;

	int marks;

	void insertEmployeeData(int rno,int marks) {

		this.rno=rno;

		this.marks=marks;
	}

	void displayEmployeeData() {

		System.out.println("Roll No.: " + rno);

		System.out.println("Marks: " + marks);
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

class MultilevelInh3 {

	public static void main(String []args) {

		PartTimeEmployee p1=new PartTimeEmployee();

		p1.insertPersonData("Amit","Nagpur");

		p1.insertEmployeeData(11,85);

		p1.insertPartTimeEmployeeData(5);

		p1.displayPersonData();

		p1.displayEmployeeData();

		p1.displayPartTimeEmployeeData();
	}
}