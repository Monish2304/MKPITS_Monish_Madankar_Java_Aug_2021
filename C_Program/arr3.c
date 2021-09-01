//creat a 2d array of 2 rows and 2 columns and store some values in it and display the values.

#include<stdio.h>
int main()
{
	int arr[2][2];
	arr[0][0]=11;
	arr[0][1]=13;
	arr[1][0]=20;
	arr[1][1]=30;
	
	printf("\n arr[0][0] = %d",arr[0][0]);
	printf("\n arr[0][1] = %d",arr[0][1]);
	printf("\n arr[1][0] = %d",arr[1][0]);
	printf("\n arr[1][1] = %d",arr[1][1]);
}