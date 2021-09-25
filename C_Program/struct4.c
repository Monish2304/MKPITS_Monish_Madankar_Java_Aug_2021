//create a structure product with members productid, productname, productprice.

struct product
{
	int productid;
	char productname[25];
	float productprice;
};

int main()
{
	struct product p1;
	
	p1.productid=123;
	strcpy(p1.productname,"College Bag");
	p1.productprice=999.99f;
	
	printf("\n product id = %d",p1.productid);
	printf("\n product name = %s",p1.productname);
	printf("\n product price = %.2f",p1.productprice);
	
}