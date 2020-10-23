package day20201019;

import java.util.Scanner;

public class Loop2_545
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int mult3 = 0;
		int mult5 = 0;
		
		for(int i = 0; i < 10; i++) {
			int n = sc.nextInt();
			
			if(n % 3 == 0 && n != 0)
				mult3++;
			if(n % 5 == 0 && n != 0)
				mult5++;
		}
		
		System.out.println("Multiples of 3 : " + mult3);
		System.out.println("Multiples of 5 : " + mult5);
		
		sc.close();
	}
}
