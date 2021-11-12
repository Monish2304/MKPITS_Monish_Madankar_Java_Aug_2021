//example of checkbox to do additon and substraction of 2 no.

import java.awt.*;

import java.awt.event.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.event.ItemEvent;

import java.awt.event.ItemListener;

public class TextAreaEx {

	TextAreaEx() {

		Frame f=new Frame("CheckBox Example");

		Label l=new Label();

		l.setBounds(100,200,300,20);

		f.add(l);

		Label l1=new Label();

		l1.setBounds(100,250,300,20);

		f.add(l1);

		TextField t1=new TextField();

		t1.setBounds(50,50,100,30);

		f.add(t1);

		TextField t2=new TextField();

		t2.setBounds(180,50,100,30);

		f.add(t2);

		Checkbox cb1=new Checkbox("Add");

		cb1.setBounds(130,100,50,50);

		f.add(cb1);

		Checkbox cb2=new Checkbox("Subtract",true);

		cb2.setBounds(130,140,100,50);

		f.add(cb2);

		Button b1=new Button("Result");

		b1.setBounds(100,220,100,30);

		b1.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {

			l.setText("");

			l1.setText("");

			int n1=Integer.parseInt(t1.getText());

			int n2=Integer.parseInt(t2.getText());

			int res=0;

			StringBuilder sb=new StringBuilder();

			if(cb1.getState()==true) {

				res=n1+n2;

				sb.append("add = " + res);
			}

			if(cb2.getState()==true) {

							res=n1-n2;

							sb.append("sub = " + res);
						}

			l.setText(sb.toString());
	}
});
			f.add(b1);

			f.setSize(400,400);

			f.setLayout(null);

			f.setVisible(true);
		}

		public static void main(String []args) {

			TextAreaEx t=new TextAreaEx();
		}
	}