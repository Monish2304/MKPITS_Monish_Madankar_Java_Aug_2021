//wap to accept 3 nos and print smallest no.
import java.util.*;
class IfElse8
{
	public static void main(String []args)
	{
		int n1,n2,n3;

		Scanner s=new Scanner(System.in);

		System.out.println("Enter n1 value: ");
		n1 = s.nextInt();
		System.out.println("Enter n2 value: ");
		n2 = s.nextInt();
		System.out.println("Enter n3 value: ");
		n3 = s.nextInt();

		if(n1<n2 && n2<n3)
		{
			System.out.println("n1 is smaller number");
		}
		else if(n2<n3)
		{
			System.out.println("n2 is smaller number");
		}
		else
		{
			System.out.println("n3 is smaller number");
		}
	}
}