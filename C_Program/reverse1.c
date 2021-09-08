//wap to accept a 3 digit no. and print reverse of that no.

#include<stdio.h>
int main()
{
	int num=123;
	int rem;
	int rev=0;
	
	while(num != 0)
	{
		rem = num % 10;
		num = num / 10;
		rev = rev * 10 + rem;
	}
	printf("\n reverse num = %d",rev);
}