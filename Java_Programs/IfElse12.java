//wap to read temperature in centigrade and display a suitable message.

import java.util.*;

class IfElse12 {

	public static void main(String []args) {

		int temp;

		Scanner s=new Scanner(System.in);

		System.out.println("Enter Temperature in centigrade: ");
		temp = s.nextInt();

			if(temp<0) {

				System.out.println("It is a Freezing Weather");
			}

			else if(temp>=0 && temp<=10) {

				System.out.println("It is Very Cold Weather");
			}

			else if(temp>10 && temp<=20) {

				System.out.println("It is Cold Weather");
			}

			else if(temp>20 && temp<=30) {

				System.out.println("It is Normal Temperature");
			}

			else if(temp>30 && temp<=40) {

				System.out.println("It is Hot Temperature");
			}

			else {

				System.out.println("It is Very Very Hot Temperature");
			}
		}
	}