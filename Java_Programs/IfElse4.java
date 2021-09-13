//wap to accept 3 nos and print greatest nos.
import java.util.*;
class IfElse4
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

		if(n1>n2 && n2>n3)
		{
			System.out.println("n1 is greater");
		}
		else if(n2> n3)
		{
			System.out.println("n2 is greater");
		}
		else
		{
			System.out.println("n3 is greater");
		}
	}
}