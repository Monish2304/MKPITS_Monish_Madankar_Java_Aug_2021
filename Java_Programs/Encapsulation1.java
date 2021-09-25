class Book {

	private String title;
	private String author;

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

class Encapsulation1 {

	public static void main(String []args) {

		Book t=new Book();

		t.setTitle("Java");

		System.out.println("Title: " + t.getTitle());

		t.setAuthor("Martin");

		System.out.println("Author: " + t.getAuthor());
	}
}