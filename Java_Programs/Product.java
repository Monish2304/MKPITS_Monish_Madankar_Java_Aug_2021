package mkpits2;

public class Product {

	int orderno;

	String orderdate;

	String custname;

	String prodname;

	float price;

	int quantity;

	float total;

public void insert(int on,String od,String cn,String pn,float p,int q) {

	orderno=on;

	orderdate=od;

	custname=cn;

	prodname=pn;

	price=p;

	quantity=q;

}

public void calculateTotalBillAmount() {

	total = (float)(quantity * price);

}

public void display() {

	System.out.println("Order No.: " + orderno);

	System.out.println("Order Date.: " + orderdate);

	System.out.println("Order No.: " + orderno);

	System.out.println("Customer Name: " + custname);

	System.out.println("Product Name: " + prodname);

	System.out.println("Price: " + price);

	System.out.println("Quantity: " + quantity);

	System.out.println("Total Amount: " + total);

}

}