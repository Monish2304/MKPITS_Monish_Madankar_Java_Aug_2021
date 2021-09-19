package sbi;

public class Account {

int bal=1000;

public String deposit(int amt) {

bal=bal+amt;

return"amount deposited, available bal is: " + bal;

}

}