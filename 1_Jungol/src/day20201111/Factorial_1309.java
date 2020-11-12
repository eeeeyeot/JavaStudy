package day20201111;

import java.util.Scanner;

public class Factorial_1309
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(factorial(sc.nextInt()));
		
		sc.close();
	}
	
	static long factorial(long n) {
		if(n == 1) {
			System.out.println(n + "!" + " = " + n);
			return 1;
		}
		else
			System.out.println(n + "!" + " = " + n + " * " + (n - 1) + "!");
		
		return n * factorial(n - 1);
	}
}
