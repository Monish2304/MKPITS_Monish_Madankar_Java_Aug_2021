class ContinueEx
{
	public static void main(String []args)
	{
		int num[] = {1,2,3,4,5,6,7};

		for(int n : num)
		{
			if(n==3)
			{
				continue;
			}
			System.out.println("num = " + n);
		}
	}
}