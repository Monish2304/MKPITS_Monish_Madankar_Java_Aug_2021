class NestedFor10 {

	public static void main(String []args) {

		int row=1,col=1;

		for(row=1;row<=3;row++) {

			for(col=1;col<=3;col++) {

				System.out.print("   "+row+"   ");
			}

			System.out.println();
			System.out.println();
		}
	}
}