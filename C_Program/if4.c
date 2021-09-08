//wap to accept basicsalary and calculate hra, da and totalsalary.

#include<stdio.h>
int main()
{
	int basicsalary;
	float hra,da,totalsalary;
	
	printf("\n enter the basic salary: ");
	scanf("%d",&basicsalary);
	
	if(basicsalary>=10000)
	{
		hra=0.45*basicsalary;
		da=0.55*basicsalary;
	}
	else if(basicsalary>=5000 & basicsalary<10000)
	{
		hra=0.25*basicsalary;
		da=0.35*basicsalary;
	}
	else
	{
		hra=0.15*basicsalary;
		da=0.05*basicsalary;
	}
	totalsalary=basicsalary+hra+da;
	printf("\n total salary = %.2f",totalsalary);
}