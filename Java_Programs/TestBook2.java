class Book {

	String title;
	int price;

	void insert(String title,int price) {

		this.title=title;
		this.price=price;

	//display();//calling display method from insert mehod

	this.display();
}

void display() {System.out.println(title+" "+price);}
}

class TestBook2 {

	public static void main(String []args) {

		Book b=new Book();

		b.insert("Oracle",520);
	}
}