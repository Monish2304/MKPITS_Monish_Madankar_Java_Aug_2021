class Product {

	int prodId;
	String prodName;
	double prodPrice;
}

class TestProduct {

	public static void main(String []args) {

		Product p1=new Product();

		p1.prodId=111;
		p1.prodName="Mouse";
		p1.prodPrice=120;

		System.out.println("Product Id: " + p1.prodId);
		System.out.println("Product Name: " + p1.prodName);
		System.out.println("Product Price: " + p1.prodPrice);

		Product p2=new Product();

		p2.prodId=222;
		p2.prodName="Keyboard";
		p2.prodPrice=300;

		System.out.println("Product Id: " + p2.prodId);
		System.out.println("Product Name: " + p2.prodName);
		System.out.println("Product Price: " + p2.prodPrice);
	}
}