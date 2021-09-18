//wap to accept a no. and print factorial of that no.
import java.util.*;
class DoWhile6 {

	public static void main(String []args) {

		int num=1;
		int fact=1;

		Scanner s=new Scanner(System.in);

		System.out.print("Enetr a number:  ");
		num = s.nextInt();

		do {

			fact = fact * num;
			num--;

		}while(num>0);

		System.out.println(+ fact);
	}
}