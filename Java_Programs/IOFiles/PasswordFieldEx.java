import java.awt.event.*;

import javax.swing.*;

public class PasswordFieldEx {

	public static void main(String []args) {

		JFrame f=new JFrame("Password Field Example");

		final JLabel l=new JLabel();

		l.setBounds(20,150,200,50);

		f.add(l);

		final JPasswordField value=new JPasswordField();

		value.setBounds(100,75,200,30);

		f.add(value);

		JLabel l1=new JLabel("Username");

		l1.setBounds(20,20,80,30);

		f.add(l1);

		JLabel l2=new JLabel("Password");

		l2.setBounds(20,75,80,30);

		f.add(l2);

		JButton b=new JButton("Login");

		b.setBounds(100,130,80,30);

		f.add(b);

		final JTextField tf=new JTextField();

		tf.setBounds(100,20,200,30);

		f.add(tf);

		f.setSize(400,400);

		f.setLayout(null);

		f.setVisible(true);

		b.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String data="Username " +tf.getText();

				data+="  Password : " + new String(value.getPassword());

				l.setText(data);
			}
		});

	}
}