package day20201021;

import java.io.*;

public class Bertrand_4948
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		int[] arr = new int[123456 * 2 + 1];
		resetArray(arr);
		
		while((n = Integer.parseInt(br.readLine())) != 0) {
			int cnt = 0;
			for(int i = n + 1; i <= n * 2; i++) {
				if(arr[i] != 0 && arr[i] != 1) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
	
	static void resetArray(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			arr[i] = i;
		}
		
		for(int i = 2; i < arr.length; i++) {
			for(int j = i * 2; j < arr.length; j += i) {
				if(arr[j] == 0) continue;
				arr[j] = 0;
			}
		}
	}
}
