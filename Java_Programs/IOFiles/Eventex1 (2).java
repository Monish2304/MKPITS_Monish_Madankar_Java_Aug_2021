//package com.mkpits.java.awtexample;
import java.awt.*;
import java.awt.event.*;
public class Eventex1 extends  Frame implements  ActionListener {
    TextField tf;
    Button b1,b2;
    Eventex1() {
        tf=new TextField();
        tf.setBounds(100,50,200,50);
         b1=new Button("click me");
        b1.setBounds(50,150,100,50);
        b1.addActionListener(this);
        b2=new Button("clear");
        b2.setBounds(200,150,100,50);
        b2.addActionListener(this);
        add(tf);
        add(b1);
        add(b2);
        setTitle("event example");
        setLayout(null);
        setSize(400,300);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae) {

        if(ae.getSource() == b1) {
            tf.setText("Amit");
        }
        if(ae.getSource() == b2) {
            tf.setText("");
        }
    }

    public static void main(String[] arg) {
        Eventex1 e1=new Eventex1();

    }
}
