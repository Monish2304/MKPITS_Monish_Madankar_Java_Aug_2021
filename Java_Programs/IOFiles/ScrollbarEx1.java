import java.awt.*;

class ScrollbarEx1 {

	ScrollbarEx1() {

		Frame f=new Frame("Scrollbar Example");

		Scrollbar s=new Scrollbar();

		s.setBounds(100,100,50,100);

		f.add(s);

		f.setSize(300,300);

		f.setLayout(null);

		f.setVisible(true);
	}

	public static void main(String []args) {

		new ScrollbarEx1();
	}
}