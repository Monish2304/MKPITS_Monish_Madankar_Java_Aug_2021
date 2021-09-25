//wap to accept basicsalary and desig and then calculate bonus.
import java.util.*;
class IfElse11
{
	public static void main(String []args)
	{
		int bsal;
		char desig;
		float bonus=0,totalsal;

		Scanner s=new Scanner(System.in);

		System.out.println("Enter the basic salary: ");
		bsal = s.nextInt();
		System.out.println("Enter Designation like 'm','c','p': ");
		desig = s.next().charAt(0);

		if(desig == 'm')
		{
			bonus = (float)0.45 * bsal;
		}
		else if(desig == 'c')
		{
			bonus = (float)(0.35 * bsal);
		}
		else if(desig == 'p')
		{
			bonus = (float)(0.15 * bsal);
		}
		else
		{
			System.out.println("Invalid Designation");
		}

		totalsal = (float) (bsal + bonus);

		System.out.println("Basic Salary = " + bsal);
		System.out.println("Bonus = " + bonus);
		System.out.println("Designation: " + desig);
		System.out.println("Total Salary = " + totalsal);
	}
}