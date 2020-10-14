package kr.co.green;

public class Test2
{

	public static void main(String[] args)
	{
		//int result = add({95, 85, 90});
		@SuppressWarnings("unused")
		int result = add(new int[] {95, 85, 90});
	}

	static int add(int[] scores)
	{

		int sum = 0;

		for (int i = 0; i < scores.length; i++)
		{
			sum += scores[i];
		}
		
		return sum;
	}
}
