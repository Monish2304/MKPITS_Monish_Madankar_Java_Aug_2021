class Student {

	int rollno;
	String name;
	static String college="BBDIT";

	//static method to change the value of static variable

	static void Change() {

		college="KITS";
	}

	Student(int r,String n) {

		rollno=r;
		name=n;
	}

	void display() {System.out.println(rollno+" "+name+" "+college);}
}

	public class TestStaticMethod {

		public static void main(String []args) {

			Student.Change();//calling the change method

			Student s1=new Student(111,"Amit");
			Student s2=new Student(112,"Amar");
			Student s3=new Student(113,"Ajay");

			s1.display();
			s2.display();
			s3.display();
		}
	}