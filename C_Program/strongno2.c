#include<stdio.h>
int main()
{
	int num;
	printf("\n enter a no.: ");
	scanf("\n %d",&num);
	
	int originalnum=num;
	int rem;
	int fact;
	int sum=0;
	
	while(num != 0)
	{
		rem = num % 10;
		num = num / 10;
		fact = factorial(rem);//passing rem to function to calculate factorial
		sum  = sum + fact;
	}
	if(originalnum == sum)
	{
		printf("\n the no[%d] is a strong number",originalnum);
	}
	else
	{
		printf("\n the no[%d] is not a strong number",originalnum);
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