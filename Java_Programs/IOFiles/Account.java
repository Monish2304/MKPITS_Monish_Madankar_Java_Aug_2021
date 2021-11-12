import java.awt.*;

import java.awt.event.*;

class Account extends Frame {

	Label l1,l2,l3;

	TextField t1,t2;

	Checkbox c1,c2;

	CheckboxGroup cbg1;

	Button b1;

	Account() {

		l1=new Label("Enter Acount No : ");

		l1.setBounds(30,100,100,40);

		add(l1);

		t1=new TextField();

		t1.setBounds(150,100,150,30);

		add(t1);

		l2=new Label("Enter Amount : ");

		l2.setBounds(40,180,100,40);

		add(l2);

		t2=new TextField();

		t2.setBounds(150,180,150,30);

		add(t2);

		cbg1=new CheckboxGroup();

		c1=new Checkbox("Deposit",cbg1,true);

		c1.setBounds(100,250,100,50);

		add(c1);

		c2=new Checkbox("Withdrawl",cbg1,false);

		c2.setBounds(200,250,100,50);

		add(c2);

		b1=new Button("Ok");

		b1.setBounds(150,330,100,40);

		b1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent ae) {

				int bal=5000;

				int amt=Integer.parseInt(t2.getText());

				StringBuilder sb=new StringBuilder();

				if(c1.getState()==true) {

					bal=bal+amt;
				}

				if(c2.getState()==true) {

					bal=bal-amt;
				}

				l3.setText("Available Balance : " + bal);
			}
		});

		add(b1);

		l3=new Label("Balance : ");

		l3.setBounds(40,400,150,50);

		add(l3);

		setSize(500,500);

		setLayout(null);

		setVisible(true);
	}

	public static void main(String []args) {

		Account a=new Account();
	}
}