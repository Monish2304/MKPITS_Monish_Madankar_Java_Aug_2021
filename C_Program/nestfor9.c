#include<stdio.h>
void main()
{
	int row,col;
	for(row=1;row<=3;row++)
	{
		for(col=1;col<=row;col++)
		{
			if(col==1)
			{
				printf("\t %d",col);
			}
			else if(col==2)
			{
				printf("\t %d",col+1);
			}
			else if(col==3)
			{
				printf("\t %d",col+2);
			}
		}
		printf("\n");
	}
}