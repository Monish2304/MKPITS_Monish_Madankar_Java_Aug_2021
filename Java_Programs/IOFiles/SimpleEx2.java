import javax.swing.*;

public class SimpleEx2 {

	JFrame f;

	SimpleEx2() {

		JButton b=new JButton("click");

		b.setBounds(100,100,100,40);

		f.add(b);

		f.setSize(300,400);

		f.setLayout(null);

		f.setVisible(true);
	}

	public static void main(String []args) {

		new SimpleEx2();
	}
}