package day20201013;

import java.util.Scanner;

public class IsometricSquence2_1065
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		
		if(n < 100) {
			System.out.println(n);
		}
		else {
			result = 99;
			
			System.out.println(result);
		}
		
		sc.close();
	}
	static int checkHanNum(int n) {
		int num1 = n / 100 % 10;
		int num2 = n / 10 % 10;
		int num3 = n % 10;
		
		if(num2 * 2 == num1 + num3) {
			return 1;
		}
		
		return 0;
	}
}
