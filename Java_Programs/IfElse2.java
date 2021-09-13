//wap to accept the age and print whether it is eligible to vote or not.
import java.util.*;
class IfElse2
{
	public static void main(String []args)
	{
		int age;

		Scanner s=new Scanner(System.in);

		System.out.println("Enter the age of a person: ");
		age = s.nextInt();

		if(age>=18)
		{
			System.out.println("The person is eligible to vote.");
		}
		else
		{
			System.out.println("The person is not eligible to vote.");
		}
	}
}