package Networking;

import com.sun.deploy.panel.JSmartTextArea;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

import java.net.Socket;

class ChatClientFrame extends JFrame {
    ChatClientFrame() {

        JTextArea a1;
        JTextField t1;
        JToggleButton tg1;

        a1=new JTextArea("Client");
        a1.setBounds(10,10,460,40);
        add(a1);


        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) throws IOException {

        ChatClientFrame f=new ChatClientFrame();

        Socket s = new Socket("localhost", 5010);
        System.out.println("Client is sending request to join and waiting for server to connect...");

        /*for (; ; ) {
            DataInputStream dis = new DataInputStream(System.in);
            String str = dis.readLine();
            PrintStream ps = new PrintStream(s.getOutputStream());
            ps.println(str);

            DataInputStream dis1 = new DataInputStream(s.getInputStream());
            String str1 = dis1.readLine();
            System.out.println("Server : " + str1);
        }*/

    }
}