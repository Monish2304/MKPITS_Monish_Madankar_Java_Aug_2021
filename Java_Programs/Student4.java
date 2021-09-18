class  Student4 {

	int id;

	String name;

	Student4(int i,String n) {

		id=i;

		name=n;

	}

	Student4() {}

	void display() {System.out.println(id+" "+name);}

	public static void main(String []args) {

		Student4 s1=new Student4(111,"Amit");

		Student4 s2=new Student4();

		s2.id=s1.id;

		s2.name=s1.name;

		s1.display();

		s2.display();

	}
}