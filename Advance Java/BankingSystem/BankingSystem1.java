import javax.swing.*;
import java.awt.event.*;
import java.awt.event.*;
public class BankingSystem1 extends JFrame{
    BankingSystem1() {
        JLabel l1,l2,l3,l4;
        JTextField t1;
        JPasswordField p1;
        JButton b1;

        l1=new JLabel("Banking System");
        l1.setBounds(80,10,100,100);
        add(l1);

        l2=new JLabel("UserName : ");
        l2.setBounds(20,60,70,120);
        add(l2);

        t1=new JTextField();
        t1.setBounds(100,100,150,30);
        add(t1);

        l3=new JLabel("Password : ");
        l3.setBounds(20,110,70,120);
        add(l3);

        p1=new JPasswordField();
        p1.setBounds(100,150,150,30);
        add(p1);

        l4=new JLabel("Status : ");
        l4.setBounds(20,250,150,30);
        add(l4);

        b1=new JButton("Login");
        b1.setBounds(100,200,80,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (t1.getText().equals("admin") && p1.getText().equals("admin")) {
                    l4.setText("Login Successfully");
                } else {
                    l4.setText("Invalid Credentials");
                }
            }

        });
        add(b1);

        setLayout(null);
        setSize(400,400);
        setVisible(true);
    }

    public static void main(String []args){
        BankingSystem1 bs=new BankingSystem1();
    }
}
