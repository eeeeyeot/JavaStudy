package day20201102;

import java.io.*;

public class ClimbStairs_2579
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int[] cache = new int[T + 1];
		int[] f = new int[T + 1];
		
		for(int i = 1; i <= T; i++) {
			f[i] = Integer.parseInt(br.readLine());
		}
		
		cache[1] = f[1];
		if(T >= 2)
			cache[2] = f[1] + f[2];
		if(T >= 3)
			cache[3] = Math.max(f[1] + f[3], f[2] + f[3]);
		
		for(int i = 4; i <= T; i++) {
			cache[i] = Math.max(cache[i - 3] + f[i] + f[i - 1], cache[i - 2] + f[i]);
		}
		System.out.println(cache[T]);
	}
}
