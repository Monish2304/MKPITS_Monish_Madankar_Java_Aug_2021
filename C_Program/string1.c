//wap to create character array of 10 elements to store a name.

#include<stdio.h>
int main()
{
	char name[10]={'m','o','n','i','s','h','\0'};
	int i;
	for(i=0;i<10;i++)
	{
		printf("%c",name[i]);
	}
	printf("\n name = %s",name);
}