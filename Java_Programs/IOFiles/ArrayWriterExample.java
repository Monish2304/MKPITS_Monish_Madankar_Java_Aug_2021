package com.mkpits;

import java.io.CharArrayWriter;

import java.io.FileWriter;

public class CharArrayWriterExample {

	public static void main(String []args)throws Exception {

		CharArrayWriter out=new CharArrayWriter();

		out.write("Wel_Come to the world of JAVA");

		FileWriter f1=new FileWriter("M:\\IO\\D.txt");

		FileWriter f2=new FileWriter ("M:\\IO\\D.txt");

		FileWriter f3=new FileWriter("M:\\IO\\D.txt");

		FileWriter f4=new FileWriter("M:\\IO\\D.txt");

		out.writeTo(f1);

		out.writeTo(f2);

		out.writeTo(f3);

		out.writeTo(f4);

		f1.close();

		f2.close();

		f3.close();

		f4.close();

		System.out.println("Success...");
	}
}
