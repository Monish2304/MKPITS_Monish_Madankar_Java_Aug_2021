//wap to accept a no and print table of that no.
import java.util.*;
class While8
{
	public static void main(String []args)
	{
		int num,i=1;

		Scanner s=new Scanner(System.in);

		System.out.println("Enter a number: ");
		num = s.nextInt();

		while(i<=10)
		{
			int res = num * i;
			System.out.println(num+ " * " +i+ " = " +res);
			i++;
		}

	}
}