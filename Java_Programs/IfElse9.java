//wap to accept 5 sub marks and then calculate total, per,  grade.
import java.util.*;
class IfElse9
{
	public static void main(String []args)
	{
		int s1,s2,s3,s4,s5;

		Scanner s=new Scanner(System.in);

		System.out.println("Enter sub1 marks: ");
		s1 = s.nextInt();
		System.out.println("Enter sub2 marks: ");
		s2 = s.nextInt();
		System.out.println("Enter sub3 marks: ");
		s3 = s.nextInt();
		System.out.println("Enter sub4 marks: ");
		s4 = s.nextInt();
		System.out.println("Enter sub5 marks: ");
		s5 = s.nextInt();

		int total = s1+s2+s3+s4+s5;
		System.out.println("Total marks = " + total);

		float per = (float)(total/500.0f)*100.0f;
		System.out.println("Percentage = " + per);

		if(per>=75)
		{
			System.out.println("Grade = A");
		}
		else if(per>=60 && per<75)
		{
			System.out.println("Grade = B");
		}
		else if(per>=45 && per<60)
		{
			System.out.println("Grade = C");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}