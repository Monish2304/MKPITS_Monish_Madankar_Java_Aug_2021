import javax.swing.*;

import java.awt.event.*;

class CheckBoxExample2 {

	CheckBoxExample2() {

		JFrame f=new JFrame("CheckBox Example");

		final JLabel l=new JLabel();

		l.setHorizontalAlignment(JLabel.CENTER);

		l.setSize(400,100);

		f.add(l);

		JCheckBox c1=new JCheckBox("C++");

		c1.setBounds(150,100,150,50);

		f.add(c1);

		JCheckBox c2=new JCheckBox("Java");

		c2.setBounds(150,150,150,50);

		f.add(c2);

		c1.addItemListener(new ItemListener() {

			public void itemStateChanged(ItemEvent e) {

				l.setText("C++ CheckBox : " + (e.getStateChange()==1?"Checked":"UnChecked"));
			}
		});

		c2.addItemListener(new ItemListener() {

			public void itemStateChanged(ItemEvent e) {

				l.setText("Java CheckBox : " + (e.getStateChange()==1?"Checked":"UnChecked"));
			}
		});

		f.setSize(500,500);

		f.setLayout(null);

		f.setVisible(true);
	}

	public static void main(String []args) {

		new CheckBoxExample2();
	}
}