class NestedFor9 {

	public static void main(String []args) {

			int row,col;

			for(row=1;row<=3;row++) {

				for(col=1;col<=row;col++) {

					if(col==1) {

							System.out.print(" "+ col+" ");
						}

						else if(col==2) {

									System.out.print(" "+ (col+1)+" ");
								}

								else if(col==3) {

									System.out.print(" "+ (col+2)+" ");
								}
							}

							System.out.println();
						}
					}
				}