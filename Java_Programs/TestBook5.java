class Book {

	String title;
	int price;
	String company;

	Book() {

		this("Java",200,"Macmohan");
	}

	Book(String title,int price,String company) {

		this.title=title;
		this.price=price;
		this.company=company;
	}

	void display() {System.out.println(title+" "+price+" "+company);}
}

class TestBook5 {

	public static void main(String []args) {

		Book b=new Book();

		b.display();
	}
}