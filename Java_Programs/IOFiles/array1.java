import java.util.*;

class array1 {

	public static void main(String args[]) {

		int[] arr=new int[5];

		int total=0;

		float per;

		Scanner scan=new Scanner(System.in);

		for(int i=0;i<5;i++) {

			System.out.print("Enter subject "+ i +" marks: ");

			arr[i]=scan.nextInt();
		}

		//display

		for(int i=0;i<arr.length;i++) {

			System.out.println("Marks = " + arr[i]);

			total = total + arr[i];
		}

		per = (float)(total/500.0f)*100.0f;

		System.out.println("Total marks: " + total);

		System.out.println("Percentage: " + per);
	}
}