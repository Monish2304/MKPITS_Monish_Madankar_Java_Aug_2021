class Employee {

	int empno;
	String name;

	public Employee() {

		System.out.println("default constructor is called");

		empno=123;
		name="Amit";
	}

	public void display() {

		System.out.println("Empno: " + empno);

		System.out.println("Empname: " + name);
	}
}

class Test2 {

	public static void main(String []args) {

		Employee emp=new Employee();

		emp.display();
	}
}