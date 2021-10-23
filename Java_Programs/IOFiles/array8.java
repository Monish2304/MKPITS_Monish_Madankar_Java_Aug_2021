import java.util.*;

class array8 {

	public static void main(String []args) {

		Scanner scan=new Scanner(System.in);

		int[][] arr=new int[3][3];

		for(int i=0;i<3;i++) {

			for(int j=0;j<3;j++) {

				System.out.print("Enter number: ");

				arr[i][j]=scan.nextInt();
			}
		}

		for(int i=0;i<3;i++) {

			for(int j=0;j<3;j++) {

				System.out.print(arr[i][j]+ " ");
			}

			System.out.println();
		}
	}
}