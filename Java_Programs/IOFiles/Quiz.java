import java.awt.*;

import java.awt.event.*;

class Quiz extends Frame {

	Checkbox c1,c2,c3,c4,c5,c6;

	CheckboxGroup cbg1,cbg2;

	Label l1,l2,l3,l4;

	Button b1;

	Quiz() {

		l1=new Label("1.  Capital of India ?");

		l1.setBounds(30,30,200,50);

		add(l1);

		cbg1=new CheckboxGroup();

		c1=new Checkbox("Mumbai",cbg1,false);

		c1.setBounds(50,100,100,20);

		add(c1);

		c2=new Checkbox("Delhi",cbg1,true);

		c2.setBounds(180,100,100,20);

		add(c2);

		l2=new Label("2.  Capital of Maharashtra ?");

		l2.setBounds(30,150,200,50);

		add(l2);

		cbg2=new CheckboxGroup();

		c3=new Checkbox("Mumbai",cbg2,true);

		c3.setBounds(50,220,100,20);

		add(c3);

		c4=new Checkbox("Nagpur",cbg2,false);

		c4.setBounds(180,220,100,20);

		add(c4);

		b1=new Button("Result");

		b1.setBounds(180,330,100,30);

		b1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent ae) {

				int total=0;

				if(c2.getState()==true) {

					total=total+1;
				}

				if(c3.getState()==true) {

					total=total+1;
				}

				l2.setText("Score out of 2 is : " + total);
			}
		});

		add(b1);

		l2=new Label("Score : ");

		l2.setBounds(50,380,200,50);

		add(l2);

		setSize(500,500);

		setLayout(null);

		setVisible(true);
	}

	public static void main(String []args) {

		Quiz q1=new Quiz();
	}
}