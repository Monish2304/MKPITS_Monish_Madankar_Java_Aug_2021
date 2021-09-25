//wap to accept 3 subject marks and then print total of it.
import java.util.*;
class Simple6
{
public static void main(String []args)
{
int s1,s2,s3;
Scanner s = new Scanner(System.in);
System.out.println("enter sub1 marks = ");
s1 = s.nextInt();
System.out.println("enter sub2 marks = ");
s2 = s.nextInt();
System.out.println("enter sub3 marks = ");
s3 = s.nextInt();
int total = s1 + s2 + s3;
System.out.println("Total marks = " + total);
}
}