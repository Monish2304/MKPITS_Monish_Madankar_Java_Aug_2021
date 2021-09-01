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
	struct student s1;
	printf("enter rno: ");
	scanf("%d",&s1.rno);
	printf("\n enter name: ");
	scanf("%s",&s1.name);
	printf("\n enter address: ");
	scanf("%s",s1.addr);
	
	printf("\n student deetails are: ");
	display(s1);
}

void display(struct student s1)
{
	printf("\n roll no = %d ",s1.rno);
	printf("\n name = %s",s1.name);
	printf("\n address = %s",s1.addr);
}