//wap to calculate and print electricity bill.

#include<stdio.h>
void main()
{
	int custid,unit;
	float totalamt,surchargeamt,netamt;
	char name[25];
	printf("enter the customer id: ");
	scanf("%d",&custid);
	printf("\n enter the name: ");
	scanf("%s",&name);
	printf("\n enter the units: ");
	scanf("%d",&unit);
	if(unit<=199)
	{	
		totalamt==unit*1.20f;
	}
	else if(unit>=200 && unit<400)
	{
		totalamt==unit*1.50f;
	}
	else if(unit>=400 && unit<600)
	{
		totalamt==unit*1.80f;
	}
	else if(unit>=600)
	{
		totalamt==unit*2.00f;
	}
	else
	{
		printf("\n invalid unit");
	}
	if(totalamt<=100)
	{
		totalamt==100.0f;
	}
	printf("\n netamt = %f",totalamt);
	if(totalamt>=400)
	{
		surchargeamt=(float)(0.15f*totalamt);
		printf("\n net amount to be paid by the customer = %f",surchargeamt);
	}
	netamt=totalamt+surchargeamt;
	printf("\n netamount to be paid by the consumer = %f",netamt);
}