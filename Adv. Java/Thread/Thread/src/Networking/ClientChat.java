package Networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

public class ClientChat {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("localhost",6000);
        System.out.println("Client is sending request and waiting for server to connect...");

        for(;;){
            DataInputStream dis=new DataInputStream(System.in);
            String str= dis.readLine();
            PrintStream ps=new PrintStream(s.getOutputStream());
            ps.println(str);

            DataInputStream dis1=new DataInputStream(s.getInputStream());
            String str1=dis1.readLine();
            System.out.println("Server : "+str);

                /*if(str.equals("bye")){
                    System.exit(0);
                }*/
            }
        }
    }
