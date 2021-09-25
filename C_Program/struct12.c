//wap to create a structure array of 5 elements of structure book.

struct book
{
	int bookid;
	char title[20];
	char author[20];
	float price;
};

void display(struct book b1);

#include<stdio.h>
int main()
{
	struct book b[5];
	int i=0;
	while(i<5)
	{
		printf("\n enter book id: ");
		fflush(stdin);
		scanf("%d",&b[i].bookid);
		printf("\n enter title: ");
		fflush(stdin);
		gets(b[i].title);
		printf("\n enter author: ");
		fflush(stdin);
		gets(b[i].author);
		printf("\n enter price: ");
		scanf("%.2f",b[i].price);
		printf("\n---------------");
		printf("\n book[%d] details are: ",i+1);
		display(b[i]);
		i++;
	}
}

void display(struct book b1)
{
	printf("\n book id = %d",b1.bookid);
	printf("\n title = %s",b1.title);
	printf("\n author = %s",b1.author);
	printf("\n price = %.2f",b1.price);
	printf("\n--------------");
}