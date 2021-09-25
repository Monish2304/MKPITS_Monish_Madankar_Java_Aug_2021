//wap to print febonacci series 1 1 2 3 5 8 13 . . .


#include<stdio.h>
int main()
{
	int a=1,b=1,c;
	int i=1;
	
	while(i<=7)
	{
		c=a+b;
		a=b;
		b=c;
		printf(" %d ");
		i++;
	}
}