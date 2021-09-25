//wap to create a function square to acccept a no. and display the square of that no.

#include<stdio.h>
void square()
{
	int n,square;
	printf("\n enter a no.");
	scanf("%d",&n);
	square=n*n;
	printf("\n square = %d",square);
}
int main()
{
	square();
	printf("\n exit from mainn function");
}