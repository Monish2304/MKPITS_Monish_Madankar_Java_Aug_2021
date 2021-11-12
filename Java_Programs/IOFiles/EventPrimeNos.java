//wap to accept a num and print whether it is prime no. or not.

import java.awt.*;

import java.awt.event.*;

class EventPrimeNos extends Frame implements  ActionListener {

	Label l1,l2;

	TextField t1;

	Button b1;

	EventPrimeNos() {

		l1=new Label("Enter Number : ");

		l1.setBounds(25,80,100,50);

		add(l1);

		t1=new TextField();

		t1.setBounds(150,90,150,30);

		add(t1);

		b1=new Button("Calculate");

		b1.setBounds(150,180,80,40);

		b1.addActionListener(this);

		add(b1);

		l2=new Label("Ans : ");

		l2.setBounds(25,250,150,50);

		add(l2);

		setTitle("Prime Nos or Not");

		setLayout(null);

		setSize(400,400);

		setVisible(true);
	}

public void actionPerformed(ActionEvent ae) {

	int num1=Integer.parseInt(t1.getText());

	int num=0,i;

	String ans;

	if(ae.getSource()==b1) {

		for(i=2;i<num;i++) {

				if(num%i==0) {

					ans=("It is a not a prime number");

					l2.setText("It is a not a prime number" + ans);

					break;
				}
			}

			if(i==num) {

				ans=("It is a prime number");

				l2.setText("it is a prime number" + ans);
			}
		}
	}

public static void main(String []args) {

	EventPrimeNos f=new EventPrimeNos();
}
}