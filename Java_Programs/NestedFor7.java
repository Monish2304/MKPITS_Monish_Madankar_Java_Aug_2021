class NestedFor7 {

	public static void main(String []args) {

		int row,col;

		for(row=4;row>0;row--) {

			for(col=1;col<=row;col++) {

				System.out.print("  "+'*'+"  ");
			}

			System.out.println();
			System.out.println();
		}
	}
}