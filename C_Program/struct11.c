//wap to create a structure array of 3 elements of structure students.

struct student
{
	int rno;
	char name[20];
	char addr[20];
};

void display(struct student s1);

#include<stdio.h>
int main()
{
	struct student s[3];
	int i=0;
	while(i<3)
	{
		printf("\n enter roll no: ");
		scanf("%d",&s[i].rno);
		printf("\n enter name: ");
		scanf("%s",s[i].name);
		printf("\n enter address: ");
		fflush(stdin);
		gets(s[i].addr);
		printf("\n---------------");
		printf("\n student[%d] details are: ",i+1);
		display(s[i]);
		i++;
	}
}

void display(struct student s1)
{
	printf("\n rno = %d",s1.name);
	printf("\n name =%s",s1.name);
	printf("\n addr =%s",s1.addr);
	printf("\n--------------");
}