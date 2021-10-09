import java.io.*;

import java.util.*;

public class FileOutputStream1 {

	public static void main(String []args) {

		try {

			FileOutputStream fs=new FileOutputStream("M:\\IO\\myfile1.txt");

			Scanner scan=new Scanner(System.in);

			System.out.println("Enyter your name: ");

			String str = "Name: ";

			str +=scan.nextLine();

			byte[] arr = str.getBytes();

			fs.write(arr);

			fs.close();

			System.out.println("Data written to file successfully.");
		}

		catch(Exception ee) {

			System.out.println(ee.toString());
		}
	}
}