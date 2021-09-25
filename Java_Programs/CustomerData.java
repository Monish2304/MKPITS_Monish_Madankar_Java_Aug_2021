class Customer {

	int customerId;
	String customerName;
	String customerAddress;
	long customerMobile;
	String customerEmail;

public void insertData(int custid,String custname,String custaddr,long custmob,String custemail) {

	customerId=custid;
	customerName=custname;
	customerAddress=custaddr;
	customerMobile=custmob;
	customerEmail=custemail;
}

public void displayData() {

	System.out.println("Customer Id.: " + customerId);
	System.out.println("Customer Name: " + customerName);
	System.out.println("Customer Address: " + customerAddress);
	System.out.println("Customer Mobile No.: " + customerMobile);
	System.out.println("Customer Email: " + customerEmail);
}
}

class CustomerData {

	public static void main(String []args) {

		Customer c1=new Customer();

		c1.insertData(121,"Amit","Nagpur",1234567890,"amit123@gmail.com");

		c1.displayData();
	}
}