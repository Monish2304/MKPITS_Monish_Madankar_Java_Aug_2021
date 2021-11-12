//wap to accept 2 no. and create buttons for addtion, substraction and multiplication.

import java.awt.*;

import java.awt.event.*;

class EventMultiButtons extends Frame implements ActionListener {

	Label l1,l2,l3;

	TextField t1,t2,t3;

	Button b1,b2,b3;

	EventMultiButtons() {

		l1=new Label("Enter Num 1 : ");

		l1.setBounds(25,50,100,50);

		add(l1);

		t1=new TextField();

		t1.setBounds(150,60,150,30);

		add(t1);

		l2=new Label("Enter Num 2 : ");

		l2.setBounds(25,130,100,50);

		add(l2);

		t2=new TextField();

		t2.setBounds(150,140,150,30);

		add(t2);

		l3=new Label("Result : ");

		l3.setBounds(25,200,100,50);

		add(l3);

		t3=new TextField();

		t3.setBounds(150,210,150,30);

		add(t3);

		b1=new Button("Add");

		b1.setBounds(40,320,70,40);

		b1.addActionListener(this);

		add(b1);

		b2=new Button("Sub");

		b2.setBounds(180,320,70,40);

		b2.addActionListener(this);

		add(b2);

		b3=new Button("Mul");

		b3.setBounds(320,320,70,40);

		b3.addActionListener(this);

		add(b3);

		setLayout(null);

		setSize(500,500);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {

		int num1=Integer.parseInt(t1.getText());

		int num2=Integer.parseInt(t2.getText());

		int res=0;

		if(ae.getSource()==b1) {

			res=num1+num2;
		}

		if(ae.getSource()==b2) {

			res=num1-num2;
		}

		if(ae.getSource()==b3) {

			res=num1*num2;
		}

		t3.setText("" + res);
	}

	public static void main(String []args) {

		EventMultiButtons f=new EventMultiButtons();
	}
}