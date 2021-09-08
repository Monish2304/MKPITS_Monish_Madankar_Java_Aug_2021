//wap to accept a no. and print the table of that no. using while loop.

#include<stdio.h>
int main()
{
	int num,res;
	int i=1;
	printf("\n enter the no.: ");
	scanf("%d",&num);
	while(i<=10)
	{
		res=num*i;
		printf("\n %d * %d = %d",num,i,res);
		i=i+1;
	}
}