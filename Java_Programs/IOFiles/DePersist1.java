import java.io.*;
public class DePersist1
{
	public static void main(String[] arg) {
		try
		{

		FileInputStream fos=new FileInputStream("M://IO//cust.txt");
		ObjectInputStream oos=new ObjectInputStream(fos);
	Customer c1=(Customer)oos.readObject(); //deserialization

		fos.close();
		System.out.println("customer name " + c1.name);
		System.out.println("email id is " + c1.email);
	}
	catch(Exception ee)
	{
		System.out.println(ee.toString() );
	}
	}

}
