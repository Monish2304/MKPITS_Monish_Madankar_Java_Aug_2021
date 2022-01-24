package Networking;

import com.sun.deploy.panel.JSmartTextArea;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

import java.net.ServerSocket;
import java.net.Socket;

public class ChatServerFrame extends JFrame {
    ChatServerFrame() {

        JTextArea a1;
        JTextField t1;
        JToggleButton tg1;

        a1=new JTextArea("Server");
        a1.setBounds(10,10,460,460);
        add(a1);

        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }

    public static void main (String[]args) throws IOException {

        ChatServerFrame f=new ChatServerFrame();

        ServerSocket ss = new ServerSocket(5010);
        System.out.println("Server sending Request to Client ...");
        Socket s = ss.accept();
        System.out.println("Server and Client are conneted .");

        /*for (; ; ) {
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = dis.readLine();
            System.out.println("Client : " + str);

            PrintStream ps = new PrintStream(s.getOutputStream());
            DataInputStream dis1 = new DataInputStream(System.in);
            String str1 = dis1.readLine();
            ps.println(str1);
        }*/
    }
}