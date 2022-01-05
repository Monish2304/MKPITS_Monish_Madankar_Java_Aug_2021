package Networking;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerChat {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(6000);
        System.out.println("Sending Request to Client over port 6000 ...");
        Socket s=ss.accept();
        System.out.println("Server and Client are conneted over port 6000.");

       for(;;){
           DataInputStream dis=new DataInputStream(s.getInputStream());
           String str=dis.readLine();
           System.out.println("Client : "+str);

           PrintStream ps=new PrintStream(s.getOutputStream());
           DataInputStream dis1=new DataInputStream(System.in);
           String str1=dis1.readLine();
           ps.println(str1);


          /* if(str1.equals("bte")){
               System.exit(0);
           }*/
       }
    }
}

