import javax.swing.*;

import java.awt.event.*;

class SwingEx1 {

	public static void main(String []args) {

		JFrame f=new JFrame();

		JButton b=new JButton("Save");

		b.setBounds(100,100,100,40);

		f.add(b);

		b.addActionListener(new ActionListener () {

			public void actionPerformed(ActionEvent ae) {

				System.out.println("Hello from save button");
			}
		});

		f.add(b);

		f.setSize(300,300);

		f.setLayout(null);

		f.setVisible(true);
	}
}