//wap to print prime no. between 1 and 20 using while loop.

#include<stdio.h>
int main()
{
	int num,factor=0;
	int i=1;
	
	for(num=1;num<=20;num++)
	{
		while(i<=num)
		{	
			if(num%i==0)
			i++;
		}
		factor==2;
		printf("\n %d",num);
	}
	//printf("\n %d",num);
}