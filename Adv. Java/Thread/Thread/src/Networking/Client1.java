package Networking;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Client1 {
    public static void main(String[] args) throws IOException {
        Socket sob=new Socket("localhost",8000);
    }
}
