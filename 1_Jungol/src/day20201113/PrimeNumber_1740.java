package day20201113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber_1740
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[10001];
		
		for(int i = 1; i < arr.length; i++) {
			arr[i] = i;
		}
		
		for(int i = 2; i < arr.length; i++) {
			for(int j = i * 2; j < arr.length; j += i) {
				if(arr[j] == 0) continue;
				
				arr[j] = 0;
			}
		}
		
		int sum = 0;
		int min = 10000;
		
		for(int i = M; i <= N; i++) {
			if(arr[i] != 0 && arr[i] != 1)
			{
				sum += arr[i];
				min = Math.min(min, arr[i]);
			}
		}
		
		if(sum != 0) {
			System.out.println(sum);
			System.out.println(min);
		}
		else
			System.out.println(-1);
	}
}
