//wap to accept 5 products name and product price in array and then pass this array to function to calc price.

int main()
{
	char prod_name[5][20];
	int price[5],i;
	for(i=0;i<5;i++)
	{
		printf("\n enter 5 product name: ");
		scanf("%s",&prod_name);
		printf("\n enter 5 product price: ");
		scanf("%d",&price[i]);
	}
	for(i=0;i<5;i++)
	{
		printf("\n prod name = %s",prod_name);
	}
	calculate_price(price);
}

void calculate_price(int pr[])
{
	int total=0,i;
	for(i=0;i<5;i++)
	{
		total=total+pr[i];
	}
	printf("\n total price of product = %d",total);
}