import java.awt.*;

public class CheckBoxExample {

	CheckBoxExample() {

		Frame f=new Frame("Checkbox Example");

		Checkbox cb1=new Checkbox("C++");

		cb1.setBounds(100,100,50,50);

		Checkbox cb2=new Checkbox("Java",true);

		cb2.setBounds(100,150,50,50);

		f.add(cb1);

		f.add(cb2);

		f.setSize(400,400);

		f.setLayout(null);

		f.setVisible(true);
	}

	public static void main(String []args) {

		new CheckBoxExample();
	}
}