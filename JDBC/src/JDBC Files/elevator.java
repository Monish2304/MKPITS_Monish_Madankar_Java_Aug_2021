import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class elevator extends JFrame{
    JLabel l1;
    JToggleButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    elevator(){
        b1=new JToggleButton("1");
        b1.setBounds(360,20,80,80);
        add(b1);

        b2=new JToggleButton("2");
        b2.setBounds(480,20,80,80);
        add(b2);

        setSize(600,700);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String []args){
        elevator f=new elevator();
    }
}