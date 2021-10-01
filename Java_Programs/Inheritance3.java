class Person {

	String name;

	String address;

}

class Student extends Person {

	int rno;

	int marks;

}

class Inheritance3 {

	public static void main(String []args) {

		Student s1=new Student();

		s1.rno=11;

		s1.name=("Amit");

		s1.marks=85;

		s1.address=("Nagpur");

		System.out.println("Roll No.: " +s1.rno);

		System.out.println("Name: " +s1.name);

		System.out.println("Marks: " +s1.marks);

		System.out.println("Address: " +s1.address);
	}
}