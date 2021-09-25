//wap to accept length, breadth and volume and then print volume.
import java.util.*;
class Simple5
{
public static void main(String []args)
{
int l,b,h;
Scanner s=new Scanner(System.in);
System.out.println("enter length = ");
l = s.nextInt();
System.out.println("enter breadth = ");
b = s.nextInt();
System.out.println("enter height = ");
h = s.nextInt();
int volume = l * b * h;
System.out.println("volume of rect = " + volume);
}
}