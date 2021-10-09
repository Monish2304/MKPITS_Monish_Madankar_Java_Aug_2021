import java.io.*;

import java.util.*;

public class IoFile2 {

	public static void main(String []args) {

		try {

			FileInputStream fin=new FileInputStream("m:\\testout.txt");

			int i=fin.read();

			System.out.println((char)i);

			fin.close();
		}catch(Exception e) { System.out.println(e); }
	}
}