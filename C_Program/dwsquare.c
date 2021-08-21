//wap to accept a no. and print square of it.
//program should ask user "do you to continue ? if yes press 'y' otherwise press 'n'.
#include<stdio.h>
int main(){
	int num,square;
	char ans;
	do{
		printf("\n enter the num: ");
		scanf("%d",&num);
		square=num*num;
		printf("\n square of number = %d",square);
		printf("\n do you want to continue, if yes press 'y' otherwise press 'n': ");
		fflush(stdin);
		scanf("%c",&ans);
	}while(ans=='y');
	printf("\n bye");
}