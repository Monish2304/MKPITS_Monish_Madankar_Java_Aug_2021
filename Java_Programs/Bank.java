import java.util.*;
class Account {

	int acct_no;
	String name;
	int amount;

	void insert(int a,String n,int am) {

		acct_no=a;
		name=n;
		amount=am;
	}

	void deposit(int amt) {

		amount = amount + amt;

		System.out.println("Rs." +amt+ " deposited successfully");
	}

	void withdrawl(int amt) {

		if(amount <amt) {

			System.out.println("cannot withdrawl amount, due to insufficient balance");
		}
		else {
			amount = amount - amt;

			System.out.println("Rs." +amt+ " withdrawl successfully");
		}
	}

	void checkBalance() {

		System.out.println("Balance amount is Rs. " + amount);
	}

	void display() {

		System.out.println("Account no.: " + acct_no);
		System.out.println("Name: " + name);
		System.out.println("Amount: " + amount);
	}
}

class Bank {

	public static void main(String []args) {

		Account a1=new Account();

		Scanner s=new Scanner(System.in);

		System.out.println("Enter Account No.: ");
		int acct_no=s.nextInt();
		System.out.println("Enter Account Holder Name: ");
		String name=s.next();
		System.out.println("Enter Amount: ");
		int amount=s.nextInt();

		a1.insert(acct_no,name,amount);

		a1.display();

		System.out.println("Enter amount to be deposited in your account: ");

		int amt=s.nextInt();

		a1.deposit(amt);
		a1.checkBalance();

		System.out.println("Enter amount to be withdrawl from your account: ");
		amt=s.nextInt();

		a1.withdrawl(amt);
		a1.checkBalance();
	}
}