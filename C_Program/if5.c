//wap to accept basicsalary and designation like 'm' for manager, 'c' for clerk and 'p' for peon 
//and then calculate bonus.

#include<stdio.h>
int main()
{
	int basicsalary;
	float bonus,totalsalary;
	char desig;
	
	printf("\n enter the basicsalary: ");
	scanf("%d",&basicsalary);
	printf("\n enter designation like 'm', 'c', 'p': ");
	scanf("%s",&desig);
	
	if(desig=='m')
	{
		bonus=0.45*basicsalary;
	}
	else if(desig=='c')
	{
		bonus=0.35*basicsalary;
	}
	else
	{
		bonus=0.15*basicsalary;
	}
	printf("\n bonus = %.2f",bonus);
	totalsalary=basicsalary+bonus;
	printf("\n totalsalary = %.2f",totalsalary);
}