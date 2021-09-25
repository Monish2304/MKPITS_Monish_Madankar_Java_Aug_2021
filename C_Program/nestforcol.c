//wap to print o/p : 1	1	1
//					 2	2	2
//					 3	3	3

#include<stdio.h>
int main()
{
	int row,col;
	for(row=1;row<=3;row++)
	{
		for(col=1;col<=3;col++)
		{
			printf("\t %d",col);
		}
		printf("\n");
	}
}