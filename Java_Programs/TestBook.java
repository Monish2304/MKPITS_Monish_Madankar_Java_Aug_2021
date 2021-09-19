class Book {

	String title;
	int price;

	Book(String title,int price) {

		this.title=title;
		this.price=price;
	}

	void display() {System.out.println(title+" "+price);}
}

class TestBook {

	public static void main(String []args) {


		Book b=new Book("Java",540);

		b.display();
	}
}