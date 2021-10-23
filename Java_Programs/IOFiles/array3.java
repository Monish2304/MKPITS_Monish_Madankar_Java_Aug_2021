import java.util.*;

class array3 {

	public static void main(String []args) {

		int[] arr=new int[5];

		Scanner scan=new Scanner(System.in);

		for(int i=0;i<5;i++) {

			System.out.print("Enter Marks of Subbject " + (1+i) + ":  ");

			arr[i]=scan.nextInt();
		}

		Calculate(arr); //passing array to calculate method
	}

	//creating calculate method

	static void Calculate(int marks[]) {

		int total=0;

		float per;

		for(int i:marks) {

			System.out.println("Marks = "+i);

			total = total + i;
		}

		per = (float)(total/500.0f)*100.0f;

		System.out.println("Total Marks: "+ total);

		System.out.println("Percentage: "+ per);
	}
}