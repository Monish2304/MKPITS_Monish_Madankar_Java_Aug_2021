//wap to accept basic salary and calculate hra, da and total salary.
import java.util.*;
class IfElse10
{
	public static void main(String []args)
	{
		int bsal;
		float hra=0,da=0;

		Scanner s=new Scanner(System.in);

		System.out.println("Enter basic salary: ");
		bsal = s.nextInt();

		if(bsal>=10000)
		{
			hra = (float)(0.45 * bsal);
			da = (float)(0.55 * bsal);
		}
		else if(bsal>=5000 && bsal<10000)
		{
			hra = (float)(0.25 * bsal);
			da = (float)(0.35 * bsal);
		}
		else if(bsal<5000)
		{
			hra = (float)(0.15 * bsal);
			da = (float)(0.05 * bsal);
		}
		float totalsal = (float)(bsal + hra + da);

		System.out.println("Basic salary : " + bsal);
		System.out.println("HRA : " + hra);
		System.out.println("DA : " + da);
		System.out.println("Total Salary : " + totalsal);
	}
}