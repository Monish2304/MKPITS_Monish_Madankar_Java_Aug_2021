class Employee {

	int empno;
	String name;

	public Employee() {

		empno=123;
		name="Amit";
	}
}

class Test1 {

	public static void main(String []args) {

		Employee emp=new Employee();

		System.out.println("Empno: " + emp.empno);
		System.out.println("Empname: " + emp.name);
	}
}