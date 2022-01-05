package Networking;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

class ChatClientFrame extends JFrame {
    ChatClientFrame(){
        JLabel l1;
        JTextField t1;
        JButton b1;

        l1=new JLabel("Client ");
        l1.setBounds(20,20,100,30);
        add(l1);

        t1=new JTextField();
        t1.setBounds(10,20,460,420);
        add(t1);

        b1=new JButton("Send");
        b1.setBounds(380,380,70,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Socket s= null;
                try {
                    s = new Socket("localhost",4545);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                System.out.println("Client is sending request and waiting for server to connect...");

                for(;;){
                    DataInputStream dis=new DataInputStream(System.in);
                    String str= null;
                    try {
                        str = dis.readLine();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    PrintStream ps= null;
                    try {
                        ps = new PrintStream(s.getOutputStream());
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    ps.println(str);

                    DataInputStream dis1= null;
                    try {
                        dis1 = new DataInputStream(s.getInputStream());
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    try {
                        String str1=dis1.readLine();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    System.out.println("Server : "+str);

                /*if(str.equals("bye")){
                    System.exit(0);
                }*/
                }
            }
        });
        t1.add(b1);

        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        ChatClientFrame f=new ChatClientFrame();
    }
}
