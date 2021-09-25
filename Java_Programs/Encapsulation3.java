class Calculate {

	private float roi;

	private String name;

	public String getName() {

		return name;
	}

	public void setRoi(float roi) {

		this.roi=roi;
	}

	public float calinterest(float pa,int nom) {

		float pi = pa * roi * nom;

		return pi;
	}
}

class Encapsulation3 {

	public static void main(String []args) {

		Calculate c=new Calculate();

		c.setRoi(20);

		float ta = c.calinterest(1000,12);

		System.out.println("Total amount with interest = " + ta);
	}
}