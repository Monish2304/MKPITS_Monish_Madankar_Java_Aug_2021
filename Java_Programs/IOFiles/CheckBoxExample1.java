import java.awt.*;

import java.awt.event.*;

public class CheckBoxExample1 {

	CheckBoxExample1() {

		Frame f=new Frame("CheckBox Example 1");

		final Label l=new Label();

              l.setAlignment(Label.CENTER);

		l.setSize(400,100);

		Checkbox cb1=new Checkbox("C++");

		f.setBounds(100,100,50,50);

		f.add(cb1);

		Checkbox cb2=new Checkbox("Java");

		f.setBounds(100,150,50,50);

		f.add(cb2);

		f.add(l);

	cb1.addItemListener(new ItemListener() {

		public void itemStateChanged(ItemEvent e) {

			l.setText("C++ CheckBox: " + (e.getStateChange()==1?"Checked":"Unhecked"));
		}
	});

		cb2.addItemListener(new ItemListener() {

				public void itemStateChanged(ItemEvent e) {

					l.setText("Java CheckBox: " + (e.getStateChange()==1?"Checked":"Unhecked"));
				}
			});

		f.setSize(400,400);

		f.setLayout(null);

		f.setVisible(true);
	}

	public static void main(String []args) {

		new CheckBoxExample();
	}
}