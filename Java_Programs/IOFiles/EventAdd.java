import java.awt.*;

import java.awt.event.*;

class EventAdd extends Frame implements ActionListener {

	Label l1,l2,l3;

	TextField t1,t2,t3;

	Button b1;

	EventAdd() {

		l1=new Label("Num 1 : ");

		l1.setBounds(25,50,100,50);

		add(l1);

		t1=new TextField();

		t1.setBounds(150,50,150,30);

		add(t1);

		l2=new Label("Num 2 : ");

		l2.setBounds(25,100,100,50);

		add(l2);

		t2=new TextField();

		t2.setBounds(150,100,150,30);

		add(t2);

		l3=new Label("Addition : ");

		l3.setBounds(25,150,100,50);

		add(l3);

		t3=new TextField();

		t3.setBounds(150,150,150,30);

		add(t3);

		b1=new Button("Calculate");

		b1.setBounds(130,220,100,30);

		b1.addActionListener(this);

		add(b1);

		setLayout(null);

		setSize(400,400);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {

		int num1=Integer.parseInt(t1.getText());

		int num2=Integer.parseInt(t2.getText());

		int add=num1+num2;

		t3.setText(""+add);
	}

	public static void main(String []args) {

		EventAdd e=new EventAdd();
	}
}