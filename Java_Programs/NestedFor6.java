class NestedFor6 {

	public static void main(String []args) {

		int row,col;

		for(row=3;row>0;row--) {

			for(col=1;col<=row;col++) {

				System.out.print("  "+col+"  ");
			}

			System.out.println();
			System.out.println();
		}
	}
}