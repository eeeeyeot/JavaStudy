package day20201008;

import java.util.Scanner;

public class Sum_8393
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(sum(n));
		
		sc.close();
	}
	
	static int sum(int n) {
		if(n <= 1) return 1;
		
		return n + sum(n-1);
	}
}
