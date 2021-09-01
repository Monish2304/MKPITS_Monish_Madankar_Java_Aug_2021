//create a structure student with members rno, name and address, pass this structure to function.

struct student 
{
	int rno;
	char name[20];
	char addr[25];
};

void display(struct student s1);

#include<stdio.h>
int main()
{
	struct student s1,s2;
	
	printf("enter roll no.: ");
	scanf("%d",&s1.rno);
	printf("\n enter name: ");
	scanf("%s",s1.name);
	printf("\n enter address: ");
	fflush(stdin);
	gets(s1.addr);
	printf("\n------");
	printf("\n student 1 details are: ");
	display(s1);
	
	printf("\n --------------------");
	printf("\n enter roll no.: ");
	scanf("%d",&s2.rno);
	printf("\n enter name: ");
	scanf("%s",s2.name);
	printf("\n enter address: ");
	fflush(stdin);
	gets(s2.addr);
	printf("\n------");
	printf("\n student 2 details are: ");
	display(s2);
	printf("\n-----------------------");
}

void display(struct student s1)
{
	printf("\n roll no = %d",s1.rno);
	printf("\n name = %s",s1.name);
	printf("\n address = %s",s1.addr);
}