//wap to accept a no. and print factorial of that no.

#include<stdio.h>
int main()
{
	int num,fact=1;
	printf("\n enter the num: ");
	scanf("%d",&num);
	while(num>0)
	{
		fact=fact*num;
		num=num-1;
	}
	printf("\n factorial = %d",fact);
}