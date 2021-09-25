//wap to accept a no and print factorial of that no using for loop.

import java.util.*;

class For6 {

	public static void main(String []args) {

		int num,i,fact=1;

		Scanner s=new Scanner(System.in);

		System.out.println("Enter a number: ");
		num = s.nextInt();

		for(i=num;i>0;i--) {

			fact = fact * i;

		}

		System.out.println("Factorial of "+num+" is "+ fact);
	}
}