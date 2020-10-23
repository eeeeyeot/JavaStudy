package day20201019;

import java.util.Scanner;

public class Loop3_141
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 1;
		int m = 0;
		while(true) {
			if(n * i >= 100)
				break;
			m = n * i++;
			System.out.print(m + " ");
			if(m % 10 == 0)
				break;
		}
		
		sc.close();
	}
}
