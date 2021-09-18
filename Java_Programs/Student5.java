class Student5 {

	int id;
	String name;

	void display() {

		System.out.println(id+" "+name);
	}

	public static void main(String []args) {

		Student5 s1=new Student5();
		Student5 s2=new Student5();

		s1.display();
		s2.display();
	}
}