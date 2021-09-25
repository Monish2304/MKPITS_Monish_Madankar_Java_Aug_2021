class Calculate {

	static int cube(int n) {

		return n*n*n;
	}
}

class TestCube {

	public static void main(String []args) {

		Calculate c1=new Calculate();

		int result=Calculate.cube(2);

		System.out.println("Cube: " + result);
	}
}