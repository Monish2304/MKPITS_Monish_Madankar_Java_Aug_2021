//Example of  parameterized constructor.
class Employee {

	int empno;
	String name;

	public Employee() {

		System.out.println("default constructor called");//creating constructor
														 //(Default constructor(no arg constructor))

		empno=123;
		name="Amit";
	}

									//creating parameterized constructor)
	public Employee(int e,String n) {

		empno=e;
		name=n;
	}

	public void display() {				//(creating method display)

		System.out.println("Empno " + empno);//123

		System.out.println("Empname " + name);//Amit
	}
}

class Test3 {

	public static void main(String []args) {

		Employee emp=new Employee();

		emp.display();

		Employee emp1=new Employee(111,"Amar");

		emp1.display();
	}
}