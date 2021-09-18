//wap to a accept a no. and print whether it is armstrong no. or not.
import java.util.*;
class DoWhile8 {

	public static void main(String []args) {

		int num,rem,sum=0,temp;

		Scanner s=new Scanner(System.in);

		System.out.println("Enter a number: ");
		num = s.nextInt();

		temp=num;

		do {

			rem = num % 10;

			sum = sum + (rem*rem*rem);

			num = num / 10;

		}while(num>0);

			if(temp==sum) {

				System.out.println("It is a Armstrong no.");

				}

				else {

					System.out.println("It is not a Armstrong no.");

					}
	}
}