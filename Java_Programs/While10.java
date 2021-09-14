//wap to accept a no and then print whether it is prime no. or not.
import java.util.*;
class While10
{
	public static void main(String []args)
	{
		int num,i=1,count=0;

		Scanner s=new Scanner(System.in);

		System.out.println("Enter a number: ");
		num = s.nextInt();

		while(i<=num)
		{
			if(num % i == 0){
				count++;
			}
			if(count==2){
				System.out.println("It is prime number");
			}
			else {
				System.out.println("It is not prime number");
			}
		}
	}
}