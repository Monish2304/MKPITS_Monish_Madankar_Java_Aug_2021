import java.io.*;
import java.net.*;
public class ClientEx2 {
public static void main(String[] args) {
try{
Socket s=new Socket("localhost",6666);
s.close();
}catch(Exception e){System.out.println(e);}
}
}