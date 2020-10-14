package kr.co.green;

import java.util.Scanner;

public class MultipleQuiz
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String[] numbers = new String[2];
		
		for(int i = 0 ; i < numbers.length; i++) {
			numbers[i] = sc.next();
		}
		
		int num1 = Integer.parseInt(numbers[0]);
		String[] snum2 = numbers[1].split("");
		
		for(int i = snum2.length - 1 ; i >= 0; i--) {
			System.out.println(Integer.parseInt(snum2[i]) * num1);
		}
		System.out.println(Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]));
		
		sc.close();
	}
}
