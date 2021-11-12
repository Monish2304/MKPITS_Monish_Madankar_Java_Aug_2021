import java.awt.event.*;

import javax.swing.*;

public class PasswordFieldEx {

	public static void main(String []args) {

		JFrame f=new JFrame("Password Field Example");

		final JLabel l=new JLabel();

		l.setBounds(20,150,200,50);

		f.add(l);

		f.setSize(400,400);

		f.setLayout(null);

		f.setVisible(true);
	}
}