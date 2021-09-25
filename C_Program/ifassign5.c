//wap to read the age of the candidate and determine whether it is eligible 
//for casting their vote.

#include<stdio.h>
void main()
{
	int age;
	printf("enter the age of a person: ");
	scanf("%d",&age);
	if(age>=18)
	{
		printf("\n the person is eligible to caste their vote");
	}
	else
	{
		printf("\n the person is not eligible to caste their vote");
	}
}