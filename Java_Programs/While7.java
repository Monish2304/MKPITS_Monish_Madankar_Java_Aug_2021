//wap to accept a no and then print factorial of that no.
import java.util.*;
class While7
{
	public static void main(String []args)
	{
		int num,fact=1;

		Scanner s=new Scanner(System.in);

		System.out.println("Enter a number: ");
		num = s.nextInt();

		while(num>0)
		{
			fact = fact * num;
			num--;
		}
		System.out.println("Factorial = "+ fact);
	}
}