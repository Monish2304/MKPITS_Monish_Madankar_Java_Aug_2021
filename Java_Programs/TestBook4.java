class Book {

	String title;
	int price;
	String company;

	Book(String company) {

		this.company=company;
	}

	Book(String title,int price,String company) {

		this(company);

		System.out.println("constructor with 2 parameters invoked");

		this.title=title;
		this.price=price;
	}

	void display() {System.out.println(title+" "+price+" "+company);}
}

class TestBook4 {

	public static void main(String []args) {

		Book b=new Book("Oracle",450,"mkpits");

		b.display();
	}
}