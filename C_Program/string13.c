//wap to copy one string to another.

#include<string.h>
int main()
{
	char s1[15];
	char s2[15];
	int length;
	printf("enter the string: ");
	gets(s1);
	strcpy(s2,s1);
	printf("\n string 1 =%s",s1);
	printf("\n string 2 =%s",s2);
}