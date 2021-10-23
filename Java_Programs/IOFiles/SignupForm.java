import java.awt.*;

class SignupForm {

	SignupForm() {

		Frame fr=new Frame();

		Label l1=new Label("Signup Form");

		l1.setBounds(150,50,100,50);

		fr.add(l1);

		TextField t1=new TextField();

		t1.setBounds(30,100,140,30);

		fr.add(t1);

		Label l2=new Label("First Name");

		l2.setBounds(70,130,130,50);

		fr.add(l2);

		TextField t2=new TextField();

		t2.setBounds(180,100,140,30);

		fr.add(t2);

		Label l3=new Label("Last Name");

		l3.setBounds(220,130,130,50);

		fr.add(l3);

		Label l4=new Label("email id:");

		l4.setBounds(30,170,100,50);

		fr.add(l4);

		TextField t3=new TextField();

		t3.setBounds(150,180,150,30);

		fr.add(t3);

		Label l5=new Label("Mob No:");

		l5.setBounds(30,220,100,50);

		fr.add(l5);

		TextField t4=new TextField();

		t4.setBounds(150,230,150,30);

		fr.add(t4);

		Button b1=new Button("Signup");

		b1.setBounds(180,280,80,30);

		fr.add(b1);

		Label l6=new Label("Login");

		l6.setBounds(200,310,150,50);

		fr.add(l6);

		fr.setSize(400,400);

		fr.setLayout(null);

		fr.setVisible(true);
	}

	public static void main(String []args) {

		SignupForm sf=new SignupForm();
	}
}