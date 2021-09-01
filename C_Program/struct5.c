//create a structure book and create 2 structure variable b1 and b2.

struct book
{
	int bookid;
	char title[20];
	char author[20];
	float price;
}b1,b2;

int main()
{
	//struct book b1,b2;
	
	b1.bookid=123;
	strcpy(b1.title,"Mathematics");
	strcpy(b1.author,"Aryabhatta");
	b1.price=2599.99f;
	
	printf("\n book id = %d",b1.bookid);
	printf("\n book title = %s",b1.title);
	printf("\n book author = %s",b1.author);
	printf("\n book price = %.2f",b1.price);
	
	printf("\n------------------------------");
	
	b2.bookid=125;
	strcpy(b2.title,"Oracle");
	strcpy(b2.author,"Bill");
	b2.price=599.99f;
	
	printf("\n book id = %d",b2.bookid);
	printf("\n book title = %s",b2.title);
	printf("\n book author = %s",b2.author);
	printf("\n book price = %.2f",b2.price);

}