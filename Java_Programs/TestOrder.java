import mkpits2.Product;

import java.util.*;

class TestOrder {

	public static void main(String []args) {

		Product p1=new Product();

		Scanner s=new Scanner(System.in);

		System.out.println("Enter Order Number: ");
		int orderno = s.nextInt();

		System.out.println("Enter Order Date: ");
		String orderdate = s.next();

		System.out.println("Enter Customer Name: ");
		String customername = s.next();

		System.out.println("Enter Product Name: ");
		String productname = s.next();

		System.out.println("Enter Product Price: ");
		float price = s.nextFloat();

		System.out.println("Enter Quantity: ");
		int quantity = s.nextInt();

		p1.insert(orderno,orderdate,customername,price,quantity);

		p1.calculateTotalBillAmount();

		p1.display();

	}

}