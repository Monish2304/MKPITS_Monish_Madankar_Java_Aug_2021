//wap to accept 3 sub marks and then print total, percentage.
import java.util.*;
class Simple7
{
public static void main(String []args)
{
int s1,s2,s3;
Scanner s = new Scanner(System.in);
System.out.println("enetr sub1 marks: ");
s1 = s.nextInt();
System.out.println("enetr sub2 marks: ");
s2 = s.nextInt();
System.out.println("enetr sub3 marks: ");
s3 = s.nextInt();
int total = s1+s2+s3;
System.out.println("Total marks = " + total);
float per=(float)(total/300.0f)*100.0f;
System.out.println("Percentage = " + per);
}
}