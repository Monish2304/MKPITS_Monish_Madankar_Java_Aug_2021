//wap to accept the age and print whether the person is minor, young or old.
import java.util.*;
class IfElse3
{
	public static void main(String []args)
	{
		int age;

		Scanner s=new Scanner(System.in);

		System.out.println("Enter the age: ");
		age = s.nextInt();

		if(age<18)
		{
			System.out.println("The person is minor.");
		}
		else if(age>=18 && age<50)
		{
			System.out.println("The person is young.");
		}
		else
		{
			System.out.println("The person is old.");
		}
	}
}