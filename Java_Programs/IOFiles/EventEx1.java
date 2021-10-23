import java.awt.*;

import java.awt.event.*;

class EventEx1 extends Frame implements ActionListener {

	EventEx1() {

		Button b1=new Button("ok");

		b1.setBounds(100,150,100,50);

		b1.addActionListener(this);

		add(b1);

		setLayout(null);

		setSize(300,300);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {

		System.out.println("Hello Java");
	}

	public static void main(String []args) {

		EventEx1 f=new EventEx1();
	}
}