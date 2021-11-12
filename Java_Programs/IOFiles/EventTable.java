//wap to accept a no. and print table of that number.

import java.awt.*;

import java.awt.event.*;

class EventTable extends Frame implements ActionListener {

	Label l1,l2;

	TextField t1,t2;

	Button b1;

	EventTable() {

		setTitle("Table");

		l1=new Label("Enter Number : ");

		l1.setBounds(25,50,100,50);

		add(l1);

		t1=new TextField();

		t1.setBounds(150,60,80,30);

		add(t1);

		b1=new Button("Calculate");

		b1.setBounds(150,120,80,30);

		add(b1);

		l2=new Label("Table : ");

		l2.setBounds(60,160,150,50);

		b1.addActionListener(this);

		add(l2);

		t2=new TextField();

		t2.setBounds(80,220,180,250);

		add(t2);

		setLayout(null);

		setSize(500,500);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {

		int num=Integer.parseInt(t1.getText());

		int res=1;

		StringBuilder sb=new StringBuilder();

		if(ae.getSource()==b1) {

			for(int i=1;i<=10;i++) {

				res=num*i;

				sb.append(num + "  *  " +i+ "   =   " +res+ "\n");
			}

			t2.setText(sb.toString());
		}
	}

	public static void main(String []args) {

		EventTable f=new EventTable();
	}
}