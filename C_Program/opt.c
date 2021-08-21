//wap to accept 2 nos and operators like +,-,*,/ and then display the result.

#include<stdio.h>
int main(){
	int n1,n2;
	float res=0;
	
	char op;
	printf("enter 2 nos: ");
	scanf("%d%d",&n1,&n2);
	printf("enter the operator like +,-,*,/: ");
	fflush(stdin);
	scanf("%c",&op);
	if (op=='+') {
		res=n1+n1;
	}
	else if (op=='-') {
		res=n1-n2;
	}
	else if (op=='*') {
		res=n1*n2;
	}
	else if (op=='/') {
		res=n1/n2;
	}
	else {
		printf("it is invalid operator.")
	}
	printf("%result=%f",res);
}