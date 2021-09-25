//wap to create a function sum with 2 int parameters and write code in it to add and 
//displaythe addition off 2 nos.

#include<stdio.h>
void sum(int n1,int n2)
{
	int result=n1+n2;
	printf("\n addition of two nos. = %d",result);
}
int main()
{
	int n1,n2;
	printf("enter 2 nos: ");
	scanf("%d%d",&n1,&n2);
	sum(n1,n2);
	printf("\n exit from  main function.");
}