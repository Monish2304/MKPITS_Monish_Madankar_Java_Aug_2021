//wap to accept 3 sub marks and calculate total, percentage and grade.

#include<stdio.h>
void main() {
	int s1,s2,s3,total;
	float percentage;
	printf("enter the marks of 3 sub: ");
	scanf("%d%d%d",&s1,&s2,&s3);
	total=s1+s2+s3;
	printf("\n total marks = %d",total);
	percentage=(total/300.0f) * 100.0f;
	printf("\n percentage = %.2f",percentage);
	if(percentage>=75) 
	{
		printf("\n grade  = distinction");
	}
	else if(percentage>=60 && percentage<75)
	{
		printf("\n grade = first");
	}
	else if(percentage>=40 && percentage<60) 
	{
		printf("\n grade = second");
	}
	else 
	{
		printf("\n grade = fail");
	}
}