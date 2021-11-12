import javax.swing.*;

import java.awt.event.*;

class ComboBoxEx {

	JFrame f=new JFrame("ComboBoxExample");

	ComboBoxEx() {

		final JLabel l=new JLabel();

		l.setHorizontalAlignment(JLabel.CENTER);

		l.setSize(400,100);

		f.add(l);

		JButton b=new JButton("Show");

		b.setBounds(200,100,75,20);

		f.add(b);

		String languages[]={"C","C++","C#","Java","PHP"};

		final JComboBox cb=new JComboBox(languages);

		cb.setBounds(50,100,90,30);

		f.add(cb);

		f.setSize(500,300);

		f.setLayout(null);

		f.setVisible(true);

		b.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String data="Programming Language Selected : " + cb.getItemAt(cb.getSelectedIndex());

				l.setText(data);
			}
		});
	}

	public static void main(String []args) {

		new ComboBoxEx();
	}
}