package day20201022;

import java.util.Scanner;

public class Method2_178
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum = 1;
		
		for(int i = 1; i <= n; i++) {
			sum *= 2;
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
