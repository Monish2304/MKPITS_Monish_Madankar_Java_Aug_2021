class Account {

	private long acc_no;

	private String name,email;

	private float amount;

	public long getAcc_no() {

		return acc_no;
	}

	public void setAcc_no(long acc_no) {

		this.acc_no=acc_no;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name=name;
	}

	public String getEmail() {

		return email;
	}

	public void setEmail(String email) {

		this.email=email;
	}

	public float getAmount() {

		return amount;
	}

	public void setAmount(float amount) {

		this.amount=amount;
	}
}

class Encapsulation4 {

	public static void main(String []args) {

		Account a=new Account();

		a.setAcc_no(456213458);

		a.setName("Amit");

		a.setEmail("amit123@gmail.com");

		a.setAmount(25000);

		System.out.println(a.getAcc_no()+"      "+a.getName()+"     "+a.getEmail()+"     "+a.getAmount());
	}
}