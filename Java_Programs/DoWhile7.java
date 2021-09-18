//wap to accept 5 sub marks and print the sum of all the subjects and percentage using do while loop.
import java.util.*;
class DoWhile7 {

	public static void main(String []args) {

		int sum=0,i=1;
		int marks;
		float per;
		char grade;

		Scanner s=new Scanner(System.in);

		do {

			System.out.println("Enetr marks of subject[]: ");
			marks = s.nextInt();

			sum = sum + marks;

			i++;

		}while(i<=5);

		System.out.println("Sum = " + sum );

		per = (float)(sum/500f)*100;

		System.out.println("Percentage = " + per);

		if(per>=75) {
			grade = 'A';
		}
		else if(per>=60 && per <75) {
			grade = 'B';
		}
		else if(per>=45 && per<60) {
			grade = 'C';
		}
		else {
			System.out.println("Fail");
		}
	}
}