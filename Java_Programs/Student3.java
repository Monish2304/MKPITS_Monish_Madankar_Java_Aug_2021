//java program to initialize the values from one object to another object.

class Student3 {

	int id;

	String name;

	//constructor to initialize the integer and string

	Student3(int i,String n) {

		id=i;

		name=n;
	}

	//constructor to initialize another object

	Student3(Student3 s) {

		id=s.id;

		name=s.name;
	}

	void display() {System.out.println(id+" "+name);}

	public static void main(String []args) {

		Student3 s1=new Student3(111,"Amit");

		Student3 s2=new Student3(s1);

		s1.display();

		s2.display();
	}
}