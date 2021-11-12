import javax.swing.*;

import java.awt.event.*;

class RadioButtonEx extends JFrame implements ActionListener {

	JRadioButton rb1,rb2;

	JButton b;

	RadioButtonEx() {

		rb1=new JRadioButton("Male");

		rb1.setBounds(100,50,100,30);

		add(rb1);

		rb2=new JRadioButton("Female");

		rb2.setBounds(100,100,100,30);

		add(rb2);ButtonGroup bg=new ButtonGroup();

		bg.add(rb1);

		bg.add(rb2);

		b=new JButton("click");

		b.setBounds(100,150,80,30);

		b.addActionListener(this);

		add(b);

		setSize(300,300);

		setLayout(null);

		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {

		if(rb1.isSelected()) {

			JOptionPane.showMessageDialog(this,"This is Male candidate");
		}

		if(rb2.isSelected()) {

			JOptionPane.showMessageDialog(this,"This is Female candidate");
		}
	}

	public static void main(String []args) {

		new RadioButtonEx();
	}
}