//wap to accept 5 sub marks then calculate total, per and grade.

#include<stdio.h>
int main()
{
	int s1,s2,s3,s4,s5;
	int total;
	float per;
	
	printf("\n enter 5 sub marks: ");
	scanf("%d%d%d%d%d",&s1,&s2,&s3,&s4,&s5);
	
	total=s1+s2+s3+s4+s5;
	printf("\n total of 5 sub = %d", total);
	
	per=(float)(total/500.0f)*100.0f;
	printf("\n percentage = %.2f",per);
	
	if(per>=75)
	{
		printf("\n Grade = A+");
	}
	else if(per>=60 & per<75)
	{
		printf("\n Grade = A");
	}
	else if (per>=45 & per<60)
	{
		printf("\n Grade = B");
	}
	else
	{
		printf("\n Grade = Fail");
	}
}