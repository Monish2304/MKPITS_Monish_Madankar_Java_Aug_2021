//wap to accept two nos and operators and then print the result using switch statement.
import java.util.*;
class Switch3
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
		System.out.println("Enter operator like '+','-','*','/': ");
		op = s.next().charAt(0);

		switch(op)
		{
			case '+':
				res = n1+n2;
				break;
			case '-':
				res = n1-n2;
				break;
			case '*':
				res = n1*n2;
				break;
			case '/':
				res = (float)(n1/n2);
				break;
			default:
				System.out.println("Invalid Operator");
		}
		System.out.println("Result: " + res);
	}
}