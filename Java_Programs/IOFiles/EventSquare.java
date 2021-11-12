//wap to accept a number and print square of the number.

import java.awt.*;

import java.awt.event.*;

class EventSquare extends Frame implements ActionListener {

		Label l1,l2;

		TextField t1,t2;

		Button b1;

		EventSquare() {

			l1=new Label("Number : ");

			l1.setBounds(30,50,100,50);

			add(l1);

			t1=new TextField();

			t1.setBounds(150,60,100,30);

			add(t1);

			l2=new Label("Square : ");

			l2.setBounds(30,100,100,50);

			add(l2);

			t2=new TextField();

			t2.setBounds(150,110,100,30);

			add(t2);

			b1=new Button("Calculate");

			b1.setBounds(150,200,100,50);

			b1.addActionListener(this);

			add(b1);

			setLayout(null);

			setSize(400,400);

			setVisible(true);
		}

		public void actionPerformed(ActionEvent ae) {

			int num1=Integer.parseInt(t1.getText());

			int res=num1*num1;

			t2.setText("" + res);
		}

		public static void main(String []args) {

			EventSquare f=new EventSquare();
		}
	}