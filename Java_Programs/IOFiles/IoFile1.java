import java.io.*;

import java.util.*;

public class IoFile1 {

	public static void main(String []args) {

		try {

			FileOutputStream fs=new FileOutputStream("M:\\IO\\IOFile1.txt");

			Scanner scan=new Scanner(System.in);

			System.out.println("Enyter your name: ");

			String str = "Name: ";

			str +=scan.nextLine();

			byte[] arr = str.getBytes();

			fs.write(arr);

			fs.close();

			System.out.println("data written to file successfully.");
		}

		catch(Exception ee) {

			System.out.println(ee.toString());
		}
	}
}