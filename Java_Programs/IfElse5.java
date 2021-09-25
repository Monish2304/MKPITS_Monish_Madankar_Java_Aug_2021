//wap to accept 2 nos and operator and then display the result.
import java.util.*;
class IfElse5
{
	public static void main(String []args)
	{
		int n1,n2;
		float res=0;
		char op;

		Scanner s=new Scanner(System.in);

		System.out.println("Enter n1 value: ");
		n1 = s.nextInt();
		System.out.println("Enter n2 value: ");
		n2 = s.nextInt();
		System.out.println("Enter operator like '+', '-','*','/': ");
		op = s.next().charAt(0);

		if(op == '+')
			{
				res = n1+n2;
				System.out.println("Result = " + res);
			}
		else if(op == '-')
			{
				res = n1-n2;
				System.out.println("Result = " + res);
			}
		else if(op == '*')
			{
				res = n1*n2;
			}
		else if(op == '/')
			{
				res = (float)(n1/n2);
			}
		else
			{
				System.out.println("Invalid operator");
			}

			System.out.println("Result = " + res);
	}
}