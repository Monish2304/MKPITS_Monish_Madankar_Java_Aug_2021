//wap to accept length ands breadth of rectangle and then print area of it

#include<stdio.h>
void main() {
	int l,b,a;
	printf("enter length and breadth of rectangle: ");
	scanf("%d%d",&l,&b);
	a=l*b;
	printf("area of rectangle=%d",a);
} 