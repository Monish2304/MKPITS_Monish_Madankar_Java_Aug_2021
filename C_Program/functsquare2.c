//wap to create a function square and accepting a number from the user.

#include<stdio.h>
void square(int n1)
{
	int square;
	printf("\n enter a no.: ");
	scanf("%d",&n1);
	square=n1*n1;
	printf("\n square of a no. = %d",square);
}
int main()
{
	int n1;
	//printf("enter a no: ");
	//scanf("%d",&n1);
	square(n1);
	printf("\n exit from main function");
}