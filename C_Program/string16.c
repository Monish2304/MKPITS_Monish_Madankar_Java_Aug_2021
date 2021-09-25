//wap to reverse a string.

#include<string.h>
int main()
{
	char name[30];
	char revname[30];
	
	printf("enter a name: ");
	gets(name);
	printf("\n name = %s",name);
	
	strrev(name);
	
	printf("\n after reversing name = %s",name);
}