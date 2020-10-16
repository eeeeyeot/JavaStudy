package day20201016;

import java.util.Scanner;

public class Function3_587
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		recursive(n);
		
		sc.close();
	}

	static void recursive(int n) {
		if(n <= 0)
			return;
		
		recursive(n - 1);
		System.out.println("recursive");
	}
}
