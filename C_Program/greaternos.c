//wap to accept 2 nos and print greater nos.

#include<stdio.h>
void main() {
	int n1,n2;
	printf("enter the two number: ");
	scanf("%d%d",&n1,&n2);
	if(n1>n2) {
		printf("\n n1 is greater");
	}
	else {
		printf("n2 is greater");
	}
}