//wap to to search an element in an array.

#include<stdio.h>
int  main()
{
	int arr[5]={1,2,3,4,5};
	int i,num;
	printf("enter a number to be search: ");
	scanf("%d",&num);
	for(i=0;i<5;i++)
	{
		if(num==arr[i])
		{
			printf("\n number found at element[%d]",num-1);
			break;
		}
	}
	if(i==5)
	{
		printf("\n number not found in an array.");
	}
}