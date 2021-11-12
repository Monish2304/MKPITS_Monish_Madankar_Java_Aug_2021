import javax.swing.*;

public class SimpleEx {

	JFrame f;

	SimpleEx() {

		f=new JFrame();

		JButton b=new JButton("click");

		b.setBounds(130,100,100,40);

		f.add(b);

		f.setSize(300,300);

		f.setLayout(null);

		f.setVisible(true);
	}

	public static void main(String []args) {

		new SimpleEx();
	}
}