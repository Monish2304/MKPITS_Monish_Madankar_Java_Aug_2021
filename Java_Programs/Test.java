class Employee {

	int empno;
	String name;

}

class Test {

	public static void main(String []args) {

		Employee emp=new Employee();

		System.out.println("Empno: " + emp.empno);
		System.out.println("Empname: " + emp.name);
	}
}