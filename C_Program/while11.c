#include<stdio.h>
int main()
{
	int num,i=1,factor=0;
	printf("\n enter the number: ");
	scanf("%d",&num);
	while(i<=num)
	{
		if(num%i==0)
		factor++;
		i++;
	}
	if(factor==2)
	{
		printf("\n no is a prime number");
	}
	else
	{
		printf("\n no is not a prime number");
	}
}