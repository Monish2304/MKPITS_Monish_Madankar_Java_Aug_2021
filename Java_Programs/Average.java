//wap to accept 3 nos and print total and average.
import java.util.*;
class Average
{
	public static void main(String []args)
	{
		int n1,n2,n3;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter n1 value: ");
		n1 = s.nextInt();
		System.out.println("Enetr n2 value: ");
		n2 = s.nextInt();
		System.out.println("Enter n3 value: ");
		n3 = s.nextInt();

		int total = n1+n2+n3;
		System.out.println("Total = " + total);

		float average = (float)(total/3);
		System.out.println("Average = " + average);
	}
}