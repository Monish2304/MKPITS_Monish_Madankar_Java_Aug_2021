//wap to print whether it is a prime no or not

import java.util.*;

class For8 {

	public static void main(String []args) {

		int num,i;

		Scanner s=new Scanner(System.in);

		System.out.print("Enter a number: ");
		num = s.nextInt();

		for(i=2;i<num;i++) {

			if(num%i==0) {

				System.out.println("It is not a prime number");
				break;
			}
		}

			if(i==num) {

				System.out.println("It is a prime number");
			}
		}
	}
