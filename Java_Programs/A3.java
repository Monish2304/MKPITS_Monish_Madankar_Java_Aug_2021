class A3 {

	static int num;

	static {System.out.println("Static block is invoked");}

	public static void main(String []args) {

		System.out.println("Hello Main");

		System.out.println("num: " + num);
	}
}