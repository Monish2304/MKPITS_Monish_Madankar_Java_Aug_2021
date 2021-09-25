//example of goto statement to do calculations.

#include<stdio.h>
void main()
{
	int n1,n2,res;
	char op;
	printf("enter two nos: ");
	scanf("%d%d",&n1,&n2);
	fflush(stdin);
	printf("enter the operator like +,-,*: ");
	scanf("%c",&op);
	if(op=='+'){
		goto add;
	}
	else if(op=='-')
	{
		goto sub;
	}
	else if(op=='*')
	{
		goto mul;
	}
	else
	{
		printf("\n invalid operator");
		goto end;
	}
	add:
		res=n1+n2;
		goto end;
	sub:
		res=n1-n2;
		goto end;
	mul:
		res=n1*n2;
		goto end;
	end:
		printf("\n result = %d",res);
	}