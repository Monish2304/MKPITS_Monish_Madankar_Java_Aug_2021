//wap to accept a no. and print whether it is armstrong no. or not.

#include<stdio.h>
int main()
{
	int n,r,sum=0,temp;
	printf("\n enter a no.: ");
	scanf("%d",&n);
	temp=n;
	
	while(n>0)
	{
		r=n%10;
		sum=sum+(r*r*r);
		n=n/10;
	}
	if(temp==sum)
	{
		printf("\n it is an armstrong no.");
	}
	else
	{
		printf("\n it is not an armstrong no.");
	}
}