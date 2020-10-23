package day20201020;

import java.util.Scanner;

public class Method1_577
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		if(n > m) {
			n /= 2;
			m *= 2;
		}
		else {
			m /= 2;
			n *= 2;
		}
		
		System.out.println(n + " " + m);
		
		sc.close();
	}
}
