//example of goto statement to do calculations.

#include<stdio.h>
void main()
{
	int sal,bonus;
	char desig;
	printf("enter salary: ");
	scanf("%d",&sal);
	fflush(stdin);
	printf("enter the designation like m,c,p: ");
	scanf("%c",&desig);
	if(desig=='m')
	{
		goto manager;
	}
	else if(desig=='c')
	{
		goto clerk;
	}
	else if(desig=='p')
	{
		goto peon;
	}
	else
	{
		printf("\n invalid designation");
		goto end;
	}
	manager:
		bonus=1200;
		sal=sal+bonus;
		goto end;
	clerk:
		bonus=200;
		sal=sal+bonus;
		goto end;
	peon:
		bonus=100;
		sal=sal+bonus;
		goto end;
	end:
		printf("\n total salary = %d",sal);
	}