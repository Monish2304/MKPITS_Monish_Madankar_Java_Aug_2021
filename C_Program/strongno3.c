#include<stdio.h>
int main()
{
	int i;
	int num;
	int originalnum;
	int fact;
	int rem;
	int sum=0;
	
	for(i=1;i<=50000;i++)
	{
		sum=0;
		num=i;
		originalnum=num;
		while(num != 0)
		{
			rem = num % 10;
			num = num / 10;
			fact = factorial(rem);//passing rem to function to calculate factorial
			sum = sum + fact;
		}
		if(originalnum==sum)
		{
			printf("\n the no[%d] is a strong no.",originalnum);
		}
		//else
		//{
		//	printf("\n the no[%d] is not a strong no.",originalnum);
		//}
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