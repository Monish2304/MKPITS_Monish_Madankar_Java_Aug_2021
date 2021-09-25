//wap to compare  two strings.

#include<string.h>
int main()
{
	char name1[30];
	char name2[15];
	printf("enter name 1: ");
	gets(name1);
	printf("enter name 2: ");
	gets(name2);
	if(strcmp(name1,name2)==0)
	{
		printf("\n both the strings are same.");
	}
	else
	{
		printf("\n both the strings are different.");
	}
}