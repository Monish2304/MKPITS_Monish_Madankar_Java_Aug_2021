//wap to accept 2 nos and operator like +,-,*,/ and then display the result.

#include<stdio.h>
int main(){
	int n1,n2;
	float res=0.0f;
	char operator;
	printf("enter 2 nos. ");
	scanf("%d%d",&n1,&n2);
	printf("enter operator like +,-,*,/ : ");
	fflush(stdin);
	scanf("%c",&operator);
	if(operator=='+'){
		res=n1+n2;
	}
	else if(operator=='-'){
		res=n1-n2;
	}
	else if(operator=='*'){
		res=n1*n2;
	}
	else if(operator=='/'){
		res=(float)n1/n2;
	}
	else
	{
		printf("\n not a valid operator");
	}
	printf("\n result = %.2f",res);
	}