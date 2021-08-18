//wap to accept length, breadth and height and print volume

#include<stdio.h>
void main() {
	int l,b,h,v;
	printf("enter thelength, breadth, height: ");
	scanf("%d%d%d",&l,&b,&h);
	v=l*b*h;
	printf("volume=%d",v);
}