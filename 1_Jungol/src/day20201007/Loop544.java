package day20201007;

import java.util.Scanner;

public class Loop544
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum = 0;
		for(int i = n; i <= 100; i ++) {
			sum += i;
		}
		
		System.out.println(sum);
		
		sc.close();
	}

}
