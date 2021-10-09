import java.io.FileOutputStream;

public class FileOutputStream2 {

	public static void main(String []args) {

		try {

			FileOutputStream fout=new FileOutputStream("M:\\IO\\testout1.txt");

			String s="Welcome to the World of JAVA";

			byte b[]=s.getBytes();

			fout.write(b);

			fout.close();

			System.out.println("Success...");

		}catch(Exception e) { System.out.println(e);}
	}
}