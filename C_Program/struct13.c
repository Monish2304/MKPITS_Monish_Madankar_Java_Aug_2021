//wap to create a structure array of 10 elements of structure product.

struct product
{
	int productid;
	char name[20];
	float price;
};

void display(struct product p1);

#include<stdio.h>
int main()
{
	struct product p[10];
	int i=0;
	while(i<10)
	{
		printf("\n enter product id: ");
		fflush(stdin);
		scanf("%d",&p[i].productid);
		printf("\n enter name: ");
		fflush(stdin);
		gets(p[i].name);
		printf("\n enter price: ");
		scanf("%.2f",p[i].price);
		printf("\n---------------");
		printf("\n product[%d] details are: ",i+1);
		display(p[i]);
		i++;
	}
}

void display(struct product p1)
{
	printf("\n product id = %d",p1.productid);
	printf("\n name = %s",p1.name);
	printf("\n price = %.2f",p1.price);
	printf("\n--------------");
}