class Student {

	int rollno;

	String name;

	static String college = "KITS";//Static Variable

	//Constructor

	Student(int r,String n) {

		rollno = r;

		name = n;

	}

	//Method to display the values

	void display() {System.out.println(rollno+" "+name+" "+college);}

}

	//Test class to show the values of object

	public class TestStaticVariable1 {

		public static void main(String []args) {

			Student s1=new Student(111,"Amit");

			Student s2=new Student(112,"Amar");

			s1.display();

			s2.display();

		}
	}