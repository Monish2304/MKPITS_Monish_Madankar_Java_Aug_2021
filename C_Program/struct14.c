//create a structure array to produce result of student.

struct student
{
	int rno;
	char name[20];
	int marks1;
	int marks2;
	int marks3;
};

void display(struct student s1);
#include<stdio.h>
int main()
{
	struct student s[3];
	int i=0;
	while(i<3)
	{
		printf("\n enter rno.: ");
		scanf("%d",&s[i].rno);
		printf("\n enter name: ");
		scanf("%s",&s[i].name);
		printf("\n enter marks1: ");
		scanf("%d",&s[i].marks1);
		printf("\n enter marks2: ");
		scanf("%d",&s[i].marks2);
		printf("\n enter marks3: ");
		scanf("%d",&s[i].marks3);
		printf("\n-----------student[%d] details are-------------",i+1);
		display(s[i]);
		printf("\n-----------------------",i+1);
		i++;
	}
}

void display (struct student s1)
{
	int total;
	float per;
	printf("\n rno = %d",s1.rno);
	printf("\n name = %s",s1.name);
	
	total=s1.marks1+s1.marks2+s1.marks3;
	printf("\n total marks = %d",total);
	
	per=(float)(total/300.0f)*100.0f;
	printf("\n percentage = %.2f",per);
	
	if(per>=75)
	{
		printf("\n grade = distinction");
	}
	else if(per>=60 && per<75)
	{
		printf("\n grade = first");
	}
	else
	{
		printf("\n grade = fail");
	}
}