import java.awt.*;

class Calculator {

	Calculator() {

		Frame fr=new Frame();

		TextField t1=new TextField();

		t1.setBounds(25,50,450,100);

		fr.add(t1);

		Button b1=new Button("7");

		b1.setBounds(25,170,80,60);

		fr.add(b1);

		Button b2=new Button("8");

		b2.setBounds(140,170,80,60);

		fr.add(b2);

		Button b3=new Button("9");

		b3.setBounds(260,170,80,60);

		fr.add(b3);

		Button b4=new Button("AC");

		b4.setBounds(380,170,80,60);

		fr.add(b4);

		Button b5=new Button("4");

		b5.setBounds(25,250,80,60);

		fr.add(b5);

		Button b6=new Button("5");

		b6.setBounds(140,250,80,60);

		fr.add(b6);

		Button b7=new Button("6");

		b7.setBounds(260,250,80,60);

		fr.add(b7);

		Button b8=new Button("---");

		b8.setBounds(380,250,80,60);

		fr.add(b8);

		Button b9=new Button("1");

		b9.setBounds(25,330,80,60);

		fr.add(b9);

		Button b10=new Button("2");

		b10.setBounds(140,330,80,60);

		fr.add(b10);

		Button b11=new Button("3");

		b11.setBounds(260,330,80,60);

		fr.add(b11);

		Button b12=new Button("+");

		b12.setBounds(380,330,80,140);

		fr.add(b12);

		Button b13=new Button("0");

		b13.setBounds(25,410,80,60);

		fr.add(b13);

		Button b14=new Button("00");

		b14.setBounds(140,410,80,60);

		fr.add(b14);

		Button b15=new Button(".");

		b15.setBounds(260,410,80,60);

		fr.add(b15);

		Button b16=new Button("%");

		b16.setBounds(25,490,80,60);

		fr.add(b16);

		Button b17=new Button("/");

		b17.setBounds(140,490,80,60);

		fr.add(b17);

		Button b18=new Button("*");

		b18.setBounds(260,490,80,60);

		fr.add(b18);

		Button b19=new Button("=");

		b19.setBounds(380,490,80,60);

		fr.add(b19);

		fr.setTitle("Calculator");

		fr.setLayout(null);

		fr.setSize(500,580);

		fr.setVisible(true);
	}

	public static void main(String []args) {

		Calculator cl=new Calculator();
	}
}