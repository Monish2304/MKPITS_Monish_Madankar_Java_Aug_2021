import mkpits2.Product;

import java.util.*;

class TestOrder {

	public static void main(String []args) {

		Product p1=new Product();

		Scanner s=new Scanner(System.in);

		System.out.println("Enter Order No.: ");
		int orderno = s.nextInt();

		System.out.println("Enter Order Date.: ");
		String orderdate = s.next();

		System.out.println("Enter Customer Name: ");
		String custname = s.next();

		System.out.println("Enter Product Name: ");
		String prodname = s.next();

		System.out.println("Enter Price: ");
		float price = s.nextFloat();

		System.out.println("Enter Quantity: ");
		int quantity = s.nextInt();

		p1.insert(orderno,orderdate,custname,prodname,price,quantity);

		p1.calculateTotalBillAmount();

		p1.display();

	}
}