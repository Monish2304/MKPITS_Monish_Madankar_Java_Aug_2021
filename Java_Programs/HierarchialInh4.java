class Account {

	int accno;

	int balance;

	void insertAccountData(int accno,int balance) {

		this.accno=accno;

		this.balance=balance;
	}

	void showBalance() {

		System.out.println("Remaining Balance in " +accno+ " is: " + balance);
	}
}

class Savings extends Account {

	void deposit(int amount) {

		int interest=500;

		balance = balance + amount + interest;

		System.out.println("Amount deposited Successfully in your Savings account");
	}
}

class Current extends Account {

	void deposit(int amount) {

		balance = balance + amount;

		System.out.println("Amount deposited successfully in your Current account");
	}
}

class HierarchialInh4 {

	public static void main(String []args) {

		Savings s=new Savings();

		java.util.Scanner scan=new java.util.Scanner(System.in);

		System.out.println("Enter Details for Savings Aaccount");

		System.out.println("Enter Account No.: ");

		int accno=scan.nextInt();

		System.out.println("Balance: ");

		int balance=scan.nextInt();

		s.insertAccountData(accno,balance);

		System.out.println("Enter amount to be deposited: ");

		int amount = scan.nextInt();

		s.deposit(amount);

		s.showBalance();

		Current c=new Current();

		System.out.println("Enter Current Account Details");

		System.out.println("Enter Account No.: ");

		accno = scan.nextInt();

		System.out.println("Enter Balance");

		balance = scan.nextInt();

		c.insertAccountData(accno,balance);

		System.out.println("Enter Amount to be Deposited");

		amount = scan.nextInt();

		c.deposit(amount);

		c.showBalance();
	}
}