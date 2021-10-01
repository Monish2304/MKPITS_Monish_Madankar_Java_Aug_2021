class Order {

	private int orderId;

	private String orderDate;

	private String prodName;

	private float prodPrice;

	private int quantity;

	float totalBillAmount;

	public int getOrderId() {

		return orderId;
	}

	public void setOrderId(int orderId) {

		this.orderId=orderId;
	}

	public String getOrderDate() {

		return orderDate;
	}

	public void setOrderDate(String orderDate) {

		this.orderDate=orderDate;
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

	public int getQuantity() {

		return quantity;
	}

	public void setQuantity(int quantity) {

		this.quantity=quantity;
	}

	public void calculateTotalBill() {

		totalBillAmount = prodPrice * quantity;

		//System.out.println("Total Bill Amount: " + totalBillAmount);
	}

	public void display() {

		System.out.println("Order Id: " + orderId);

		System.out.println("Order Date: " + orderDate);

		System.out.println("Prod Name: " + prodName);

		System.out.println("Prod Price: " + prodPrice);

		System.out.println("Quantity: " + quantity);

		System.out.println("Total Bill Amount: " + totalBillAmount);
	}
}

class EncapAssign3 {

	public static void main(String []args) {

		Order o1=new Order();

		o1.setOrderId(111);

		o1.setOrderDate("24-Sep-2021");

		o1.setProdName("Bags");

		o1.setProdPrice(599.99f);

		o1.setQuantity(5);

		o1.calculateTotalBill();

		o1.display();
	}
}