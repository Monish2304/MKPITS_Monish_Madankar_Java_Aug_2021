//wap to accept a number and print factorial of number

import java.awt.*;

import java.awt.event.*;

class EventFactorial extends Frame implements ActionListener {

	Label l1,l2;

	TextField t1;

	Button b1;

	EventFactorial () {

		setTitle("Factorial");

		l1=new Label("Enter Number : ");

		l1.setBounds(25,80,100,50);

		add(l1);

		t1=new TextField();

		t1.setBounds(150,90,100,30);

		add(t1);

		l2=new Label("Factorial : ");

		l2.setBounds(25,160,300,50);

		add(l2);

		b1=new Button("Calculate");

		b1.setBounds(130,230,100,40);

		b1.addActionListener(this);

		add(b1);

		setLayout(null);

		setSize(400,400);

		setVisible(true);
	}

	public void actionPerformed (ActionEvent ae) {

		int num=Integer.parseInt(t1.getText());

		int fact=1,i;

		if(ae.getSource()==b1) {

			for(i=num;i>0;i--) {

			fact=fact*i;
		}
	}

	l2.setText("Factorial : " + fact);
}

	public static void main(String []args) {

		EventFactorial f=new EventFactorial();
	}
}