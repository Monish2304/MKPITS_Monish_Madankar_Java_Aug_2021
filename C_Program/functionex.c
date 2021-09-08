#include<stdio.h>
int main()
{
	int actno,amount;
	int bal=1000;
	
	printf("\n enter the account no.: ");
	scanf("\n %d ",&actno);
	printf("\n enter deposit: ");
	scanf("\n %d",&amount);
	
	deposit(actno,amount,bal);//calling the function deposit.
	
	withdrawl(actno,amount,bal);//calling the function withdrawl.
	
	showbalance(actno,bal);//calling the function showbalance.
}
//function returning nothing.
void deposit(int actno,int amount,int bal)
{
	bal = bal + amount;
	printf("\n account no : %d",actno);
	printf("\n amount to be deposited : %d",bal);
}
void withdrawl(int actno,int amount,int bal)
{
	bal = bal - amount;
	printf("\n account no : %d",actno);
	printf("\n amount to be withdrawl : %d",bal);
}
void showbalance(int actno,int bal)
{
	printf("\n account no : %d",actno);
	printf("\n amount to be deposited : %d",bal);
}