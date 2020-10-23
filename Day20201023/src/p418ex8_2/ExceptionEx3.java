package p418ex8_2;

public class ExceptionEx3
{
	public static void main(String[] args)
	{

		int	num		= 100;
		int	result	= 0;

		for (int i = 0; i < 10; i++)
		{
			try {
				result = num / (int) (Math.random() * 100);
				System.out.println(result);
			}
			catch(ArithmeticException e) {
				System.out.println(0);
			}
		}

	}
}
