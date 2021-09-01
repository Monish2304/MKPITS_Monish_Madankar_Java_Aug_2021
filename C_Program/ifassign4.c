//wap to to find whether a given year is leap year or not.

#include<stdio.h>
void main()
{
	int a;
	printf("enter a year: ");
	scanf("%d",&a);
	if(a%100 && a%400)
	{
		printf("\n it is a leap year");
	}
	else 
	{
		printf("it is not a leap year");
	}
}