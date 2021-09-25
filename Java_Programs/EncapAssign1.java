class Customer {

	private int id;

	private String custName;

	private String custEmail;

	private long custMobileNo;

	public int getId() {

		return id;
	}

	public void setId(int id) {

		this.id=id;
	}

	public String getCustName() {

		return custName;
	}

	public void setCustName(String custName) {

		this.custName=custName;
	}

	public String getCustEmail() {

		return custEmail;
	}

	public void setCustEmail(String custEmail) {

		this.custEmail=custEmail;
	}

	public long getCustMobileNo() {

		return custMobileNo;
	}

	public void setCustMobileNo( long custMobileNo) {

		this.custMobileNo=custMobileNo;
	}
}

class EncapAssign1 {

	public static void main(String []args) {

		Customer c1=new Customer();

		c1.setId(111);

		c1.setCustName("Amit");

		c1.setCustEmail("amit123@gmail.com");

		c1.setCustMobileNo(1234567890);

		System.out.println(c1.getId()+"  "+c1.getCustName()+"  "+c1.getCustEmail()+"  "+c1.getCustMobileNo());
	}
}