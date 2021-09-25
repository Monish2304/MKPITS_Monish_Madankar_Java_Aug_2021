class Book {

	String title;
	int price;

	Book(String title,int price) {

		this.title=title;
		this.price=price;
	}

	void display() {System.out.println(title+" "+price);}
}

class TestBook1 {

	public static void main(String []args) {


		Book b=new Book("Oracle",440);

		b.display();
	}
}