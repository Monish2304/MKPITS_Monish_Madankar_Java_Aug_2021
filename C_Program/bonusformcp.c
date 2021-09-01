//wap to accept basicsalary and designation like 'm' for manager, 'c' for clerk 
//and 'p' for peon and then calculate bonus=1000 for 'm', 500 for 'c' and 100 
//for 'p' and display basicsalary, bonus and totalsalary.

#include<stdio.h>
int main(){
	int bsalary,bonus=0,totalsal=0;
	char designation;
	printf("enter basic salary: ");
	scanf("%d",&bsalary);
	fflush(stdin);
	printf("enter the designation like m,c,p: ");
	scanf("%c",&designation);
	if(designation=='m'){
		bonus=1000;
	}
		else if(designation=='c'){
		bonus=500;
	}
	else if(designation=='p'){
		bonus=100;
	}
	totalsal=bsalary+bonus;
	printf("\n basic salary=%d",bsalary);
	printf("\n bonus=%d",bonus);
	printf("\n total salary=%d",totalsal);
	return 0;
	}
