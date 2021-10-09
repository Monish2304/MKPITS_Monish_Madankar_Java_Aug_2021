import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String []args) {

		try {

			FileOutputStream fout=new FileOutputStream("M:\\IO\\testout.txt");

			fout.write(65);

			fout.close();

			System.out.println("Success...");

		}catch(Exception e) { System.out.println(e);}
	}
}