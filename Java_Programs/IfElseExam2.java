//wap to check a given num is even or odd.

import java.util.*;
class IfElseExam2 {

	public static void main(String []args) {

		int num;

			Scanner s=new Scanner(System.in);

			System.out.print("Enter a number: ");
			num = s.nextInt();

			if(num % 2 == 0) {

				System.out.println("The number is even");
			}

			else {

				System.out.println("The number is odd");
			}
		}
	}