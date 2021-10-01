class Person {

	String name;

	String address;

	void insertPersonData(String name,String address) {

		this.name=name;

		this.address=address;
	}

	void displayPersonData() {

		System.out.println("Name: " + name);

		System.out.println("Address: " +address);
	}
}

class Student extends Person {

	int rno;

	int marks;

	void insertStudentData(int rno,int marks) {

		this.rno=rno;

		this.marks=marks;
	}

	void displayStudentData() {

		System.out.println("Roll No.: " +rno);

		System.out.println("Marks: " +marks);
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

		System.out.println("Salary: " +salary);
	}
}

class HierarchialInh2 {

	public static void main(String []args) {

		System.out.println("--------------Enter Employee Details--------------");

		Employee e1=new Employee();

		java.util.Scanner s=new java.util.Scanner(System.in);

		System.out.println("Enter Employee Name.: ");

		String empname=s.next();

		System.out.println("Enter Address: ");

		String empaddress=s.next();

		e1.insertPersonData(empname,empaddress);

		System.out.println("Enter Employee No.: ");

		int empno=s.nextInt();

		System.out.println("Enter Salary: ");

		int salary=s.nextInt();

		e1.insertEmployeeData(empno,salary);

		e1.displayPersonData();

		e1.displayEmployeeData();

		System.out.println("--------------Enter Student Details--------------");

		Student s1=new Student();

		System.out.println("Enter Student Name.: ");

		String name=s.next();

		System.out.println("Enter Address: ");

		String address=s.next();

		s1.insertPersonData(name,address);

		System.out.println("Enter Student Roll No.: ");

		int rno=s.nextInt();

		System.out.println("Enter Marks: ");

		int marks=s.nextInt();

		s1.insertStudentData(rno,marks);

		s1.displayPersonData();

		s1.displayStudentData();
	}
}