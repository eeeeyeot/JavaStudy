package day20201103;

import java.io.*;
import java.util.StringTokenizer;

public class ContinuousSum_1912
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] dp = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
				
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dp[0] = arr[0];
		int max = dp[0];
		for(int i = 1; i < arr.length; i++) {
			dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
			
			max = Math.max(dp[i], max);
		}
		
		System.out.println(max);
	}

}
