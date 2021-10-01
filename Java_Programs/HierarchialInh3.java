class Account {

	int acc_no;

	int balance;

	void insertAccountData(int acc_no,int balance) {

		this.acc_no=acc_no;

		this.balance=balance;
	}

	void showBalance() {

		System.out.println("Balance of account no " +acc_no+ " is " +balance);
	}
}

class Savings extends Account {

	void deposit(int amount) {

		int interest=500;

		balance = balance + amount + interest;

		System.out.println("Amount Deposited Successfully in your Savings Account");
	}
}

class Current extends Account {

	void deposit(int amount) {

		balance = balance + amount;

		System.out.println("Amount Deposited Successfully in your Current Account");
	}
}

class HierarchialInh3 {

	public static void main(String []args) {

		Savings s=new Savings();

		s.insertAccountData(123,1000);

		s.deposit(200);

		s.showBalance();

		Current c=new Current();

		c.insertAccountData(223,10000);

		c.deposit(1000);

		c.showBalance();
	}
}