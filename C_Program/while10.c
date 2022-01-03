//wap to accept a nos and then print whether it is prime no. or not.

#include<stdio.h>
int main()
{
	int num,i,count=0;
	printf("\n enter the no.: ");
	scanf("%d",&num);
	for(i=1;i<=num;i++)
	{
		if(num%i==0)
		{
			count++;
		}
	}
	if(count==2)
	{
		printf("\n It is prime no.");
	}
	else
	{
		printf("\n It is not prime no.");
	}
}