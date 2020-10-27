package day20201027;

import java.util.Scanner;

public class NumberTriangle_1641
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		sc.close();
		
		if(((n > 100 || n < 0) || n % 2 ==0) || (m > 3 || m < 1))
		{
			System.out.println("INPUT ERROR!");
			return;
		}
		
		switch(m) {
			case 1:
				int cnt = 0;
				for(int i = 0; i < n; i++) {
					for(int j = 0; j < i + 1; j++) {
						if(i % 2 == 0)
							System.out.print(++cnt + " ");
						else
							System.out.print(((i + 1) * (i + 1) + 1) - ++cnt + " ");
					}
					System.out.println();
				}
				break;
			case 2:
				for(int i = 0; i < n; i++) {
					for(int j = 1; j < n * 2 - i; j++) {
						if(j >= i + 1)
							System.out.print(i + " ");
						else
							System.out.print("  ");
					}
					System.out.println();
				}
				break;
			case 3:
				int value = 1;
				for(int i = 0; i < n; i++) {
					for(int j = 0; j < value; j++) {
						System.out.print((j + 1) + " ");
					}
					System.out.println();
					if(i >= n / 2) value--;
					else value++;
				}
				break;
		}
	}
}
