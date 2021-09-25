//wap to print fibonacci series using for loop;

#include<stdio.h>
void main(){
	int num,a=0,b=1,c=1,i;
	printf("enter the no.: ");
	scanf("%d",&num);
	for(i=1;i<=num;i++)
	{
	c=a+b;
	printf(" %d ",c);
	a=b;
	b=c;
	}
	//printf("fibonacci series is : ");
}