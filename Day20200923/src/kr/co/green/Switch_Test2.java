package kr.co.green;

import java.util.Scanner;

public class Switch_Test2
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("연산자를 입력하세요");
		String operator = scanner.next();

		switch (operator)
		{
			case "+":
				System.out.println(5 + 5);
				break;
			case "-":
				System.out.println(5 - 5);
				break;
			case "*":
			case "x":
			case "X":
				System.out.println(5 * 5);
				break;
			case "/":
				System.out.println(5 / 5);
				break;
			case "%":
				System.out.println(5 % 5);
				break;
			default:
				System.out.println("연산자가 없습니다.");
		}
		
		scanner.close();
	}

}
