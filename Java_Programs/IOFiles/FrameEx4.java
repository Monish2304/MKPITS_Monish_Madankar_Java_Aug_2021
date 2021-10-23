import java.awt.*;

class FrameEx4 {

	FrameEx4() {

		Frame fr=new Frame();

		Label l1=new Label("Java Login Page");

		l1.setBounds(130,50,100,30);

		fr.add(l1);

		Label l2=new Label("Signin Here");

		l2.setBounds(140,80,100,30);

		fr.add(l2);

		Label l3=new Label("Username: ");

		l3.setBounds(50,150,130,30);

		fr.add(l3);

		TextField t1=new TextField();

		t1.setBounds(150,150,180,30);

		fr.add(t1);

		Label l4=new Label("Password: ");

		l4.setBounds(50,200,130,30);

		fr.add(l4);

		TextField t2=new TextField();

		t2.setBounds(150,200,180,30);

		fr.add(t2);

		Button b1=new Button("Login");

		b1.setBounds(150,250,60,30);

		fr.add(b1);

		fr.setTitle("Java");

		fr.setLayout(null);

		fr.setSize(400,400);

		fr.setVisible(true);
	}

	public static void main(String []args) {

		FrameEx4 fr4=new FrameEx4();
	}
}
