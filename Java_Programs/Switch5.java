//wap to accept basic salary and designation and calculate bonus 1000 for m, 500 for c, 100 for p.
import java.util.*;
class Switch5
{
	public static void main(String []args)
	{
		int bsal,bonus=0,totalsal;
		char desig;

		Scanner s=new Scanner(System.in);

		System.out.println("Enter Basic Salary: ");
		bsal = s.nextInt();
		System.out.println("Enter Designation like m, p, c: ");
		desig = s.next().charAt(0);

		switch(desig)
		{
			case 'm':
				bonus = 1000;
				break;
			case 'c':
				bonus = 500;
				break;
			case 'p':
				bonus = 100;
				break;
			default:
				System.out.println("Invalid Designation");
		}

		System.out.println("Basic Salary = " + bsal);
		System.out.println("Bonus = " + bonus);

		totalsal = bsal + bonus;
		System.out.println("Total Salary = " + totalsal);
	}
}