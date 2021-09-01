//example of union by accepting values from user.

union data
{
	int i;
	float j;
	char name[10];
}d1;

#include<stdio.h>
int main()
{
	//printf("\n memory accupied by data = %d",sizeof(d1));
	
	printf("\n enter value of i ");
	scanf("%d",&d1.i);
	printf("\n enter value of j ");
	scanf("%.2f",&d1.j);
	printf("\n enter name: ");
	fflush(stdin);
	scanf("%s",&d1.name);
	
}