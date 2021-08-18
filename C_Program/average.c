//wap to accept 3 nos and print total and average

#include<stdio.h>
void main() {
	int n1,n2,n3,total;
	float average;
	printf("enter the 3 nos: ");
	scanf("%d%d%d",&n1,&n2,&n3);
	total=n1+n2+n3;
	printf("\n total=%d",total);
	average=total/3;
	printf("\n average=%.2f",average);
}