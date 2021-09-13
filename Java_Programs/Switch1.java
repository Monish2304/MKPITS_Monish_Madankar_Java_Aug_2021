//wap to accept dayno (between 1 and 7) and then display dayname.
import java.util.*;
class Switch1
{
	public static void main(String []args)
	{
		int dayno;

		Scanner s=new Scanner(System.in);

		System.out.println("Enter datno (1-7): ");
		dayno = s.nextInt();

		switch(dayno)
		{
			case 1:
			System.out.println("Monday");
			break;
			case 2:
			System.out.println("Tuesday");
			break;
			case 3:
			System.out.println("Wednesday");
			break;
			case 4:
			System.out.println("Thursday");
			break;
			case 5:
			System.out.println("Friday");
			break;
			case 6:
			System.out.println("Saturday");
			break;
			case 7:
			System.out.println("Sunday");
			break;
			default:
			System.out.println("Invalid Dayno");
		}
	}
}