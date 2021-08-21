//wap to print table of the no.

#include<stdio.h>
int main(){
	int num,res,i=1;
	char ans;
	do
	{
	printf("enter the no.: ");
	scanf("%d",&num);
	while(i<=10){
		res=num*i;
		i++;
		printf("\n %d * %d = %d",num,i,res);
	}
	printf("\n do you want to continue ? , press 'y' for yes otherwise press 'n': ");
	fflush(stdin);
	scanf("%c",&ans);
	}while(ans=='y');
	printf("\n bye");
}