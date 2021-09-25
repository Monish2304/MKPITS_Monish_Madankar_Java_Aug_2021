//wap to print febonacci series using for loop.

import java.util.*;
class For12 {

	public static void main(String []args) {

		int num,i,a=1,b=0,c=0;

			Scanner s=new Scanner(System.in);

			System.out.print("Enter the number: ");
			num = s.nextInt();

			for(i=0;i<=num;i++) {

				c=a+b;
				a=b;
				b=c;

				System.out.print(" "+c+" ");
			}

		}
	}