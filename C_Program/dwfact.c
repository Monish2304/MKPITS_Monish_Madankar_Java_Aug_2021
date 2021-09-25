//wapto accept no and print factorial of it using do while loop.

#include<stdio.h>
void main(){
	int num,i=1,fact=1;
	printf("\n enter nos: ");
	scanf("%d",&num);
	do
	{
	fact=fact*i;
	i++;	
	}while(i<=num);
	printf("\n factorial = %d",fact);
}