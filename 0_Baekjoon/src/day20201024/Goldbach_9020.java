package day20201024;

import java.util.Scanner;

public class Goldbach_9020
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[10001];
		
		for(int i = 1; i < arr.length; i++) {
			arr[i] = i;
		}
		
		for(int i = 2; i < arr.length; i++) {
			if(arr[i] == 0) continue;
			for(int j = i * 2; j < arr.length; j += i) {
				arr[j] = 0;
			}
		}
		
		for(int i = 0; i < n; i++) {
			int m = sc.nextInt();
			m /= 2;
			int cnt = 0;
			while(true) {
				if(arr[m - cnt] != 0 && arr[m + cnt] != 0)
				{
					System.out.println(arr[m - cnt] + " " + arr[m + cnt]);
					break;
				}
				cnt++;
			}
		}
		
		sc.close();
	}
}
