//wap to find whether a string is palindrome or not.

#include<string.h>
int main()
{
	char name[30];
	char orgname[30];
	char revname[30];
	
	printf("enter name: ");
	gets(name);
	strcpy(orgname,name);
	printf("\n original name = %s",orgname);
	strrev(name);
	printf("\n reverse name = %s",name);
	if(strcmp(orgname,name)==0)
	{
		printf("\n string is palidrome");
	}
	else
	{
		printf("\n string is not palidrome");
	}
}