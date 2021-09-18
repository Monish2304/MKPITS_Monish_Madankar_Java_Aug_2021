//wap to accept a no. and print square of that no.

import java.util.*;
class DoWhile4 {

	public static void main(String []args) {

		int num;
		char ans;

		Scanner s=new Scanner(System.in);

		do {

			System.out.print("Enter a no.: ");
			num = s.nextInt();

			int square = num * num;
			System.out.println("Square = " + square);

			System.out.print("do you want to continue, press 'y' for yes otherwise press 'n': ");
			ans = s.next().charAt(0);

		}while(ans=='y');

		System.out.println("BYE");
	}
}