#include<stdio.h>
int main()
{
	int marks,sum,i=1;
	float per;
	while(i<=5)
	{
		printf("\n enter marks[%d]: ",i);
		scanf("%d",&marks);
		
		sum=sum+marks;
		
		i++;
	}
	
	printf("\n sum of 5 subjects = %d",sum);
	
	per=(float)(sum/500.0f)*100.0f;
	printf("\n\n percentage = %.2f",per);
	
	if(per>=75)
	{
		printf("\n\n Grade = A");
	}
	else if(per>=60 & per<75)
	{
		printf("\n\n Grade = B");
	}
	else if(per>=45 & per<60)
	{
		printf("\n\n Grade = C");
	}
	else
	{
		printf("\n\n Fail");
	}
}