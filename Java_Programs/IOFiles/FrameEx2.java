import java.awt.*;

class FrameEx2 extends Frame {

	FrameEx2() {

		Button b1=new Button("ok");

		b1.setBounds(150,300,100,30);

		setTitle("Java Page");

		setLayout(null);

		add(b1);

		setSize(400,400);

		setVisible(true);
	}

	public static void main(String []args) {

		FrameEx2 fr=new FrameEx2();
	}
}