//wap to print odd no between 1 and 10 using while loop.
class While6
{
	public static void main(String []args)
	{
		int num=1;

		while(num<=10)
		{
			if(num % 2 == 0)
			{
				System.out.println(+ num);
			}
			num++;
		}
	}
}