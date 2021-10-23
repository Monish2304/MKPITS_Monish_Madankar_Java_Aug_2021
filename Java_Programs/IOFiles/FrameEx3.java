import java.awt.*;

class FrameEx3 {

	FrameEx3() {

		Frame fr=new Frame();

		Button b1=new Button("ok");

		b1.setBounds(150,300,100,30);

		fr.setTitle("Java Page");

		fr.setLayout(null);

		fr.add(b1);

		fr.setSize(400,400);

		fr.setVisible(true);

	}

	public static void main(String []args) {

		FrameEx3 fr3=new FrameEx3();
	}
}