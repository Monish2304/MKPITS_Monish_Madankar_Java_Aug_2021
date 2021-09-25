//wap to convert into upper case.

#include<string.h>
int main()
{
	char name[15];
	
	printf("enter the name: ");
	gets(name);
	
	strupr(name);
	printf("\n name = %s",name);
}