package Networking;

import java.io.*;
import java.net.*;
public class Server1 {
    public static void main(String[] args){
        try{
            ServerSocket ss=new ServerSocket(6666);
            System.out.println("Waiting for Client to Connect... ");

            Socket s=ss.accept();//establishes connection
            System.out.println("Client Connected.");

/*DataInputStream dis=new DataInputStream(s.getInputStream());
String  str=(String)dis.readUTF();
System.out.println("message= "+str);
ss.close();*/
        }catch(Exception e){System.out.println(e);}
    }
}