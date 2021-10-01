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

class Student extends Person {

	int rno;

	int marks;

	void insertStudentData(int rno,int marks) {

		this.rno=rno;

		this.marks=marks;
	}

	void displayStudentData() {

		System.out.println("Student Roll No.: " + rno);

		System.out.println("Student Marks: " + marks);
	}
}

class PartTimeStudent extends Student {

	int fees;

	void insertPartTimeStudentData(int fees) {

		this.fees=fees;
	}

	void displayPartTimeStudentData() {

		System.out.println("Fees: " + fees);
	}
}

class MultilevelInh5 {

	public static void main(String []args) {

		PartTimeStudent s1=new PartTimeStudent();

		java.util.Scanner scan=new java.util.Scanner(System.in);

		System.out.println("Enter Student Name: ");

		String name = scan.next();

		System.out.println("Enter Student Address: ");

		String address = scan.next();

		s1.insertPersonData(name,address);

		System.out.println("Enter Student Roll No.: ");

		int rno = scan.nextInt();

		System.out.println("Enter Student Marks: ");

		int marks = scan.nextInt();

		s1.insertStudentData(rno,marks);

		System.out.println("Enter fees: ");

		int fees = scan.nextInt();

		s1.insertPartTimeStudentData(fees);

		s1.displayPersonData();

		s1.displayStudentData();

		s1.displayPartTimeStudentData();
	}
}