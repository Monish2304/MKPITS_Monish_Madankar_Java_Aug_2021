import java.util.*;
class SwitchString
{
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);
		String empname,desig;
		int basic_salary;
		int bonus=0;

		System.out.println("enter the employee name: ");
		empname = s.next();
		System.out.println("enter the designation: ");
		desig = s.next();
		System.out.println("enter the basic salary: ");
		basic_salary = s.nextInt();

		switch(desig)
		{
			case "manager":
			bonus = 1200;
			break;
			case "clerk":
			bonus = 500;
			break;
			case "peon":
			bonus = 100;
			break;

			default :
			System.out.println("Invalid Designation");
			break;
		}
			System.out.println("Employee Name: " + empname);
			System.out.println("Employee Designation: " + desig);
			System.out.println("Basic Salary: " + basic_salary);
			System.out.println("Bonus: " + bonus);
		}
	}