//wap to accept a character and then display whether it is vowel or not.
import java.util.*;
class Switch2
{
	public static void main(String []args)
	{
		char ch;

		Scanner s=new Scanner(System.in);

		System.out.println("Enter any Alphabet");
		ch = s.next().charAt(0);

		switch(ch)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			System.out.println("It is a vowel");
			break;
			default:
			System.out.println("It is not a vowel");
		}
	}
}