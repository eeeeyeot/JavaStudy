package kr.co.green;

import java.util.Scanner;

public class Factorial
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		if(num >= 0 && num <= 12)
			System.out.println(Facto(num));
		
		sc.close();
	}
	
	static int Facto(int num) {
		if(num <= 1)
			return 1;
		
		return num * Facto(num - 1);
	}
}
