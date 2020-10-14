package day20201014;

import java.util.Scanner;

public class CharSquare1_1307
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int tmp;
		if(n * n > 26)
		{
			tmp = (n * n) % 26;
		}
		else {
			tmp = n * n;
		}
		tmp -= 1;
		
		for(int i = 0; i < n; i++) {
			for(int j = 1; j <= n; j++) {
				
				int ch = (tmp + n + 'A') - (n * j) - i;
				while(ch < 'A')
					ch = 'Z' - ('A' - ch) + 1;
				
				System.out.print((char)ch + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}