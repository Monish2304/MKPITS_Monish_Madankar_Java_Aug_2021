class Person {

	String name;

	String address;
}

class Student extends Person {

	int rno;

	int marks;
}

class Inheritance1 {

	public static void main(String []args) {

		Student s1=new Student();

		s1.name = "Amit";

		s1.rno = 11;

		s1.marks = 85;

		s1.address = "Ramtek";

		System.out.println("Name of Student: " + s1.name);

		System.out.println("Roll no. of " +s1.name+ ": " + s1.rno);

		System.out.println("Marks of " +s1.name+ ": " + s1.marks);

		System.out.println("Address of " +s1.name+ ": " + s1.address);
	}
}