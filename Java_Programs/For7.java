//wap to accept a no and print table of that no using for loop

import java.util.*;

class For7 {

	public static void main(String []args) {

		int num,i,res=0;

		Scanner s=new Scanner(System.in);

		System.out.print("Enter a number: ");
		num = s.nextInt();

		for(i=1;i<=10;i++) {

			res = num * i;

			System.out.println(num+" * "+i+" = "+res);

		}
	}
}