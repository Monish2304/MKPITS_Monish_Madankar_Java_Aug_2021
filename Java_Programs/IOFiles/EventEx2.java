import java.awt.*;

import java.awt.event.*;

class EventEx2 extends Frame implements ActionListener {

	Label l1,l2;

	TextField t1,t2;

	Button b1;

	EventEx2() {

			l1=new Label("Enter Number : ");

			l1.setBounds(20,50,100,25);

			add(l1);

			t1=new TextField();

			t1.setBounds(130,50,100,25);

			add(t1);

			l2=new Label("Square : ");

			l2.setBounds(20,100,100,25);

			add(l2);

			t2=new TextField();

			t2.setBounds(130,100,100,25);

			add(t2);

			b1=new Button("Calculate");

			b1.setBounds(120,180,80,30);

			b1.addActionListener(this);

			add(b1);

			setLayout(null);

			setSize(300,300);

			setVisible(true);
		}

		public void actionPerformed(ActionEvent ae) {

			int num1=Integer.parseInt(t1.getText());

			int sq=num1*num1;

			t2.setText(""+sq);
		}

		public static void main(String []args) {

			EventEx2 fr=new EventEx2();
		}
	}