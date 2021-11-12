//example of login form

import java.awt.event.*;

import javax.swing.*;

class LoginForm extends JFrame {

	JLabel l1,l2,l3;

	JTextField tf;

	JPasswordField p;

	JButton b;

	LoginForm() {

		l1=new JLabel("UserName : ");

		l1.setBounds(30,50,80,30);

		add(l1);

		tf=new JTextField();

		tf.setBounds(110,50,150,30);

		add(tf);

		l2=new JLabel("Password : ");

		l2.setBounds(30,120,80,30);

		add(l2);

		p=new JPasswordField();

		p.setBounds(110,120,150,30);

		add(p);

		b=new JButton("Login");

		b.setBounds(120,180,100,30);

		b.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent ae) {

				if(tf.getText().equals("Admin") && p.getText().equals("Admin")) {

					l3.setText("Login Successful");
				}

				else {

					l3.setText("Invalid Credentials");
				}
			}
		});

		add(b);

		l3=new JLabel("Status : ");

		l3.setBounds(30,250,200,30);

		add(l3);

		setSize(500,500);

		setLayout(null);

		setVisible(true);
	}

	public static void main(String []args) {

		LoginForm lf=new LoginForm();
	}
}