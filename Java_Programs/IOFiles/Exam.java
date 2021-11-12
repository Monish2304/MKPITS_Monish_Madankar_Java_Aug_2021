import java.awt.*;

import java.awt.event.*;

class Exam extends Frame {

	Checkbox c1,c2;

	CheckboxGroup cbg1;

	Label l1,l2;

	Button b1;

	Exam() {

		l1=new Label("Select Gender");

		c1=new Checkbox("Male",cbg1,true);

		c1.setBounds(100,100,100,20);

		add(c1);

		c2=new Checkbox("Female",cbg1,false);

		c2.setBounds(200,100,100,20);

		add(c2);

		b1=new Button("ok");

		b1.setBounds(100,150,100,20);

		b1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent ae) {

				if(c1.getState()==true) {

					l2.setText("Gender selected : Male");
				}

				else if(c2.getState()==true) {

					l2.setText("Gender selected : Female");
				}
			}
		});

		add(b1);

		l2=new Label("Info");

		l2.setBounds(10,200,200,50);

		add(l2);

		setSize(400,400);

		setLayout(null);

		setVisible(true);
	}

	public static void main(String []args) {

		Exam e1=new Exam();
	}
}