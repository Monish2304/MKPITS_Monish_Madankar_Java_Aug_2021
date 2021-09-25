//wap to accept a no. and print table of that of that no. using for loop.

#include<stdio.h>
void main()
{
	int num,i,result;
	printf("enter the no.: ");
	scanf("%d",&num);
	for(i=1;i<=10;i++)
	{
		result=num*i;
	
	printf("\n %d * %d = %d",num,i,result);
	}
}