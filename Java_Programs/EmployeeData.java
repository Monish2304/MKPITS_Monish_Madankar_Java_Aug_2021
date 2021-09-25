class Employee {

	int employeeNo;
	String employeeName;
	String employeeDesignation;
	double employeeSalary;

void insertData(int eno,String en,String edes,double esal) {

	employeeNo=eno;
	employeeName=en;
	employeeDesignation=edes;
	employeeSalary=esal;
}

public void displayData() {

	System.out.println("Employee no.: " + employeeNo);
	System.out.println("Employee Name: " + employeeName);
	System.out.println("Emploee Designation: " + employeeDesignation);
	System.out.println("Employee Salary: " + employeeSalary);
}
}

class EmployeeData {

	public static void main(String []args) {

		Employee e1=new Employee();

		e1.insertData(121,"Amit","Manager",50000);

		e1.displayData();
	}
}