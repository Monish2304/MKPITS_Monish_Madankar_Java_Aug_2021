//wap to print prime no. between 1 to 20 using for loop.

#include<stdio.h>
void main()
{
	int num=1,i;
	while(num<=20)
	{
		for(i=1;i<=20;i++)
		{
			num%i!=0;
			//num=num+1;
		}
	}
	printf("\n %d",num);
}
	