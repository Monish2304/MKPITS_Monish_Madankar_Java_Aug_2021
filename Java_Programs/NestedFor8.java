class NestedFor8 {

	public static void main(String []args) {

		int row,col;

		for(row=1;row<=3;row++) {

			for(col=3;col>=row;col--) {

				System.out.print("  "+row+"  ");
			}

			System.out.println();
			System.out.println();
		}
	}
}