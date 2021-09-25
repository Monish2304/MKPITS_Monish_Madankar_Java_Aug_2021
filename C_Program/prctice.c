#include<stdio.h>
int main()
{
	int bsal;
	float hra,totalsal;
	char desig;
	
	printf("\n enter the basic salary: ");
	scanf("%d",&bsal);
	printf("\n enter the designation like 'm','c','p':  ");
	fflush(stdin);
	scanf("%c",&desig);
	switch(desig)
	{
		case'm':
			hra=0.12*bsal;
			break;
		case'c':
			hra=0.08*bsal;
			break;
		case'p':
			hra=0.05*bsal;
			break;
		default:
			printf("\n invalid designation");
	}
	printf("\n hra = %0.2f",hra);
	
	totalsal = hra + bsal;
	printf("\n total salary = %0.2f",totalsal);
}