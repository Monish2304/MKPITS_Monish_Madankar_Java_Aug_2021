import java.util.*;
class ElectricityBill
{
	public static void main(String []args)
	{
		int unit;
		float rate;

		Scanner s=new Scanner(System.in);

		System.out.println("Enter Consumer no.: ");
		int consumerno = s.nextInt();
		System.out.println("Enter Name: ");
		String name = s.next();
		System.out.println("Enter usage in Units: ");
		unit = s.nextInt();

		if(unit<=100)
		{
			rate = (float)3.44;
		}
		else if(unit>=100 && unit<=300)
		{
			rate = (float)7.34;
		}
		else if(unit>=301 && unit<=500)
		{
			rate = (float)10.36;
		}
		else if(unit>=501 && unit<=1000)
		{
			rate = (float)11.82;
		}
		else
		{
			rate = (float)11.82;
		}

		int mandatorycost = 200;
		float vehiclecost = (float)1.38 * unit;
		float totalamount = (float)((rate * unit) + mandatorycost + vehiclecost);
		float tax = (float)(0.16 * totalamount);
		float netamount = (float)(totalamount + tax);

		System.out.println("Usage in Unit: " + unit);
		System.out.println("Rate: " + rate);
		System.out.println("Mandatory Cost: " + mandatorycost);
		System.out.println("Vehicle Cost: " + vehiclecost);
		System.out.println("Total Amount: " + totalamount);
		System.out.println("Tax: " + tax);
		System.out.println("Net Amount: " + netamount);
	}
}