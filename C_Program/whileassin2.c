//wap to print prime no. between 1 and 20 using while loop.

#include<stdio.h>
int main()
{
	int num=1,i;
	
	do
	{
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			num++;
		}
		if(i==num)
		{
			printf("\n %d",num);
		}
	}while(num<=20);
}