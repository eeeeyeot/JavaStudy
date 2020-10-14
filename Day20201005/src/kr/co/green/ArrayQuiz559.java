package kr.co.green;

import java.util.Scanner;

public class ArrayQuiz559
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		float[] scores = {85.6f, 79.5f, 83.1f, 80.0f, 78.2f, 75.0f};
		
		/*
		 * System.out.println(String.format("%.1f",
		 * (scores[sc.nextInt() - 1] + scores[sc.nextInt() - 1])));
		 */
		
		System.out.printf("%.1f", (scores[sc.nextInt() - 1] + scores[sc.nextInt() - 1]));
		
		sc.close();
	}
}