package kr.co.green;

public class BitReverseOperatorExample
{

	public static void main(String[] args)
	{
		int		v1		= 10;
		int		v2		= ~v1;
		int		v3		= ~v1 + 1;
		
		int		v4		= -10;
		int		v5		= ~v4;
		int		v6		= ~v4 + 1;
		
		int[]	vArr1	=
		{ v1, v2, v3, v4, v5, v6 };

		printArray(vArr1);
	}

	public static String toBinaryString(int value)
	{
		String str = Integer.toBinaryString(value);
		while (str.length() < 32)
		{
			str = '0' + str;
		}

		return str;
	}

	public static void printArray(int arr[])
	{
		for (int i = 0; i < arr.length; i++)
		{
			if (i == (arr.length) / 2)
			{
				System.out.println();
			}
			System.out.println(toBinaryString(arr[i]) + " v" + (i + 1) + " 십진수 : " + arr[i]);

		}
	}

}
