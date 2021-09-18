//wap to accept a no. and then print febonacci series.
import java.util.*;
class DoWhile10 {

	public static void main(String []args) {

		int a=1,b=0,c;
		int num;

		Scanner s=new Scanner(System.in);

		System.out.print("Enter a number: ");
		num = s.nextInt();

		do {

			c = a + b;

			System.out.print( " "+c+" " );

			a = b;
			b = c;

			num--;

		}while(num>0);
	}
}