import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class userform  extends  JFrame
{
    JLabel l1,l2,l3,l4,l5;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2,b3,b4;
    userform(){
        l1=new JLabel("user_name : ");
        l1.setBounds(20,20,100,50);
        add(l1);
        t1=new JTextField();
        t1.setBounds(120,30,150,30);
        add(t1);

        l2=new JLabel("password : ");
        l2.setBounds(20,80,100,50);
        add(l2);
        t2=new JPasswordField();
        t2.setBounds(120,90,150,30);
        add(t2);

        b1=new JButton("Save");
        b1.setBounds(20,150,80,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");
                    String qr="insert into user(user_name,password) values(?,?) ";

                    PreparedStatement stmt=con.prepareStatement(qr);
                    stmt.setString(1,t1.getText());
                    stmt.setString(2,t2.getText());
                    int r=stmt.executeUpdate();
                    con.close();
                    l3.setText("Record Saved");
                }catch(Exception ee){
                    System.out.println(ee.toString());
                }
            }
        });
        add(b1);

        b2=new JButton("Update");
        b2.setBounds(110,150,80,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");
                    PreparedStatement stmt=con.prepareStatement("update user set pwd1=? where user_name=?");
                    String u=t1.getText();
                    String p=t2.getText();
                    stmt.setString(1,p);
                    stmt.setString(2,u);
                    int i=stmt.executeUpdate();
                    System.out.println(i+" Records Updated");
                }catch(Exception ee){
                    System.out.println(ee.toString());
                }
            }
        });
        add(b2);

        b3=new JButton("delete");
        b3.setBounds(200,150,80,30);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");
                    PreparedStatement stmt=con.prepareStatement("delete from user  where user_name=?");
                    String u=t1.getText();
                    stmt.setString(1,u);

                    int i=stmt.executeUpdate();
                    System.out.println(i+" Records Deleted");
                }catch(Exception ee){
                    System.out.println(ee.toString());
                }
            }
        });
        add(b3);

        b4=new JButton("search");
        b4.setBounds(290,150,80,30);

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");
                    PreparedStatement stmt=con.prepareStatement("select * from user  where user_name=?");
                    String u=t1.getText();
                    stmt.setString(1,u);//1 specifies the first parameter in the query i.e. name
                    ResultSet rs= stmt.executeQuery();
                    int flag=0;
                    while(rs.next())
                    {
                        l3.setText("");
                        flag=1;
                        t2.setText(rs.getString(3));
                    }
                    if(flag==0)
                    {
                        t2.setText("");
                        l3.setText("No Record Found");
                    }
                    con.close();
                }catch(Exception ee){
                    System.out.println(ee.toString());
                }
            }
        });
        add(b4);

        l3=new JLabel("Status ");
        l3.setBounds(20,200,250,30);
        add(l3);

        setLayout(null);
        setSize(450,300);
        setVisible((true));
    }
    public static void main(String[] arg){
        userform u1=new userform();
    }
}
