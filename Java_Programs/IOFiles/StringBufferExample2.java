    class StringBufferExample2{
    public static void main(String args[]){
    StringBuffer sb=new StringBuffer("Hello ");
    sb.insert(1,"Java");//now original string is changed
    System.out.println(sb);//prints HJavaello
    }
    }
import java.util.*;
class StringEx1{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter your name");
String fn=sc.next();
StringBuffer sb=new StringBuffer(fn);
System.out.println("enter your lname");
String ln=sc.next();
    sb.insert(5,ln);//now original string is changed
    System.out.println(sb);//prints HJavaello



     }
    }
