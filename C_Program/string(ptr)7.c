//wap to create a variable num and store a value 5 in it.

#include<stdio.h>
int main()
{
	int num=5;
	int *ptr;
	ptr=&num;
	printf("value in num = %d",*ptr);
}