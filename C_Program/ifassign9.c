//wap to read temp. in centigrade and display a suitable message according to temp.

#include<stdio.h>
void main()
{
	float temp;
	printf("enter the temperature: ");
	scanf("%f",&temp);
	if(temp<0)
	{
		printf("It is a freezing whether");
	}
	else if(temp>0 && temp<=10)
	{
		printf("It is very cold whether");
	}
	else if(temp>10 && temp<=20)
	{
		printf("It is cold whether");
	}
	else if(temp>20 && temp<=30)
	{
		printf("It is normal temperaure");
	}
	else if(temp>30 && temp<=40)
	{
		printf("It is hot temperature");
	}
	else
	{
		printf("It is very hot temperature");
	}
}