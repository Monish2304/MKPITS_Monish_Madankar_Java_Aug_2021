class Student1 {

	int id;

	String name;

	Student1(int i) {

		id=i;
	}

	Student1(int i,String n) {

		id=i;

		name=n;
	}

	void display() {System.out.println(id+" "+name);}

	public static void main(String []args) {

	Student1 s1=new Student1(111);

	Student1 s2=new Student1(222,"Amit");

	s1.display();

	s2.display();
}
}