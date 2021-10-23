import java.util.*;

class array2 {

	public static void main(String args[]) {

		int[] arr=new int[5];

		int total=0;

		float per;

		Scanner scan=new Scanner(System.in);

		for(int i=0;i<arr.length;i++) {

			System.out.print("Enter Subject Marks: ");

			arr[i]=scan.nextInt();
		}

		for(int i:arr) {

			System.out.println("Marks: "+i);

			total = total + i;
		}

		per = (float)(total/500.0f)*100.0f;

		System.out.println("Total Marks: "+ total);

		System.out.println("Percentage: "+ per);
	}
}