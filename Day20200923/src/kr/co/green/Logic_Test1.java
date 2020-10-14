package kr.co.green;

import java.util.Scanner;

public class Logic_Test1
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요 >> ");
		int score = scanner.nextInt();
		
		if(score >= 90) {
			System.out.println("당신은 우등생입니다.");
		}
		
		scanner.close();
	}

}
