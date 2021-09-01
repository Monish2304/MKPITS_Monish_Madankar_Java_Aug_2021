//wap to print odd number;

#include<stdio.h>
void main()
{
	int i;
	for(i=1;i<=10;i++)
	{
		if(i%2==0)
		{
			continue;
		}
		printf("\n %d",i);
	}
}