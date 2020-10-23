package day20201020;

import java.util.Scanner;

public class Loop3_149
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				while(++cnt % 2 == 0) {
					if(cnt >= 10) cnt = 0;
				}
				System.out.print(cnt + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
