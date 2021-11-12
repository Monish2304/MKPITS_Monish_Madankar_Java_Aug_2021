import java.awt.*;

import java.awt.event.*;

class ListEx1 {

	ListEx1() {

		Frame f=new Frame();

		final Label l=new Label();

		l.setAlignment(Label.CENTER);

		l.setSize(500,100);

		f.add(l);

		Button b=new Button("Show");

		b.setBounds(200,150,80,30);

		final List l1=new List(4,false);

		l1.setBounds(100,100,70,70);

		l1.add("C");

		l1.add("C++");

		l1.add("Java");

		l1.add("PHP");

		f.add(l1);

		final List l2=new List(4,true);

		l2.setBounds(100,200,80,70);

		l2.add("Turbo C++");

		l2.add("Spring");

		l2.add("Hibernate");

		l2.add("Code Igniter");

		f.add(l2);

		f.add(b);

		f.setSize(500,500);

		f.setLayout(null);

		f.setVisible(true);

		b.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent ae) {

						String data="Programming language selected : " + l1.getItem(l1.getSelectedIndex());

						data +=" , Framework selected : ";

						for(String frame:l2.getSelectedItems()) {

							data +=frame + " ";
						}

						l.setText(data);
					}
				});
	}

	public static void main(String []args) {

		new ListEx1();
	}
}