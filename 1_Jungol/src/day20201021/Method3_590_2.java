package day20201021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Method3_590_2
{
	static int n;
	static int[] arr;
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		arr = new int[n + 1];
		arr[0] = 1;
		
		dice(1);
	}
	
	static void output() {
		for(int i = 1; i <= n; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
	}
	
	static void dice(int level) {
		if(level > n) {
			output();
			return;
		}
		
		for(int i = arr[level - 1]; i <= 6; i++) {
			arr[level] = i;
			dice(level + 1);
		}
	}
}
