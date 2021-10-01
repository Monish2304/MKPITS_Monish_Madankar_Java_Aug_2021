class Parent {

	String name;

	String address;

	void insertPersonData(String name,String address) {

		this.name=name;

		this.address=address;
	}

	void displayPersonData() {

		System.out.println("Name: " + name);

		System.out.println("Adress: " + address);
	}
}

class Student extends Parent {

	int rno;

	int marks;

	void insertStudentData(int rno,int marks) {

		this.rno=rno;

		this.marks=marks;
	}

	void displayStudentData() {

		System.out.println("Roll No.: " + rno);

		System.out.println("Marks: " + marks);
	}
}

class SingleInh2 {

	public static void main(String []args) {

		Student s1=new Student();

		s1.insertPersonData("Amit","Ramtek");

		s1.insertStudentData(11,85);

		s1.displayPersonData();

		s1.displayStudentData();
	}
}