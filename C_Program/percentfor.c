//wap to accept 5 sub marks using for loop and print total and percentage.

#include<stdio.h>
void main()
{
	int marks,total,i;
	float per;
	for(i=1;i<=5;i++)
	{
		printf("enter the marks: ");
		scanf("%d",&marks);
		total=total+marks;
	}
	printf("\n total marks = %d",total);
	per=(float)(total/500.0f)*100.0f;
	printf("\n percentage = %.2f",per);
	if(per>=75){
		printf("\n grade = first");
	}
	else if(per>=40 && per<75){
		printf("\n grade = first");
	}	
	else {
		printf("grade = fail");
	}
}