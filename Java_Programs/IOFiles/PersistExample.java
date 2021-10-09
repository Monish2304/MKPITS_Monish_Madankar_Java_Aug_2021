    import java.io.*;
    public class Student2 implements Serializable{
     int id;
     String name;
     transient int age;//Now it will not be serialized
     public Student(int id, String name,int age) {
      this.id = id;
      this.name = name;
      this.age=age;
     }
    }
       class PersistExample{
	     public static void main(String args[])throws Exception{
	      Student s1 =new Student(211,"ravi",22);//creating object
	      //writing object into file
	      FileOutputStream f=new FileOutputStream("M:\\IO\\f.txt");
	      ObjectOutputStream out=new ObjectOutputStream(f);
	      out.writeObject(s1);
	      out.flush();
	      out.close();
	      f.close();
	      System.out.println("success");
	     }
	    }
