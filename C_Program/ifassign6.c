//wap to find the largest of three nos.

#include<stdio.h>
void main()
{
	int a,b,c;
	printf("enter three nos.: ");
	scanf("%d%d%d",&a,&b,&c);
	if(a>b && a>c)
	{
		printf("\n a is greater number");
	}
	else if(b>c)
	{
		printf("\n b is greater number");
	}
	else
	{
		printf("\n c is the greater number");
	}
}