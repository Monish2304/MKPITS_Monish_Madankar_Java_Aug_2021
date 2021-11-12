import java.awt.event.*;

import javax.swing.*;

public class ButtonEx {

	public static void main(String []args) {

		JFrame f=new JFrame("Button Example");

		final JTextField tf=new JTextField();

		tf.setBounds(50,50,200,30);

		f.add(tf);

		JButton b=new JButton("Click Here");

		b.setBounds(100,150,100,30);

		b.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent ae) {

				tf.setText("Wel-Come to the world of JAVA");
			}
		});

		f.add(b);

		f.setSize(400,400);

		f.setLayout(null);

		f.setVisible(true);
	}
}