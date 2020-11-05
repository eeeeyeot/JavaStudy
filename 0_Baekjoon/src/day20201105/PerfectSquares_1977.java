package day20201105;

import java.io.*;

public class PerfectSquares_1977
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int min = N;
		int sum = 0;
		int cnt = 0;
		for(int i = M; i <= N; i++) {
			if((int)Math.sqrt(i) == Math.sqrt(i)) {
				min = Math.min(min, i);
				cnt++;
				sum += i;
			}
		}
		
		if(cnt != 0) {
			System.out.println(sum);
			System.out.println(min);
		}
		else
			System.out.println(-1);
	}
}
