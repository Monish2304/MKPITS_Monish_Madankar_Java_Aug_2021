//wap to accept 5 sub marks using while loop and print the sum of 5 subjects.

#include<stdio.h>
int main()
{
	int i=1;
	char name[20];
	printf("\n enter your name: ");
	scanf("%s",&name);
	while(i<=5){
		printf("\n name = %s",name);
		i=i+1;
	}
}