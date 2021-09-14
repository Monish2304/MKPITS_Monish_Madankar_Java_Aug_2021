class Product {

	int productId;
	String productName;
	double productPrice;

	public void insertProduct(int pid,String pn,double pr)
	{
		productId=pid;
		productName=pn;
		productPrice=pr;
	}

	public void displayProduct() {

		System.out.println("Product Id: " + productId);
		System.out.println("Product Name: " + productName);
		System.out.println("Product Price: " + productPrice);
	}
}

class TestProduct3 {

	public static void main(String []args) {

		Product p1=new Product();

		p1.insertProduct(111,"Monitor",12000);

		p1.displayProduct();
	}
}