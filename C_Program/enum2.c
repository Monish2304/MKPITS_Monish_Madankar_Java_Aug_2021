#include<stdio.h>
enum accounttype{Savings=1,Current,Loan};
int main()
{
	enum accounttype act;
	act=Current;
	printf("\n the value of act = %d",act);
}