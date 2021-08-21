//wap to accept age of 5 students using for loop and then display the average age.

#include<stdio.h>
void main(){
	int age,total,i;
	float average;
	for(i=1;i<=5;i++)
	{
		printf("enter the age of 5 students: ");
		scanf("%d",&age);
		total=total+age;
	}
	average=(float)total/5.0f;
	printf("\n averarge age of 5 student = %.2f",average);
}