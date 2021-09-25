//wap to accept empno, empname and salary and then print hra, da ,totalsalary.
import java.util.*;
class Simple8
{
public static void main(String []args)
{
int empno,sal;
char empname;
Scanner s = new Scanner(System.in);
System.out.println("enter employee no.: ");
empno = s.nextInt();
System.out.println("enter employee name: ");
empname = s.next().charAt(0);
System.out.println("enter salary: ");
sal = s.nextInt();
double hra = 0.35 * sal;
System.out.println("hra = " + hra);
double da = 0.45 * sal;
System.out.println("da = " + da);
double totalsal = sal + hra + da;
System.out.println("total Salary = " + totalsal);
}
}