class NestedFor2 {

	public static void main(String []args) {

		int row,col;

		for(row=1;row<=3;row++) {

			for(col=1;col<=3;col++) {

				System.out.print("  "+col+"  ");
			}

			System.out.println();
			System.out.println();
		}
	}
}