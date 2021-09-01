//create a structure employee to produce employee salary statement.

struct employee
{
	int empno;
	char name[20];
	float salary;
};

void display(struct employee e1);

#include<stdio.h>;
int main()
{
	int i=0;
	while(i<3)
	
	{
	printf("\n enter employee no: ");
	scanf("%d",&e[i].empno);
	printf("\n enter employee name: ");
	scanf("%s",&e[i].name);
	printf("\n enter salary: ");
	scanf("%f",&e[i].salary);
	printf("\n -----------employee[i] details are-----------");
	display(e[i]);
	printf("\n----------------------",i+1);
	i++;
	}
}
	void display(struct employee e1)
	
{
	float hra,da,totalsalary;
		
	printf("\n employee no = %d",e1.empno);
	printf("\n employee name = %s",e1.name);
	
	hra=s1.salary*.15f;
	da=s1.salary*.35f;
	totalsalary=hra+da+s1.salary;
	
	printf("\n hra = %.2f",hra);
	printf("\n da = .2f",da);
	printf("\n salary = %f",totalsalary);
}