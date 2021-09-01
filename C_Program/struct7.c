//create a structure product and accept values from the user.

struct product
{
	int productid;
	char productname[20];
	float price;
};

int main()
{
	struct product p1;
	 
	printf("\n enter product id: ");
	scanf("%d",&p1.productid);
	printf("\n enter product name: ");
	scanf("%s",&p1.productname);
	printf("\n enter price of the product: ");
	scanf("%f",&p1.price);
	
	printf("\n product details are: ");
	printf("\n product id = %d",p1.productid);
	printf("\n product name = %s",p1.productname);
	printf("\n product price = %.2f",p1.price);
	
}