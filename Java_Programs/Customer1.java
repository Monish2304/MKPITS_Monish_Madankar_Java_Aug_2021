package bank;

import sbi.Account;

class Customer1 {

public static void main(String []args) {

Account acct=new Account();

String str=acct.deposit(100);

System.out.println(str);

}

}