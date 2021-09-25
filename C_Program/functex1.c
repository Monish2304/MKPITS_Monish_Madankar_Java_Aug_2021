//wap to create a function sum to accept 2 nos. and display the addition of of 2 nos.

#include<stdio.h>
void sum()
{
int n1,n2,result;
printf("\n enter 2 nos.");
scanf("%d%d",&n1,&n2);
result=n1+n2;
printf("\n addition of two nos.: = %d",result);	
}
int main()
{
	sum();
	printf("\n exit from main function.");
}