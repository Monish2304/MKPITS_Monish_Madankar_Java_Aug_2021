class account {
	void deposit(int amt) {
		System.out.println("deposit method of account class");
	}
}
class saving extends account {
	void deposit(int amt) throws ArithmeticException {
		System.out.println("deposit method of saving class");
	}
}

public class throwex {
        public static void main(String[] args)  {
saving s=new saving();
s.deposit(100);

    }
}
