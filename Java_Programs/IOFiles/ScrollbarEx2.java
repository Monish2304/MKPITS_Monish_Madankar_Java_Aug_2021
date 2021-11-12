import java.awt.*;

import java.awt.event.*;

class ScrollbarEx2 {

	ScrollbarEx2() {

		Frame f=new Frame("Scrollbar Example");

		final Label l=new Label();

		l.setAlignment(Label.CENTER);

		l.setSize(400,100);

		Scrollbar s=new Scrollbar();

		s.setBounds(100,100,50,100);

		f.add(s);

		f.add(l);

		f.setSize(500,500);

		f.setLayout(null);

		f.setVisible(true);

		s.addAdjustmentListener(new AdjustmentListener() {

			public void adjustmentValueChanged(AdjustmentEvent ae) {

				l.setText("Verticle Scrollbar value is : " + s.getValue());
			}
		});
	}

	public static void main(String []args) {

		new ScrollbarEx2();
	}
}