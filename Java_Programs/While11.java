//wap to print febonacci series.
import java.util.*;
class While11
{
	public static void main(String []args)
	{
		int i=1,num,a=1,b=0,c;

		Scanner s=new Scanner(System.in);

		System.out.print("Enter num value: ");
		num = s.nextInt();

		while(i<=num)
		{
			c = a + b;
			System.out.print(+c);
			a=b;
			b=c;
			i++;
		}
	}
}