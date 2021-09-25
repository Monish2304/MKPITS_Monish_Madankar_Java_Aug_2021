class Book {

	private int id;
	private String title;
	private String author;

	public void setId(int id) {

		if(id>100) {

			this.id=id;
		}

		else {

			System.out.println("Id should be greater than 100");
		}
	}

	public int getId() {

		return id;
	}

	public void setTitle(String title) {

		this.title=title;
	}

	public String getTitle() {

		return title;
	}

	public void setAuthor(String author) {

		this.author=author;
	}

	public String getAuthor() {

		return author;
	}
}

class Encapsulation2 {

	public static void main(String []args) {

		Book b=new Book();

		b.setId(101);

		System.out.println("Id = " + b.getId());

		b.setTitle("Java");

		System.out.println("Title of Book: " + b.getTitle());

		b.setAuthor("Martin");

		System.out.println("Author of Book: " + b.getAuthor());
	}
}