//wap to accept a no and print from 1 to the number entered by the user.
import java.util.*;
class While9
{
	public static void main(String []args)
	{
		int Num,i=1;

		Scanner s=new Scanner(System.in);

		System.out.println("Enter the number: ");
		Num = s.nextInt();

		while(i<=Num)
		{
			System.out.println(+ i);
			i++;
		}
	}
}