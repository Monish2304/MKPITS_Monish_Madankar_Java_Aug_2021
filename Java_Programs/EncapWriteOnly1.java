class Book {

	private int id;

	private String title;

	public void setId(int id) {

		this.id=id;
	}

	public void setTitle(String title) {

		this.title=title;
	}

	public void display() {

		System.out.println("Id of Book is: " + id);

		System.out.println("Title of Book is: " + title);
	}
}

class EncapWriteOnly1 {

	public static void main(String []args) {

			Book b=new Book();

			b.setId(11);

			b.setTitle("Java");

			b.display();
		}
	}