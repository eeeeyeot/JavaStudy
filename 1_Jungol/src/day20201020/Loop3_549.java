package day20201020;

import java.util.Scanner;

public class Loop3_549
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		int i = 1;
		int cnt = 0;
		while(sum < n) {
			if (i % 2 != 0) {
				sum += i;
				cnt++;
			}
			i++;
		}
		
		System.out.println(cnt + " " + sum);
		sc.close();
	}
}
