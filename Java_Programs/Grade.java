//wap to accept 3 sub marks and calculate total, per and grade.
import java.util.*;
class Grade
{
	public static void main(String []args)
	{
		int s1,s2,s3;

		Scanner s = new Scanner(System.in);

		System.out.println("enter sub1 marks: ");
		s1 = s.nextInt();

		System.out.println("enter sub2 marks: ");
		s2 = s.nextInt();

		System.out.println("enter sub3 marks: ");
		s3 = s.nextInt();

		int total = s1+s2+s3;
		float per = (float)(total/300.00f)*100.00f;
		char grade;
		if(per>=75)
		{
			grade = 'A';
		}
		else if(per>=60)
		{
			grade = 'B';
		}
		else if(per>=45)
		{
			grade = 'C';
		}
		else
		{
			grade = 'D';
		}

		System.out.println("total marks = " + total);
		System.out.println("percentage = " +per);
		System.out.println("grade = " + grade);
	}
}