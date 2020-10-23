package kr.co.green;

import java.util.Scanner;

public class MultipleQuiz
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int	num1	= Integer.parseInt(sc.next());
		String num2 = sc.next();

		for (int i = num2.length() - 1; i >= 0; i--)
		{
			System.out.println((num2.charAt(i) - '0') * num1);
		}
		
		System.out.println(num1 * Integer.parseInt(num2));

		sc.close();
	}
}
