#include<stdio.h>
int main()
{
	int i,num,count;
	printf("Prime nos between 1 and 20 are: ");
	
	for(num=1;num<=20;num++)
	{
		count=0;
		
		for(i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0 && num!=1)
		{
			printf("%d",num);
		}
	}
}