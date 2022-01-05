package Networking;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServerFrame extends JFrame {
    ChatServerFrame(){
        JLabel l1;
        JTextField t1;
        JButton b1;

        l1=new JLabel("Server ");
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
                ServerSocket ss= null;
                try {
                    ss = new ServerSocket(4545);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                System.out.println("Sending Request to Client over port 4545 ...");
                Socket s= null;
                try {
                    s = ss.accept();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                System.out.println("Server and Client are conneted over port 4545.");

                for(;;){
                    DataInputStream dis= null;
                    try {
                        dis = new DataInputStream(s.getInputStream());
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    String str= null;
                    try {
                        str = dis.readLine();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    System.out.println("Client : "+str);

                    PrintStream ps= null;
                    try {
                        ps = new PrintStream(s.getOutputStream());
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    DataInputStream dis1=new DataInputStream(System.in);
                    String str1= null;
                    try {
                        str1 = dis1.readLine();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    ps.println(str1);


          /* if(str1.equals("bte")){
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
        ChatServerFrame f=new ChatServerFrame();
    }
}
