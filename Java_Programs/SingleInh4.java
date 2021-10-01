class Person {

	String name;

	String address;

	void insertPersonData(String name,String address) {

		this.name=name;

		this.address=address;
	}

	void displayPersonData() {

		System.out.println("Name: " +name);

		System.out.println("Address: " +address);
	}
}

class Customer extends Person {

	int custno;

	long gstno;

	void insertCustomerData(int custno,long gstno) {

		this.custno=custno;

		this.gstno=gstno;
	}

	void displayCustomerData() {

		System.out.println("Customer No.: " +custno);

		System.out.println("GST No.: " +gstno);
	}
}

class SingleInh4 {

	public static void main(String []args) {

		Customer c1=new Customer();

		c1.insertPersonData("Amit","Nagpur");

		c1.insertCustomerData(123,5231525123L);

		c1.displayPersonData();

		c1.displayCustomerData();
	}
}