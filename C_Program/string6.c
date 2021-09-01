//wap to accept empno, firstname, lastname, designation and salary of the employee and display it.

#include<stdio.h>
int main()
{
	int empno;
	char firstname[20];
	char lastname[20];
	char designation[20];
	float salary;
	
	printf("enter employee no.: ");
	scanf("%d",&empno);
	
	printf("enter first name: ");
	fflush(stdin);
	gets(firstname);
	
	printf("enter last name: ");
	fflush(stdin);
	gets(lastname);
	
	fflush(stdin);
	printf("enter designation: ");
	//fflush(stdin);
	gets(designation);
	
	printf("enter salary: ");
	scanf("%f",&salary);
	
	printf("\n employee deteils are: ");
	printf("\n empno = %d",empno);
	printf("\n first name = %s",firstname);
	printf("\n last name = %s",lastname);
	printf("\n designation = %s",designation);
	printf("\n salary = %.2f",salary);
}