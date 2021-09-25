//wap to print table of a no.

import java.util.*;
class DoWhile5 {

	public static void main(String []args) {

		int num;
		int i=1;
		int res;

		Scanner s=new Scanner(System.in);

		System.out.print("Enter a number:  ");
		num = s.nextInt();

		do {


			res = num * i;

			System.out.println(num+" * "+i+" = "+res);

			i++;
		}while(i<=10);
	}
}