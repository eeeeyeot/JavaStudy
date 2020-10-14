package kr.co.green;

public class AccuracyExample1
{

	public static void main(String[] args)
	{
		String str = Double.toString((5/0.0));
		//String str = Integer.toString((int)(5/0.0));
		
		System.out.println(str);
		//System.out.println((5/0.0));
		System.out.println((5%0.0));
		
		
		/*
		 * int x = 5;
		 * int y = 0;
		 * try
		 * {
		 * int z = x / y;
		 * System.out.println("z : " + z);
		 * }
		 * catch(ArithmeticException e)
		 * {
		 * System.out.println("0으로 나누면 안됩니다");
		 * }
		 */
		
		
		/*
		 * int apple = 1;
		 * int totalPieces = apple * 10;
		 * int number = 7;
		 * int temp = totalPieces - number;
		 * double result = temp / 10.0;
		 * System.out.println("사과 한개에서");
		 * System.out.println("0.7조각을 빼면,");
		 * System.out.println(result + "조각이 남는다.");
		 */
		
	}

}
