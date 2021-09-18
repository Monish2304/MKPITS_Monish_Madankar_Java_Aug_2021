//wap to accept a character and print whether it is vowel or not.
import java.util.*;

class DoWhile9 {

	public static void main(String []args) {

		char vowel='a';

		Scanner s=new Scanner(System.in);

		System.out.println("Enter an alphabet: ");
		vowel = s.next().charAt(0);

		do {

			switch(vowel)
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
			break;

		}
		}while(vowel=='z');
	}
}