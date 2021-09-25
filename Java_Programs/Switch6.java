//wap to accept basic salary and designation and calculate hra and totalsalary.
import java.util.*;
class Switch6
{
	public static void main(String []args)
	{
		int bsal;
		float hra=0,totalsal;
		char desig;

		Scanner s=new Scanner(System.in);

		System.out.println("Enter Basic Salary: ");
		bsal = s.nextInt();
		System.out.println("Enter Designation like m, p, c: ");
		desig = s.next().charAt(0);

		switch(desig)
		{
			case 'm':
				hra = (float)(0.12*bsal);
				break;
			case 'c':
				hra = (float)(0.05*bsal);
				break;
			case 'p':
				hra = (float)(0.08*bsal);
				break;
			default:
				System.out.println("Invalid Designation");
		}

		System.out.println("Basic Salary = " + bsal);
		System.out.println("HRA = " + hra);

		totalsal = (float)bsal + hra;
		System.out.println("Total Salary = " + totalsal);
	}
}