import java.io.*;

public class BufferedOutputStreamExample1 {

	public static void main (String []args)throws Exception {

		FileOutputStream fout=new FileOutputStream("M:\\IO\\testout1.txt");

		BufferedOutputStream bout=new BufferedOutputStream(fout);

		String s="Welcome to the world of JAVA";

		byte b[] = s.getBytes();

		bout.write(b);

		bout.flush();

		bout.close();

		fout.close();

		System.out.println("Success...");
	}
}