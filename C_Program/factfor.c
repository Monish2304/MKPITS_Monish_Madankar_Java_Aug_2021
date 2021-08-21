//wap to accept a no. and print factorialof that no.

#include<stdio.h>
void main()
{
	int num,i,fact=1;
	printf("enter the no.: ");
	scanf("%d",&num);
	printf("num = %d",num);
	for(i=num;i>0;i--)
	fact=fact*i;
	printf("\n fact = %d",fact);
}