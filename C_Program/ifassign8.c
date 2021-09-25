// wap to read roll no., name and marks of three subjects and calculate the total,
//percentage and division.

#include<stdio.h>
void main()
{
	int roll,m1,m2,m3,total;
	float per;
	char name[30];
	printf("enter the name of the student: ");
	scanf("%c",&name);
	fflush(stdin);
	printf("\n enter the roll no. of the student: ");
	scanf("%d",&roll);
	printf("\n enter the marks of three subjects: ");
	scanf("\n %d%d%d",&m1,&m2,&m3);
	total=m1+m2+m3;
	printf("\n total marks = %d",total);
	per=(float)(total/300.0f)*100.0f;
	printf("\n percentage of the student = %.2f",per);
	if(per>=75)
	{
		printf("\n division A");
	}
	else if(per>=60 && per<75)
	{
		printf("\n division B");
	}
	else if(per>=40 && per<60)
	{
		printf("\n division C");
	}
	else
	{
		printf("\n fail");
	}
}