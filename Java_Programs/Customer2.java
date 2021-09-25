package bank;

import sbi.*;

class Customer2 {

public static void main(String []args) {

sbi.Account acct=new sbi.Account();

String str=acct.deposit(100);

System.out.println(str);

}

}