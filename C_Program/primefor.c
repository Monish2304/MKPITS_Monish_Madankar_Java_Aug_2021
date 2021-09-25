//wap to accept a no. and print whether it prime no. or not.

#include<stdio.h>
void main()
{
	int num,result,i;
	printf("enter the no.: ");
	scanf("%d",&num);
	for(i=2;i<=num;i++)
	{
		if(num%i==0)
		{
		printf("\n it is not prime no.");
		break;
		}
	}
	if(i==num)
	{
	printf("\n it is prime");
	}
}