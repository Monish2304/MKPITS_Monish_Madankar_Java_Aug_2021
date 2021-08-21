//wap to accept 2 nos and operator like +,-,*,/ and then display the result.

#include<stdio.h>
void main() {
	int n1,n2;
	float result=0;
	char op;
	printf("enter 2 nos: ");
	scanf("%d%d",&n1,&n2);
	printf("\n enter the operator: ");
	fflush(stdin);
	scanf("%c",&op);
	if (op=='+'){
		result=n1+n2;
	}
	else if (op=='-'){
		result=n1-n2;
	}
	else if (op=='*'){
		result=n1*n2;
	}
	else if (op=='/'){
		result=n1/n2;
	}
	else 
	{
		printf("\n it is not valid operator");
	}
	printf("\n result = %f",result);
}