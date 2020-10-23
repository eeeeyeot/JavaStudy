package day20201020;

import java.util.Scanner;

public class Method1_576
{

	public static void main(String[] args)
	{
		Scanner		sc	= new Scanner(System.in);
		String[]	str	= sc.nextLine().split(" ");
		sc.close();
		try {
			calculator(str);
		}
		catch (NumberFormatException e) {
			System.out.println(0);
		}
	}

	static void calculator(String[] str)
	{
		int	num1	= Integer.parseInt(str[0]);
		int	num2	= Integer.parseInt(str[2]);
		int	result	= 0;

		if (str[1].equals("+"))
			result = num1 + num2;
		else if (str[1].equals("-"))
			result = num1 - num2;
		else if (str[1].equals("*"))
			result = num1 * num2;
		else if (str[1].equals("/"))
			result = num1 / num2;
		else
			result = 0;
		
		
		System.out.println(num1 + " " + str[1] + " " + num2 + " = " + result);
	}
}
