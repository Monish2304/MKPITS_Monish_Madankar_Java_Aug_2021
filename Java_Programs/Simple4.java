//wap to accept length and breadth of rectangle and then print area of it.
import java.util.*;
class Simple4
{
public static void main(String []args)
{
int l,b;
Scanner s=new Scanner(System.in);
System.out.println("enter length = ");
l = s.nextInt();
System.out.println("enter breadth = ");
b = s.nextInt();
int area = l * b;
System.out.println("Area of rect = " + area);
}
}