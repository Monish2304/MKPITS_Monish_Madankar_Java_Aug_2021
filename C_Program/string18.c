//wap to convert into lower case.

#include<string.h>
int main()
{
	char name[15];
	
	printf("enter the name: ");
	gets(name);
	
	strlwr(name);
	printf("\n name = %s",name);
}