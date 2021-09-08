//wap to accept 3 nos and display the smallest no.

#include<stdio.h>
int main()
{
	int n1,n2,n3;
	printf("\n enter 3 nos to compare: ");
	scanf("%d%d%d",&n1,&n2,&n3);
	
	if(n1<n2 && n2<n3)
	{
		printf("\n n1 is smallest no.");
	}
	else if(n2<n3)
	{
		printf("\n n2 is smallest no.");
	}
	else
	{
		printf("\n n3 is smallest no.");
	}
}