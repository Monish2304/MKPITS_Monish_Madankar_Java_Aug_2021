//wap to accept custname, prodname and quantity and then print custname, prodname, price, qty and total amt.
import java.util.*;
class Simple9
{
public static void main(String []args)
{
String custname;
String prodname;
float prodprice;
int quantity;
Scanner s = new Scanner(System.in);
System.out.println("enter customer name: ");
custname = s.next();
System.out.println("enter product name: ");
prodname = s.next();
System.out.println("enter poduct price: ");
prodprice = s.nextFloat();
System.out.println("enter quantity: ");
quantity = s.nextInt();
System.out.println("customer name: " + custname);
System.out.println("product name: " + prodname);
System.out.println("product price: " + prodprice);
System.out.println("quantity: " + quantity);
System.out.println(": " + quantity);
}
}