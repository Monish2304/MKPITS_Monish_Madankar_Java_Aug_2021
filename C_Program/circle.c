//wap to accept radius of a circle and print area and circ. of circle

#include<stdio.h>
void main() {
	int radius;
	float area,circ,pi=3.14;
	printf("enter the radius of circle: ");
	scanf("%d",&radius);
	area=pi*radius*radius;
	circ=2*pi*radius;
	printf("\n area of circle=%.2f",area);
	printf("\n circ of circle=%.2f",circ);
} 