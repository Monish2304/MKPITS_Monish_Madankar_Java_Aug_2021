#include<stdio.h>
int factorial() 
{
	int num,fact=1;
	printf("enter number");
	scanf("%d",&num);
	
	while(num > 0)
	{
		fact = fact * num;
		num--;
	}
	return fact;
	
}
//creating a main function
int main() {
	int result;
	result=factorial();
	printf("\n factorial = %d",result);
	
}
