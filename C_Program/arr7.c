//create a 2d array of 2 rows and 4 columns and store some value in it and display the values.

#include<stdio.h>
int main()
{
	int arr[2][4];
	int r,c;
	for(r=0;r<2;r++)
	{
		for(c=0;c<4;c++)
		{
			printf("enter the values: ");
			scanf("%d",&arr[r][c]);
		}
	}
	for(r=0;r<2;r++)
	{
		for(c=0;c<4;c++)
		{
			printf("\t %d",arr[r][c]);
		}
		printf("\n");
	}
}