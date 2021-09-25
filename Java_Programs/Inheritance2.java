class Employee {

	float salary=40000;
}

class Inheritance2 extends Employee {

	int bonus=10000;

	public static void main(String []args) {

		Inheritance2 i1=new Inheritance2();

		System.out.println("Salary = " + i1.salary);

		System.out.println("Bonus = " + i1.bonus);
	}
}