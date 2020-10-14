package day20201008;

import java.util.Scanner;

public class APlusB5_10952
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			if(num1 == 0 && num2 == 0) break;
			
			System.out.println(num1 + num2);
		}
		
		sc.close();
		
	}
}
