class Book {

	String title;
	int price;

	//creating constructor with no arguments
	Book() {

		System.out.println("Constructor with no argument called");

		title="Core Java";
		price=330;

		this.display();
	}

	//creating constructor with 2 parameters

	Book(String title,int price) {

		this();//used to invoke current class constructor

		System.out.println("Constructor with 2 parameters invoked");

		this.title=title;
		this.price=price;
	}

	void display() {

		System.out.println(title+" "+price);
	}
}

class TestBook3 {

	public static void main(String []args) {

		Book b=new Book("Oracle",450);

		b.display();
	}
}