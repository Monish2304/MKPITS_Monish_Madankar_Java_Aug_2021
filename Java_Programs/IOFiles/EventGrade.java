//wap to accept 3 subject marks and display total, percentage and grade;

import java.awt.*;

import java.awt.event.*;

class EventGrade extends Frame implements ActionListener {

	Label l1,l2,l3,l4,l5,l6;

	TextField t1,t2,t3;

	Button b1;

	EventGrade() {

		l1=new Label("Sub 1 Marks : ");

		l1.setBounds(25,50,100,50);

		add(l1);

		t1=new TextField();

		t1.setBounds(150,50,100,30);

		add(t1);

		l2=new Label("Sub 2 Marks : ");

		l2.setBounds(25,100,100,50);

		add(l2);

		t2=new TextField();

		t2.setBounds(150,100,100,30);

		add(t2);

		l3=new Label("Sub 3 Marks : ");

		l3.setBounds(25,150,100,50);

		add(l3);

		t3=new TextField();

		t3.setBounds(150,150,100,30);

		add(t3);

		b1=new Button("Calculate");

		b1.setBounds(150,230,100,40);

		b1.addActionListener(this);

		add(b1);

		l4=new Label("Total Marks : ");

		l4.setBounds(25,300,100,50);

		add(l4);

		l5=new Label("Percentage : ");

		l5.setBounds(25,350,150,50);

		add(l5);

		l6=new Label("Grade : ");

		l6.setBounds(25,400,150,50);

		add(l6);

		setLayout(null);

		setSize(500,500);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {

		int num1=Integer.parseInt(t1.getText());

		int num2=Integer.parseInt(t2.getText());

		int num3=Integer.parseInt(t3.getText());

		int total=0;

		float per=0;

		String Grade=null;

		if(ae.getSource()==b1) {

			total=num1+num2+num3;

			per=(float)(total/300.0f)*100.0f;

			if(per>75) {

				Grade="Distinction";

			}else if(per>5 && per<60) {

				Grade="First";

		}else {

			Grade="Fail";
		}
	}

	l4.setText("Total Marks :" + total);

	l5.setText("Percentage : " + per);

	l6.setText("Grade : " + Grade);
}

	public static void main(String []args) {

		EventGrade f=new EventGrade();
	}
}