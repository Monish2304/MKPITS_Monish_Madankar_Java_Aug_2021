//wap to accept basicsalary and desig and then calculate bonus = 1000 for 'm', 500 for 'c' and 100 for 'p'.
import java.util.*;
class IfElse6
{
	public static void main(String []args)
	{
		int bsal,bonus=0,totalsal;
		char desig;

		Scanner s=new Scanner(System.in);

		System.out.println("Enter the basic salary: ");
		bsal = s.nextInt();
		System.out.println("Enter Designation like 'm','c','p': ");
		desig = s.next().charAt(0);

		if(desig == 'm')
		{
			bonus = 1000;
		}
		else if(desig == 'c')
		{
			bonus = 500;
		}
		else if(desig == 'p')
		{
			bonus = 100;
		}
		else
		{
			System.out.println("Invalid Designation");
		}

		totalsal = bsal + bonus;

		System.out.println("Basic Salary = " + bsal);
		System.out.println("Bonus = " + bonus);
		System.out.println("Designation: " + desig);
		System.out.println("Total Salary = " + totalsal);
	}
}