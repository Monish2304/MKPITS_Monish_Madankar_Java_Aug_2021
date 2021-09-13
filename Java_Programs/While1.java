//wap to accept your name and print your name 5 times.
import java.util.*;
class While1
{
	public static void main(String []args)
	{
		int i=1;
		String name;

		Scanner s=new Scanner(System.in);

		System.out.println("Enter your name: ");
		name = s.next();

		while(i<=5)
		{
			System.out.println("Name: " + name);
			i++;
		}

	}
}