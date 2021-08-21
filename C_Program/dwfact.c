//wapto accept no and print factorial of it using do while loop.

#include<stdio.h>
void main(){
	int n1,n2,n3,i,num;
	do
	{
	printf("enter the no.: ");
	scanf("%d%d",&n1,&n2);
	n3=n1+n2;
	num=i++;
	n2=n1;
	n3=n2;	
	}while(num<=i);
	printf("\n n3 = %d",n3);
}