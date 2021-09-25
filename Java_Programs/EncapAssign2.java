class Product {

	private int prodId;

	private String prodName;

	private float prodPrice;

	public int getProdId() {

		return prodId;
	}

	public void setProdId(int prodId) {

		this.prodId=prodId;
	}

	public String getProdName() {

		return prodName;
	}

	public void setProdName(String prodName) {

		this.prodName=prodName;
	}

	public float getProdPrice() {

		return prodPrice;
	}

	public void setProdPrice(float prodPrice) {

		this.prodPrice=prodPrice;
	}
}

class EncapAssign2 {

	public static void main(String []args) {

		Product p1=new Product();

		p1.setProdId(111);

		p1.setProdName("Amit");

		p1.setProdPrice(500.23f);

		System.out.println(p1.getProdId()+"  "+p1.getProdName()+"  "+p1.getProdPrice());
	}
}