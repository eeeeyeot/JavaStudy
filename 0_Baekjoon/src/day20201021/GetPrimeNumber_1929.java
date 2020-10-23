package day20201021;

import java.io.*;
import java.util.StringTokenizer;

public class GetPrimeNumber_1929
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		int[] arr = new int[n + 1];
		
		for(int i = 1; i < arr.length; i++)
			arr[i] = i;
		
		for(int i = 2; i < arr.length; i++) {
			for(int j = i * 2; j < arr.length; j += i) {
				if(arr[j] == 0) continue;
				arr[j] = 0;
			}
		}
		
		for(int i = m; i <= n; i++) {
			if(arr[i] != 0 && arr[i] != 1)
				System.out.println(i);
		}
	}
}
