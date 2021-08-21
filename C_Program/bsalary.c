//wap to accept basicsalary and then calculate bonus

#include<stdio.h>
void main() {
	int bsalary,bonus;
	printf("enter the bsalary: ");
	scanf("%d",&bsalary);
	if (bsalary>=10000) {
		bonus=1000;
	}
	else if (bsalary>=5000 && bsalary<10000) {
		bonus=500;
	}
	else {
		bonus=100;
	}
	print("\n bonus=%d",bonus);
}