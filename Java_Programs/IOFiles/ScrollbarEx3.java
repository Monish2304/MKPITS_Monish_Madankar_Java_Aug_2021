import java.awt.*;

import java.awt.event.*;

class ScrollbarEx3 {

	ScrollbarEx3() {

		Frame f=new Frame("Scrollbar Example");

		final Label l=new Label();

		l.setAlignment(Label.CENTER);

		l.setSize(400,100);

		final Scrollbar s=new Scrollbar();

		s.setOrientation(0);

		s.setBounds(10,100,250,20);

		f.add(s);

		f.add(l);

		f.setSize(400,400);

		f.setLayout(null);

		f.setVisible(true);

		s.addAdjustmentListener(new AdjustmentListener() {

			public void adjustmentValueChanged(AdjustmentEvent e) {

				l.setText("Vertical Scrollbar Value is: " + s.getValue());
			}
		});
	}

	public static void main(String []args) {

		new ScrollbarEx3();
	}
}