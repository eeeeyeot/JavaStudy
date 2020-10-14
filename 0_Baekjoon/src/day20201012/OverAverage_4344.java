package day20201012;

import java.util.Scanner;

public class OverAverage_4344
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] arr;
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			arr = new int[sc.nextInt()];
			int sum = 0;
			for(int j = 0; j < arr.length; j++) {
				arr[j] = sc.nextInt();
				sum+= arr[j];
			}
			
			int cnt = 0;
			for(int j = 0; j < arr.length; j++) {
				if((sum / arr.length) < arr[j]) {
					cnt++;
				}
			}
			
			System.out.printf("%.3f", (double)cnt / arr.length * 100);
			System.out.println("%");
		}
		
		sc.close();
	}
}
