#include<stdio.h>
int main()
{
	int num=145;
	int originalnum=num;
	int rem;
	int fact;
	int sum=0;
	
	while(num != 0)
	{
		rem=num % 10;
		//printf("\n %d",rem);
		num=num / 10;
		//printf("\n %d",num);
		fact=factorial(rem);
		sum=sum+fact;
	}
	if(originalnum==sum)
	{
		printf("\n the no[%d] is strong no.",originalnum);
	}
	else
	{
		printf("\n the no[%d] is not a strong no.",originalnum);
	}
}

int factorial(int r)
{
	int f=1;
	while(r>0)
	{
	f=f*r;
	r=r-1;	
	}
	return f;
}