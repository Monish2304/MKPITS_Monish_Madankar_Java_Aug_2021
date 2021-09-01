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
	add:
		printf("\n add");
		goto end;
	sub:
		printf("\n sub");
	mul:
		printf("\n mul");
	end:
		printf("\n bye");
	}