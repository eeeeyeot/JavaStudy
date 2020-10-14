package kr.co.green;

public class ForMultiplicationExample
{

	public static void main(String[] args)
	{
		for (int i = 2; i <= 9; i++)
		{
			System.out.println("*** " + i + "단 ***");
			for (int j = 1; j <= 9; j++)
			{
				System.out.println(i + " * " + j + " = " +
						String.format("%2d", i * j));
			}
		}
	}
}