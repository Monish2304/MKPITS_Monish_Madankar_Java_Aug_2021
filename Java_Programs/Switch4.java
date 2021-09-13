//wap to accept designation like m, c, p and display the ful designation
import java.util.*;
class Switch4
{
	public static void main(String []args)
	{
		char desig;

		Scanner s=new Scanner(System.in);

		System.out.println("Enter a Designation: ");

		desig = s.next().charAt(0);

		switch(desig)
		{
			case 'm':
			System.out.println("Manager");
			break;
			case 'c':
			System.out.println("Clerk");
			break;
			case 'p':
			System.out.println("Peon");
			break;
			default:
			System.out.println("Invalid Designation");
		}
	}
}