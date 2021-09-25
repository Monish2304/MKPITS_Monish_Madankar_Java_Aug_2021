class Book {

	private int id=111;

	private String title="Java";

	public int getId() {

		return id;
	}

	public String getTitle() {

		return title;
	}
}

	class EncapReadOnly1 {

		public static void main(String []args) {

			Book b=new Book();

			System.out.println("Id = " + b.getId());

			System.out.println("Title = " + b.getTitle());

		}
	}