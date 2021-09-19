import mkpits2.Product2;

import java.util.*;

class TestOrder {

	public static void main(String []args) {

		Product2 p1=new Product2();

		Scanner s=new Scanner(System.in);

		System.out.println("Enter Order No.: "+ orderno);
		int orderno = s.nextInt();

		System.out.println("Enter Order Date.: "+ orderdate);
		String orderdate = s.nextInt();

		System.out.println("Enter Customer Name: "+ custname);
		String custname = s.next();

		System.out.println("Enter Product Name: "+ prodname);
		String prodname = s.next();

		System.out.println("Enter Price: "+ price);
		int price = s.nextInt();

		System.out.println("Enter Quantity: "+ quantity);
		int quantity = s.nextInt();

		p1.insert(orderno,orderdate,custname,prodname,price,quantity);

		p1.claculateTotalBillAmount();

		p1.display();

	}
}