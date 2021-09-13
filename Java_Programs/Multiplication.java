//wap to accept 2 nos and print multiplication of 2 nos
import java.util.*;
class Multiplication
{
	public static void main(String []args)
	{
		int num1,num2;
		Scanner s = new Scanner(System.in);

		System.out.println("Enter num1: ");
		num1 = s.nextInt();

		System.out.println("Enter num2: ");
		num2 = s.nextInt();

		int mul = num1 * num2;
		System.out.println("multiplication of two nos= " + mul);
	}
}