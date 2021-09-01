// wap to find the eligibility of admission for a professional course.

#include<stdio.h>
void main()
{
	int p,c,m,total,t;
	printf("enter the marks of physics: ");
	scanf("\n %d",&p);
	printf("\n enter the marks of chemistry: ");
	scanf("\n %d",&c);
	printf("\n enter the marks of maths: ");
	scanf("\n %d",&m);
	total=p+c+m;
	printf("\n total marks of physics,chemistry and maths = %d",total);
	t=p+m;
	printf("\n total marks of physics and maths = %d",t);
	if(m>=65 && p>=55 && c>=50 && total>=190 && t>=140)
	{
		printf("\n the candidate is eligible for admission");
	}
	else
	{
		printf("\n the candidate is not eligible for admission");
	}
}