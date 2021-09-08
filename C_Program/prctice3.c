#include<stdio.h>
int main()
{
	int num,i;
	printf("\n enter the no.: ");
	scanf("%d",&num);
	
	for(i=2;i<num;i++)
	{
		if(num%i==0)
		{
			printf("\n it not a prime no");
			break;
		}	
	}
		if(i==num)
		printf("\n it is a prime no");
	
}