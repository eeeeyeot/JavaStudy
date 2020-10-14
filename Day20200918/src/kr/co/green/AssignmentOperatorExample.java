package kr.co.green;

public class AssignmentOperatorExample
{

	public static void main(String[] args)
	{
		/*
		 * int a,b,c;
		 * a = b = c = 5;
		 * System.out.println("a : " + a + "\nb : " + b + "\nc : " + c);
		 */
		
		int result = 0;
		result += 10;
		System.out.println("result : " + result);
		result -= 5;
		System.out.println("result : " + result);
		result *= 3;
		System.out.println("result : " + result);
		result /= 5;
		System.out.println("result : " + result);
		result %= 3;
		System.out.println("result : " + result);
	}

}
