//wap to accept a no. and print from 1 to the no.entered by the user.

#include<stdio.h>
int main()
{
	int num,i=1;
	printf("\n enter the no.: ");
	scanf("%d",&num);
	while(i<=num)
	{
		printf("\n num = %d",i);
		i=i+1;
	}
}