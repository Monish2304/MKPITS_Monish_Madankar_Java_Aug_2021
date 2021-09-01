//creat a 2d array of 2 rows and 2 columns and accept the value from user and store it in an array.

#include<stdio.h>
int main()
{
	int arr[2][2];
	int row,col;
	for(row=0;row<2;row++)
	{
		for(col=0;col<2;col++)
		{
			printf("\n enter the number: ");
			scanf("%d",&arr[row][col]);
		}
	}
	for(row=0;row<2;row++)
	{
		for(col=0;col<2;col++)
		{
			printf("\t %d",arr[row][col]);
		}
		printf("\n");
	}
}